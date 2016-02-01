package de.fischerprofil.fp.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
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

public class ContactListAdapter_ok extends ArrayAdapter<Kontakt> {

    private Context mContext;
    private View mView;
    private AppController mAppController;
    private final String VOLLEY_TAG = "VOLLEY_TAG_ContactListAdapter";
    private final String URL = RestUtils.getApiURL();

    public ContactListAdapter_ok(Context c, ArrayList<Kontakt> o) {
         super(c, R.layout.item_contactlist, o);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Kontakt kontakt = getItem(position);

        mAppController = AppController.getInstance();
        mContext = getContext();
        mView = convertView;

        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        if (convertView == null) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_contactlist, parent, false);

            // Viewholder an View anbinden
            viewHolder = new ViewHolder();
            viewHolder.ivIcon = (ImageView) convertView.findViewById(R.id.ivKontakt);
            viewHolder.tvPersonnr = (TextView) convertView.findViewById(R.id.tvPersonNr);
            viewHolder.tvKonkaktname = (TextView) convertView.findViewById(R.id.tvName);
            viewHolder.tvKdNr = (TextView) convertView.findViewById(R.id.tvKdNr);
            viewHolder.tvKTxt = (TextView) convertView.findViewById(R.id.tvKTxt);
            viewHolder.tvFunktion = (TextView) convertView.findViewById(R.id.tvFunktion);
            // Hier weitere Anbindungen hinzufuegen

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // Populate the data into the template view using the data object
        viewHolder.ivIcon.setImageResource(kontakt.getIcon());
        viewHolder.tvPersonnr.setText(kontakt.getPERSONNR());
        viewHolder.tvKonkaktname.setText(kontakt.getVORNAME() + " " +kontakt.getNAME());
        viewHolder.tvKTxt.setText(kontakt.getRELFIRMA_KTXT());
        viewHolder.tvKdNr.setText(kontakt.getFIRMANR());
        viewHolder.tvFunktion.setText("<Funktion: " + kontakt.getVERWENDUNG1() + ">");

        //callAPILookupFirmaFGKNZ2(URL + "/lookup?qry=RELZTNUM&tabname=PERSV1&result=ktxt&Sprache=de&ztkey=" + kontakt.getVERWENDUNG1(), viewHolder);
        // Hier weitere Zuweisungen hinzufuegen

        return convertView;
    }

    // View lookup cache
    private static class ViewHolder {
        ImageView ivIcon;
        TextView tvPersonnr;
        TextView tvKonkaktname;
        TextView tvKdNr;
        TextView tvKTxt;
        TextView tvFunktion;
        // Hier weitere Holder-Eigenschaften hinzufuegen
    }

    private void callAPILookupFirmaFGKNZ2(final String search, final ViewHolder viewHolder) {

        HttpsTrustManager.allowAllSSL();  // SSL-Fehlermeldungen ignorieren

        HttpsJsonObjectRequest req = new HttpsJsonObjectRequest(search, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {

                try {
                    Log.v("Volley Response:%n %s", response.toString(4));
                    JSONArray lookup = response.getJSONArray("lookup");
                    String s = viewHolder.tvFunktion.getText() + lookup.getJSONObject(0).getString("KTXT");
                    viewHolder.tvFunktion.setText(s);
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
