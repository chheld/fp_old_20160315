package de.fischerprofil.fp.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ClipDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import de.fischerprofil.fp.AppController;
import de.fischerprofil.fp.R;
import de.fischerprofil.fp.StringUtils;
import de.fischerprofil.fp.ui.UIUtils;
import de.fischerprofil.fp.model.address.Adresse;
import de.fischerprofil.fp.model.contact.Kontakt;
import de.fischerprofil.fp.model.order.Auftrag;
import de.fischerprofil.fp.rest.HttpsJsonObjectRequest;
import de.fischerprofil.fp.rest.HttpsTrustManager;
import de.fischerprofil.fp.rest.RestUtils;

public  class OrderDetailsFragment extends Fragment {

    private AppController mAppController;
    private Context mContext;
    private View mView;
    private Auftrag mAuftrag;
    private ProgressBar progressBarAuftrag;
    private String mANr = "";
    private TextView tvVertreterName;
    private ProgressBar pbVertreter;
    private TextView tvLieferadresse;
    private ProgressBar pbLieferadresse;
    private final String VOLLEY_TAG = "VOLLEY_TAG_OrderDetailsFragment";
    private final String URL = RestUtils.getURL();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mAppController = AppController.getInstance();
        mContext = getActivity();
        mView = inflater.inflate(R.layout.fragment_orderdetails, container, false);
        progressBarAuftrag = (ProgressBar) mView.findViewById(R.id.progressBarAuftrag);

        mANr = getArguments().getString("anr");
        //if (mANr.equals("")) mANr = "400006"; // TEST

