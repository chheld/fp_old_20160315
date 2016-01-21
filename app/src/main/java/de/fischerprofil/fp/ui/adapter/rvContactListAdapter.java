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
    public void onBindViewHolder(ViewHolder holder, int position) {

        Kontakt current = mDataset.get(position);

        // beispiel
        //        holder.txtHeader.setOnClickListener(new View.OnClickListener() {
        //            @Override
        //            public void onClick(View v) {
        //                remove(name);
        //            }
        //        });


        // Populate the data into the template view using the data object
        holder.position = position;

        holder.ivIcon.setImageResource(current.getIcon());
        holder.tvKonkaktname.setText(current.getVORNAME() + " " + current.getNAME());
        holder.tvPersonnr.setText(current.getPERSONNR());
        holder.tvKdNr.setText(current.getFIRMANR());
        holder.tvKTxt.setText(current.getRELFIRMA_KTXT());
        holder.tvFunktion.setText("<Funktion: " + current.getVERWENDUNG1() + ">");

        // TODO: hier nachladen ?
        //if (holder.tvFunktion.getText().toString().substring(0,1) == "<")
        //    callAPILookupFirmaFGKNZ2(URL + "/lookup?qry=RELZTNUM&tabname=PERSV1&result=ktxt&Sprache=de&ztkey=" + current.getVERWENDUNG1(), holder, position);

        //ImageView imageView = (ImageView)convertView.findViewById(R.id.gallery_item_imageView);
//        Picasso.with(mContext).load("http://i.imgur.com/DvpvklR.png").into((ImageView) mView.findViewById(R.id.ivKontakt));
//        Picasso.with(mContext).load(R.drawable.ic_contacts).into(holder.ivIcon);
         //   Picasso.with(mContext).load(R.drawable.ic_default).into(holder.ivIcon); //TEST

    }
    @Override
    public int getItemCount() {

        return mDataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

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
        }
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
                    if (viewHolder.position == pos) viewHolder.tvFunktion.setText(s);
                }
                catch (JSONException e) {
                    Log.e("Volley Error: ", e.toString());
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

}
