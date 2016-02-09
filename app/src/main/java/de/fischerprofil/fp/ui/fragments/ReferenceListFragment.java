package de.fischerprofil.fp.ui.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import de.fischerprofil.fp.AppController;
import de.fischerprofil.fp.R;
import de.fischerprofil.fp.adapter.GalleryAdapter;
import de.fischerprofil.fp.model.contact.Kontaktliste;
import de.fischerprofil.fp.model.reference.ImageModel;
import de.fischerprofil.fp.rest.HttpsJsonObjectRequest;
import de.fischerprofil.fp.rest.HttpsJsonTrustManager;
import de.fischerprofil.fp.rest.RestUtils;
import de.fischerprofil.fp.ui.UIUtils;


@SuppressLint("ValidFragment")
public class ReferenceListFragment extends Fragment {

    private AppController mAppController;
    private Context mContext;
    private Kontaktliste mKontaktliste = new Kontaktliste();
    private GalleryAdapter mAdapter;
    private int mSearchRequestCounter = 0;      // Zaehler fuer die http-Anfragen
    private String mSearchString;
    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private final String VOLLEY_TAG = "VOLLEY_TAG_ReferenceListFragment";
    private final String URL = RestUtils.getApiURL();

    ArrayList<ImageModel> data = new ArrayList<>();

    // TEST daten
    public static String IMGS[] = {
            "https://222.222.222.60/api/../pics/picture.png",
            "https://222.222.222.60/api/../pics/24010101.jpg",
            "https://222.222.222.60/api/../pics/24010101.jpg",
            "https://222.222.222.60/api/../pics/H+\u00c2hne_Kaltenkirchen_42k.JPG",
            "https://222.222.222.60/api/../pics/H+\u00c2hne_Kaltenkirchen_43k.JPG",
            "https://222.222.222.60/api/../pics/H+\u00c2hne_Kaltenkirchen_46k.JPG",
            "https://222.222.222.60/api/../pics/H+\u00c2hne_Kaltenkirchen_57k Retusche.jpg",
            "https://222.222.222.60/api/../pics/H+\u00c2hne_Kaltenkirchen_59k.JPG",
            "https://222.222.222.60/api/../pics/H+\u00c2hne_Kaltenkirchen_63k.JPG",
            "https://222.222.222.60/api/../pics/H+\u00c2hne_Kaltenkirchen_64k.JPG",
            "https://222.222.222.60/api/../pics/H+\u00c2hne_Kaltenkirchen_65k.JPG",
            "https://222.222.222.60/api/../pics/H+\u00c2hne_Kaltenkirchen_66k.JPG",
            "https://222.222.222.60/api/../pics/IRXX-152_1.jpg",
            "https://222.222.222.60/api/../pics/IRXX-164.jpg",
            "https://222.222.222.60/api/../pics/IRXX-197.jpg",
            "https://222.222.222.60/api/../pics/IRXX-360.jpg",
            "https://222.222.222.60/api/../pics/IRXX-476.jpg",
            "https://222.222.222.60/api/../pics/IRXX-58.jpg",
            "https://222.222.222.60/api/../pics/picture.png"
    };

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            //TODO: Restore the fragment's state here
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //TODO: Save the fragment's state here
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mContext = getActivity();
        mAppController = AppController.getInstance();

        View view = inflater.inflate(R.layout.fragment_recycleview_referencelist, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new GridLayoutManager(mContext, 3));
        mRecyclerView.setHasFixedSize(true);

        mSwipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_conctactlist_container);
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                doSearch(mSearchString);
            }
        });

        mSearchString = getArguments().getString("search", null); // evtl. übergebene SUCH-Parameter ermitteln
        if (mSearchString != null) doSearch(mSearchString);

        return view;
    }

    @Override
    public void onStop() {
        super.onStop();
        // This will tell to Volley to cancel all the pending requests
        mAppController.cancelPendingRequests(VOLLEY_TAG);
    }

    private void doSearch(String search) {

        if (search.length() < 1) {
            Toast.makeText(mContext, "Mindestens 2 Zeichen eingeben", Toast.LENGTH_SHORT).show();
        } else {
            UIUtils.makeToast(mContext, "Suche '" + search + "'");

            // TEST daten laden
            for (int i = 0; i < IMGS.length; i++) {
                ImageModel imageModel = new ImageModel();
                imageModel.setName("Image " + i);
                imageModel.setUrl(IMGS[i]);
                data.add(imageModel);
            }

            //Adapter erzeugen und zuweisen
            mAdapter = new GalleryAdapter(mContext, data);
            mRecyclerView.setAdapter(mAdapter);

/*
            showProgressCircle(mSwipeRefreshLayout, true);

            // start http requests
            mSearchRequestCounter = 0;
            callAPIContactsByPersonNr(URL + "/contacts?relperson__personnr=" + RestUtils.cleanURL(search) + "%25"); // '%' = %25
            callAPIContactsByFirmaNr(URL + "/contacts?relfirma__firmanr=" + RestUtils.cleanURL(search) + "%25"); // '%' = %25
            callAPIContactsByFirmaKTxt(URL + "/contacts?relfirma__ktxt=" + RestUtils.cleanURL(search) + "%25"); // '%' = %25
            callAPIContactsByName(URL + "/contacts?relperson__name=" + RestUtils.cleanURL(search) + "%25"); // '%' = %25
            callAPIContactsByName(URL + "/contacts?relperson__vorname=" + RestUtils.cleanURL(search) + "%25"); // '%' = %25
*/
        }
    }

    private void callAPIImageByName(String search) {

        // Increase counter for pending search requests
        mSearchRequestCounter++;

        HttpsJsonTrustManager.allowAllSSL();  // SSL-Fehlermeldungen ignorieren

        HttpsJsonObjectRequest req = new HttpsJsonObjectRequest(search, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                try {
                    VolleyLog.v("Response:%n %s", response.toString(4));
                    JSONArray contacts = response.getJSONArray("contacts");
                    mKontaktliste.add(contacts);
                    mAdapter.notifyDataSetChanged();
                    mSearchRequestCounter--;
                    if (mSearchRequestCounter < 1) {
                        //mProgressBar.setVisibility(View.GONE);  // Fortschritt ausblenden
                        showProgressCircle(mSwipeRefreshLayout, false);
                        Toast.makeText(mContext, contacts.length() + " Einträge gefunden", Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    //mProgressBar.setVisibility(View.GONE);  // Fortschritt ausblenden
                    showProgressCircle(mSwipeRefreshLayout, false);
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.e("Error: ", error.getMessage());
                Toast.makeText(mContext, error.toString(), Toast.LENGTH_SHORT).show();
                mSearchRequestCounter--;
                //if (mSearchRequestCounter < 1) mProgressBar.setVisibility(View.GONE);  // Fortschritt ausblenden
                if (mSearchRequestCounter < 1) showProgressCircle(mSwipeRefreshLayout, false); // Fortschritt ausblenden
            }
        });
        req.setRetryPolicy(new DefaultRetryPolicy(3000, 3, 2));
        AppController.getInstance().addToRequestQueue(req,VOLLEY_TAG);
    }

    private void showProgressCircle(final SwipeRefreshLayout s, final Boolean v) {
        s.setColorSchemeResources(
                R.color.settings_color);
        s.post(new Runnable() {
            @Override public void run() {
                s.setRefreshing(v);
            }
        });
    }
}