        // Auftragsinhalte: manuell laden ermöglichen
        RelativeLayout layout = (RelativeLayout)  mView.findViewById(R.id.container_auftrag);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callAPIOrderByANR(URL + "/orders?qry=byANr&anr=" + mANr);
            }
        });

        // Auftragsinhalte automatisch laden
        callAPIOrderByANR(URL+"/orders?qry=byANr&anr=" + mANr);

        return mView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //setHasOptionsMenu(false);
    }

    @Override
    public void onStop() {
        super.onStop();
        // This will tell to Volley to cancel all the pending requests
        mAppController.cancelPendingRequests(VOLLEY_TAG);
    }

    private void setColorStatusIcon(ImageView iv, int level) {
        ClipDrawable cdAB = (ClipDrawable) iv.getDrawable();
        cdAB.setLevel(cdAB.getLevel() + level); // min 0 - max 10000
    }

    private void callAPIContactsByPersonNr(String search) {

        pbVertreter.setVisibility(View.VISIBLE);

        HttpsTrustManager.allowAllSSL();  // SSL-Fehlermeldungen ignorieren

        HttpsJsonObjectRequest req = new HttpsJsonObjectRequest(search, new Response.Listener<JSONObject>() {
//            JsonObjectRequest req = new JsonObjectRequest(search, new Response.Listener<JSONObject>() {
        //VolleyJsonObjectRequestHigh req = new VolleyJsonObjectRequestHigh(search, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                try {
                    VolleyLog.v("Response:%n %s", response.toString(4));
                    JSONArray contact = response.getJSONArray("contacts");
                    JSONObject jsonA = contact.getJSONObject(0);
                    Gson gson = new Gson();
                    Kontakt kontakt = gson.fromJson(contact.getJSONObject(0).toString(), Kontakt.class);
                    String vname = kontakt.getVORNAME() + " ";
                    String nachname = kontakt.getNAME();
                    tvVertreterName.setText(vname + nachname);
                    pbVertreter.setVisibility(View.GONE);

                } catch (JSONException e) {
                    e.printStackTrace();
                    VolleyLog.e("Error: ", e.getMessage());
                    Toast.makeText(mContext, e.toString(), Toast.LENGTH_SHORT).show();
                    pbVertreter.setVisibility(View.GONE);

                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.e("Error: ", error.getMessage());
                Toast.makeText(mContext, error.toString(), Toast.LENGTH_SHORT).show();
                pbVertreter.setVisibility(View.GONE);
            }
        });
        req.setRetryPolicy(new DefaultRetryPolicy(3000, 3, 2));
        mAppController.addToRequestQueue(req, VOLLEY_TAG);
    }

    private void callAPIAdresseByAdresseNr(String search) {

        pbLieferadresse.setVisibility(View.VISIBLE);

        HttpsTrustManager.allowAllSSL();  // SSL-Fehlermeldungen ignorieren

        HttpsJsonObjectRequest req = new HttpsJsonObjectRequest(search, new Response.Listener<JSONObject>() {
//            JsonObjectRequest req = new JsonObjectRequest(search, new Response.Listener<JSONObject>() {
        //VolleyJsonObjectRequestHigh req = new VolleyJsonObjectRequestHigh(search, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                try {
                    VolleyLog.v("Response:%n %s", response.toString(4));
                    JSONArray address = response.getJSONArray("addresses");
                    Gson gson = new Gson();
                    Adresse adresse = gson.fromJson(address.getJSONObject(0).toString(), Adresse.class);
                    String adr1 = adresse.getZUSATZ1();
                    if (StringUtils.IsNotNullOrEmpty(adr1)) adr1 = adr1 + "\n";
                    String adr2 = adresse.getZUSATZ2();
                    if (StringUtils.IsNotNullOrEmpty(adr2)) adr2 = adr2 + "\n";
                    String str = adresse.getSTRASSE();
                    if (StringUtils.IsNotNullOrEmpty(str)) str = str + "\n";
                    String plz = adresse.getPLZORT();
                    if (StringUtils.IsNotNullOrEmpty(plz)) plz = plz + " ";
                    String ort = adresse.getORT();
                    tvLieferadresse.setText(adr1 + adr2 + str + plz + ort);
                    pbLieferadresse.setVisibility(View.GONE);

                } catch (JSONException e) {

                    e.printStackTrace();
                    VolleyLog.e("Error: ", e.getMessage());
                    Toast.makeText(mContext, e.toString(), Toast.LENGTH_SHORT).show();
                    pbLieferadresse.setVisibility(View.GONE);

                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.e("Error: ", error.getMessage());
                Toast.makeText(mContext, error.toString(), Toast.LENGTH_SHORT).show();
                pbLieferadresse.setVisibility(View.GONE);
            }
        });
        req.setRetryPolicy(new DefaultRetryPolicy(3000, 3, 2));
        mAppController.addToRequestQueue(req, VOLLEY_TAG);
    }

    private void callAPIOrderByANR(String search) {

        progressBarAuftrag.setVisibility(View.VISIBLE);

        HttpsTrustManager.allowAllSSL();  // SSL-Fehlermeldungen ignorieren

        HttpsJsonObjectRequest req = new HttpsJsonObjectRequest(search, new Response.Listener<JSONObject>() {
//            JsonObjectRequest req = new JsonObjectRequest(search, new Response.Listener<JSONObject>() {
        //VolleyJsonObjectRequestHigh req = new VolleyJsonObjectRequestHigh (search, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                try {
                    Log.v("Volley Response:%n %s", response.toString(4));
                    JSONArray orders = response.getJSONArray("orders");
                    Gson gson = new Gson();
                    mAuftrag = gson.fromJson(orders.getJSONObject(0).toString(), Auftrag.class);
                    setupLayout(mView);
                    progressBarAuftrag.setVisibility(View.GONE);  // Fortschritt ausblenden
                }
                catch (JSONException e) {
                    //e.printStackTrace();
                    Log.e("Volley Error: ", e.toString());
                    Toast.makeText(mContext, e.toString(), Toast.LENGTH_SHORT).show();
                    progressBarAuftrag.setVisibility(View.GONE);  // Fortschritt ausblenden
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Volley Error: ", error.toString());
                Toast.makeText(mContext, error.toString(), Toast.LENGTH_SHORT).show();
                progressBarAuftrag.setVisibility(View.GONE);  // Fortschritt ausblenden
            }
        }) ;
        req.setRetryPolicy(new DefaultRetryPolicy(3000, 3, 2));
        mAppController.addToRequestQueue(req,VOLLEY_TAG);
    }

    private void setupLayout(View view) {

        // Auftrag zuweisen
        TextView tvANr = (TextView) view.findViewById(R.id.tvANr);
        TextView tvBemerkung = (TextView) view.findViewById(R.id.tvName); //TODO: tvName in tvBemerkung ändern
        TextView tvBestellnummer = (TextView) view.findViewById(R.id.tvBestellnummer);
        TextView tvKommission = (TextView) view.findViewById(R.id.tvKommission);

        // Vertreter zuweisen
        pbVertreter = (ProgressBar) view.findViewById(R.id.progressBarVertreter);
        TextView tvVertr1 = (TextView) view.findViewById(R.id.tvVertreter1);
        tvVertreterName = (TextView) view.findViewById(R.id.tvVertreterName);

        // Status zuweisen
        TextView tvStatus2 = (TextView) view.findViewById(R.id.tvStatus2);
        TextView tvzDesc = (TextView) view.findViewById(R.id.tvZDesc);
        TextView tvSpezifizierung = (TextView) view.findViewById(R.id.tvSpezifizierung);

        // Termine zuweisen
        TextView tvKdWunschTermin = (TextView) view.findViewById(R.id.tvKdWunschTermin);
        TextView tvKdBestTermin = (TextView) view.findViewById(R.id.tvKdBestTermin);
        TextView tvProdPlanTermin = (TextView) view.findViewById(R.id.tvProdPlanTermin);
        TextView tvProdDispTermin = (TextView) view.findViewById(R.id.tvProdDispTermin);

        // Kunden zuweisen
        TextView tvKdNr = (TextView) view.findViewById(R.id.tvKdNr);
        TextView tvKTxt = (TextView) view.findViewById(R.id.tvKTxt);
        TextView tvKW = (TextView) view.findViewById(R.id.tvKW);
        TextView tvKJ = (TextView) view.findViewById(R.id.tvKJ);

        // Lieferanschrift zuweisen
        TextView tvLieferadresseNr = (TextView) view.findViewById(R.id.tvAdresseNr);
        pbLieferadresse = (ProgressBar) view.findViewById(R.id.progressBarLieferadresse);
        tvLieferadresse = (TextView) view.findViewById(R.id.tvLieferAdresse);

        //Summen zuweisen
        TextView tvNetto0 = (TextView) view.findViewById(R.id.tvNetto0);
        TextView tvGesamtrabatt = (TextView) view.findViewById(R.id.tvGesamtrabatt);
        TextView tvNetto1 = (TextView) view.findViewById(R.id.tvNetto1);
        TextView tvZusatzaufwand = (TextView) view.findViewById(R.id.tvZusatzaufwand);
        TextView tvNetto2 = (TextView) view.findViewById(R.id.tvNetto2);
        TextView tvUmsatzsteuer = (TextView) view.findViewById(R.id.tvUmsatzsteuer);
        TextView tvBrutto = (TextView) view.findViewById(R.id.tvBrutto);

        if (mAuftrag!=null) {

            // Auftrag anzeigen
            tvANr.setText("Auftrag " + mAuftrag.getANR());
            tvBemerkung.setText(mAuftrag.getBEMERKUNG());
            if(tvBemerkung.getText().toString().trim().length()==0)  tvBemerkung.setVisibility(View.GONE);
            tvBestellnummer.setText(mAuftrag.getBELEGNRBEST());
            if(tvBestellnummer.getText().toString().trim().length()==0) {
                tvBestellnummer.setVisibility(View.GONE);
            } else
            {
                tvBestellnummer.setText("Bestellung " + mAuftrag.getBELEGNRBEST());
            }
            tvKommission.setText(mAuftrag.getKOMM());
            if(tvKommission.getText().toString().trim().length()==0) {
                tvKommission.setVisibility(View.GONE);
            } else
            {
                tvKommission.setText("Kommission " + mAuftrag.getKOMM());
            }

            // Vertreter anzeigen
            tvVertr1.setText("Vertreter " + mAuftrag.getVERTRETER1());
            if(tvVertr1.getText().toString().trim().length()==0) {
                tvVertr1.setVisibility(View.GONE);
            }
            else
            {
                RelativeLayout layout = (RelativeLayout)  view.findViewById(R.id.container_vertreter);

                layout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        callAPIContactsByPersonNr(URL + "/contacts?qry=ContactlistByPersonnr&relperson__personnr=" + mAuftrag.getVERTRETER1());
                    }
                });

                callAPIContactsByPersonNr(URL + "/contacts?qry=ContactlistByPersonnr&relperson__personnr=" + mAuftrag.getVERTRETER1()); // '%' = %25
            }

            // Status anzeigen
            tvzDesc.setText(mAuftrag.getZDESC());
            if (tvzDesc.getText().toString().trim().length()==0)  tvzDesc.setVisibility(View.GONE);
            tvStatus2.setText(mAuftrag.getSTATUS2());
            if(tvStatus2.getText().toString().trim().length()==0)  tvStatus2.setVisibility(View.GONE);
            tvSpezifizierung.setText(mAuftrag.getSTATUS1());
            if(tvSpezifizierung.getText().toString().trim().length()==0)  tvSpezifizierung.setVisibility(View.GONE);
            if (mAuftrag.getSEGM2ZART()==191) setColorStatusIcon((ImageView) view.findViewById(R.id.ivAB), 10000);
            if (mAuftrag.getSEGM2ZART()==193) setColorStatusIcon((ImageView) view.findViewById(R.id.ivAB), 5000);
            if (mAuftrag.getSEGM4ZART()==211) setColorStatusIcon((ImageView) view.findViewById(R.id.ivLS), 10000);
            if (mAuftrag.getSEGM4ZART()==212) setColorStatusIcon((ImageView) view.findViewById(R.id.ivLS), 5000);
            if (mAuftrag.getSEGM5ZART()==220) setColorStatusIcon((ImageView) view.findViewById(R.id.ivENT), 10000);
            if (mAuftrag.getSEGM5ZART()==221) setColorStatusIcon((ImageView) view.findViewById(R.id.ivENT), 5000);
            if (mAuftrag.getSEGM6ZART()==231) setColorStatusIcon((ImageView) view.findViewById(R.id.ivRG), 10000);
            if (mAuftrag.getSEGM6ZART()==232) setColorStatusIcon((ImageView) view.findViewById(R.id.ivRG), 5000);

            // Termine anzeigen
            tvKdWunschTermin.setText(mAuftrag.getUSEINTREFFTERMIN()); //TODO: USEintreffTermin nicht in REST Abfrage ?
            if(tvKdWunschTermin.getText().toString().trim().length()==0) {
                tvKdWunschTermin.setVisibility(View.GONE);
                TextView lbl = (TextView) view.findViewById(R.id.lblKdWunschTermin);
                lbl.setVisibility(View.GONE);
            }

            tvKdBestTermin.setText(mAuftrag.getUSEINTREFFTBEST()); // USEintreffTBest
            if(tvKdBestTermin.getText().toString().trim().length()==0) {
                tvKdBestTermin.setVisibility(View.GONE);
                TextView lbl = (TextView) view.findViewById(R.id.lblKdBestTermin);
                lbl.setVisibility(View.GONE);
            }

            tvProdPlanTermin.setText(mAuftrag.getSEGM1TERM()); // Segm1.Term
            if(tvProdPlanTermin.getText().toString().trim().length()==0) {
                tvProdPlanTermin.setVisibility(View.GONE);
                TextView lbl = (TextView) view.findViewById(R.id.lblProdPlanTermin);
                lbl.setVisibility(View.GONE);
            }

            tvProdDispTermin.setText(mAuftrag.getSEGM2TERM()); // Segm2.Term
            if(tvProdDispTermin.getText().toString().trim().length()==0) {
                tvProdDispTermin.setVisibility(View.GONE);
                TextView lbl = (TextView) view.findViewById(R.id.lblProdDispTermin);
                lbl.setVisibility(View.GONE);
            }

            // Kunden anzeigen
            tvKdNr.setText("Kunde " + mAuftrag.getMNR());
            tvKTxt.setText(mAuftrag.getKTXT());
            if(tvKTxt.getText().toString().trim().length()==0)  tvKTxt.setVisibility(View.GONE);
            tvKW.setText(Integer.toString(mAuftrag.getKW()));
            tvKJ.setText(Integer.toString(mAuftrag.getKJ()));

            // Lieferadresse anzeigen
            tvLieferadresseNr.setText("Adresse " + mAuftrag.getADRNR2());
            if(tvLieferadresseNr.getText().toString().trim().length()==0) {
                tvLieferadresseNr.setVisibility(View.GONE);
            }
            else
            {
                RelativeLayout ly = (RelativeLayout) view.findViewById(R.id.container_lieferadresse);

                ly.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        callAPIAdresseByAdresseNr(URL + "/addresses?qry=AddressByAdresseNr&reladresse__adressenr=" + mAuftrag.getADRNR2());
                    }
                });
                callAPIAdresseByAdresseNr(URL + "/addresses?qry=AddressByAdresseNr&reladresse__adressenr=" + mAuftrag.getADRNR2());

                ImageButton img = (ImageButton) view.findViewById(R.id.btnMaps);

                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //callAPIAdresseByAdresseNr(URL + "/adresse/adressenr?where=" + mAuftrag.getADRNR2());
                        showMaps();
                    }
                });
            }

            //Summen anzeigen
            tvNetto0.setText(StringUtils.getGermanCurrencyFormat(mAuftrag.getACPPARTNETTO0()));
            tvGesamtrabatt.setText(StringUtils.getGermanCurrencyFormat(mAuftrag.getRABSUM()));
            tvNetto1.setText(StringUtils.getGermanCurrencyFormat(mAuftrag.getNETTO1()));
            tvZusatzaufwand.setText(StringUtils.getGermanCurrencyFormat(mAuftrag.getZSUM()));
            tvNetto2.setText(StringUtils.getGermanCurrencyFormat(mAuftrag.getNETTO2()));
            tvUmsatzsteuer.setText(StringUtils.getGermanCurrencyFormat(mAuftrag.getMWSTWERT()));
            tvBrutto.setText(StringUtils.getGermanCurrencyFormat(mAuftrag.getBRUTTO()));

        }
    }

/*
    private String getGermanCurrencyFormat(double value) {
        //TODO: in StringUTILS verschieben
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.GERMAN);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        return nf.format(value) + " EUR";
    }
*/

    private void showMaps() {

        UIUtils.makeToast(mContext, "TODO: Google Maps starten..."); //TEST

        Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");

        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(mContext.getPackageManager()) != null) {
            startActivity(mapIntent);
        }
        else {
            UIUtils.makeToast(mContext, "Google Maps ist nicht installiert!");
        }
    }
}