package de.fischerprofil.fp.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.LruCache;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import de.fischerprofil.fp.AppController;
import de.fischerprofil.fp.R;
import de.fischerprofil.fp.model.contact.Kontakt;
import de.fischerprofil.fp.rest.HttpsJsonObjectRequest;
import de.fischerprofil.fp.rest.HttpsTrustManager;
import de.fischerprofil.fp.rest.RestUtils;
import de.fischerprofil.fp.rest.TrustModifier;
import de.fischerprofil.fp.ui.UIUtils;

public class ContactListAdapter extends RecyclerView.Adapter<ContactListAdapter.ViewHolder> {

    private Context mContext;
    private View mView;
    private AppController mAppController;
    private final String VOLLEY_TAG = "VOLLEY_TAG_rvContactListAdapter";
    private final String URL = RestUtils.getApiURL();
    private final String picURL = RestUtils.getPicURL();

    private ArrayList<Kontakt> mDataset;

    public ContactListAdapter(Context c, ArrayList<Kontakt> d) {

        mAppController = AppController.getInstance();

        mDataset = d;
        mContext = c;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ContactListAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

//        Context context = parent.getContext();
        //mContext = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(mContext);

        // Inflate the custom layout
        View mView = inflater.inflate(R.layout.cardview_contactlist, viewGroup, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(mView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        Kontakt current = mDataset.get(position);

        // Populate the data into the template view using the data object
        viewHolder.position = position;

        viewHolder.ivIcon.setImageResource(current.getIcon());
        viewHolder.tvKonkaktname.setText((current.getVORNAME() + " " + current.getNAME()).trim());
        viewHolder.tvPersonnr.setText(current.getPERSONNR());
        viewHolder.tvKdNr.setText(current.getFIRMANR());
        viewHolder.tvKTxt.setText(current.getRELFIRMA_KTXT());
        viewHolder.tvFunktion.setText("Funktion: " + current.getVERWENDUNG1());
        //viewHolder.tvFuntionstext.setText("<Funktionsbeshreibung>");
        viewHolder.tvTelefonnummer.setText("Tel: <???>");

        callAPILookupFirmaFGKNZ2(URL + "/lookup?qry=RELZTNUM&tabname=PERSV1&result=ktxt&Sprache=de&ztkey=" + current.getVERWENDUNG1(), viewHolder, position);

        // TEST für picasso
        Picasso picasso = buildPicasso(mContext);
        picasso.load(picURL + "/contact.png").into(viewHolder.ivIcon);
    }

    @Override
    public int getItemCount() {

        return mDataset.size();
    }

    private void callAPILookupFirmaFGKNZ2(final String search, final ViewHolder viewHolder, final Integer pos) {

        HttpsTrustManager.allowAllSSL();  // SSL-Fehlermeldungen ignorieren

        HttpsJsonObjectRequest req = new HttpsJsonObjectRequest(search, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {

                try {
                    Log.v("Volley Response:%n %s", response.toString(4));
                    JSONArray lookup = response.getJSONArray("lookup");
                    String s = lookup.getJSONObject(0).getString("KTXT");
                    String sp = pos + "=" + viewHolder.position;
                    //viewHolder.tvFunktion.setText(pos + "=" + viewHolder.position);
                    if (viewHolder.position == pos) {
                        viewHolder.tvFunktion.setText("Funktion: " + s);
                    }

                }
                catch (JSONException e) {
                    Log.e("JSON Error: ", e.toString());
                    Toast.makeText(mContext, e.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Volley Error: ", error.toString());
                Toast.makeText(mContext, error.toString(), Toast.LENGTH_SHORT).show();
            }
        }) ;
        req.setRetryPolicy(new DefaultRetryPolicy(3000, 3, 2));
        mAppController.addToRequestQueue(req,VOLLEY_TAG);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //static statt public wg speicher-probs

        public Integer position;

        public ImageView ivIcon;
        public TextView tvPersonnr;
        public TextView tvKonkaktname;
        public TextView tvKdNr;
        public TextView tvKTxt;
        public TextView tvFunktion;

        public TextView tvFuntionstext;
        public TextView tvTelefonnummer;


        public ViewHolder(View view) {
            super(view);

            ivIcon = (ImageView) view.findViewById(R.id.ivKontakt);
            tvPersonnr = (TextView) view.findViewById(R.id.tvPersonNr);
            tvKonkaktname = (TextView) view.findViewById(R.id.tvName);
            tvKdNr = (TextView) view.findViewById(R.id.tvKdNr);
            tvKTxt = (TextView) view.findViewById(R.id.tvKTxt);
            tvFunktion = (TextView) view.findViewById(R.id.tvFunktion);

            //tvFuntionstext = (TextView) view.findViewById(R.id.tvFuntionstext);
            tvTelefonnummer = (TextView) view.findViewById(R.id.tvTelefonnummer);

            //TODO: intent contact details beim klicken anzeigen
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), tvPersonnr.getText(), Toast.LENGTH_SHORT).show();
                }
            });

            // wenn keine Nummer hinterlegt, ausblenden
            ImageButton img = (ImageButton) view.findViewById(R.id.btnCall);
            if (tvTelefonnummer.getText().toString()!="") {
                img.setVisibility(View.VISIBLE);
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showCaller(v, tvTelefonnummer.getText().toString());
                    }
                });
            }
            else {
                img.setVisibility(View.GONE);
            }
        }
        private void showCaller(View v, String nr) {

           // UIUtils.makeToast(v.getContext(), "Starte Telefon-App ...");

            String uri = "tel:" + nr.replaceAll("[^0-9|\\+]", "");
            ImageButton img = (ImageButton) v.findViewById(R.id.btnCall);

            try {
                if (nr != null && nr != "") {
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "02737508174"));
                    v.getContext().startActivity(intent);
                } else {
                    img.setVisibility(View.GONE);
                }
            }
            catch (Exception e) {
                UIUtils.makeToast(v.getContext(), "Telefonat kann nicht geführt werden");
            }
        }
    }

    public Picasso buildPicasso(Context context){

        OkHttpClient httpClient = TrustModifier.createAcceptAllClient();

        String username = AppController.preferences.getString( "username", "oh no" );
        String pw = AppController.preferences.getString("password", "oh no");
        String credentials = username + ":" + pw;
        final String encodedCredentials = Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);

        httpClient.interceptors().add(new Interceptor() {

            @Override
            public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                com.squareup.okhttp.Request.Builder newRequest = chain.request().newBuilder();
                newRequest.header("Authorization","Basic " + encodedCredentials );
                return chain.proceed(newRequest.build());
            }
        });

        Picasso picasso = new Picasso.Builder(context)
                .downloader(new OkHttpDownloader(httpClient))
                .memoryCache(new LruCache(context))
                .build();

        return picasso;
    }


}
