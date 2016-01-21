package de.fischerprofil.fp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import de.fischerprofil.fp.model.contact.Kontakt;
import de.fischerprofil.fp.rest.HttpsJsonObjectRequest;
import de.fischerprofil.fp.rest.HttpsTrustManager;
import de.fischerprofil.fp.rest.RestUtils;

public class rvContactListAdapter extends RecyclerView.Adapter<rvContactListAdapter.ViewHolder> {

    private Context mContext;
    private View mView;
    private AppController mAppController;
    private final String VOLLEY_TAG = "VOLLEY_TAG_rvContactListAdapter";
    private final String URL = RestUtils.getURL();

    private ArrayList<Kontakt> mDataset;

    public rvContactListAdapter(Context c, ArrayList<Kontakt> d) {

        mAppController = AppController.getInstance();

        mDataset = d;
        mContext = c;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public rvContactListAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

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

        callAPILookupFirmaFGKNZ2(URL + "/lookup?qry=RELZTNUM&tabname=PERSV1&result=ktxt&Sprache=de&ztkey=" + current.getVERWENDUNG1(), viewHolder, position);

        //Picasso.with(mContext).load(R.drawable.ic_default).resize(100, 100).into(holder.ivIcon); //TEST

        //viewHolder.itemView.(new View.OnClickListener()
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

    static class ViewHolder extends RecyclerView.ViewHolder {
        //static statt public wg speicher-probs

        public Integer position;

        public ImageView ivIcon;
        public TextView tvPersonnr;
        public TextView tvKonkaktname;
        public TextView tvKdNr;
        public TextView tvKTxt;
        public TextView tvFunktion;

        public ViewHolder(View view) {
            super(view);

            ivIcon = (ImageView) view.findViewById(R.id.ivKontakt);
            tvPersonnr = (TextView) view.findViewById(R.id.tvPersonNr);
            tvKonkaktname = (TextView) view.findViewById(R.id.tvName);
            tvKdNr = (TextView) view.findViewById(R.id.tvKdNr);
            tvKTxt = (TextView) view.findViewById(R.id.tvKTxt);
            tvFunktion = (TextView) view.findViewById(R.id.tvFunktion);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //TODO: intent contact details
                    Toast.makeText(v.getContext(), "test", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
