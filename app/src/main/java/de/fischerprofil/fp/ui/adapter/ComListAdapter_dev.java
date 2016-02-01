package de.fischerprofil.fp.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import de.fischerprofil.fp.AppController;
import de.fischerprofil.fp.R;
import de.fischerprofil.fp.model.communication.Kommunikation;
import de.fischerprofil.fp.rest.HttpsJsonObjectRequest;
import de.fischerprofil.fp.rest.HttpsTrustManager;
import de.fischerprofil.fp.rest.RestUtils;
import de.fischerprofil.fp.ui.UIUtils;

public class ComListAdapter_dev extends RecyclerView.Adapter<ComListAdapter_dev.ViewHolder> {

    private Context mContext;
    private View mView;
    private AppController mAppController;
    private final String VOLLEY_TAG = "VOLLEY_TAG_rvComListAdapter";
    private final String URL = RestUtils.getApiURL();
    private final String picURL = RestUtils.getPicURL();

    private ArrayList<Kommunikation> mDataset;

    public ComListAdapter_dev(Context c, ArrayList<Kommunikation> d) {

        mAppController = AppController.getInstance();

        mDataset = d;
        mContext = c;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ComListAdapter_dev.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

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

        Kommunikation current = mDataset.get(position);

        // Populate the data into the template view using the data object
        viewHolder.position = position;

        viewHolder.ivIcon.setImageResource(current.getIcon());
        viewHolder.tvKonkaktname.setText((current.getVORNAME() + " " + current.getNAME()).trim());
        viewHolder.tvPersonnr.setText(current.getPERSONNR());
        viewHolder.tvTelefonnummer.setText("Tel: <???>");

        //callAPILookupFirmaFGKNZ2(URL + "/lookup?qry=RELZTNUM&tabname=PERSV1&result=ktxt&Sprache=de&ztkey=" + current.getVERWENDUNG1(), viewHolder, position);

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

            //ivIcon = (ImageView) view.findViewById(R.id.ivKommunikation);
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

}
