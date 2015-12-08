package de.fischerprofil.fp;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.Volley;

public class AppController extends Application {

    public static SharedPreferences preferences;
    public static Boolean inEmulatorMode;

    public static final String VOLLEY_PATTERNS = "VolleyPatterns";

    private RequestQueue mRequestQueue;

    private static AppController sInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        sInstance = this;
        preferences = getSharedPreferences( getPackageName() + "_preferences", MODE_PRIVATE);
        inEmulatorMode = "generic".equals(Build.BRAND.toLowerCase());
    }

    public static synchronized AppController getInstance() {
        return sInstance;
    }

    public RequestQueue getRequestQueue() {
        // lazy initialize the request queue, the queue instance will be
        // created when it is accessed for the first time
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return mRequestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req, String tag) {
        // set the default tag if tag is empty
        req.setTag(TextUtils.isEmpty(tag) ? VOLLEY_PATTERNS : tag);
        VolleyLog.d("Adding request to queue: %s", req.getUrl());
        //req.setRetryPolicy(new DefaultRetryPolicy(3000, 1, 2));
        getRequestQueue().add(req);
    }

    public <T> void addToRequestQueue(Request<T> req) {
        // set the default tag if tag is empty
        req.setTag(VOLLEY_PATTERNS);
        getRequestQueue().add(req);
    }

    public void cancelPendingRequests(Object tag) {
        if (mRequestQueue != null) {
            mRequestQueue.cancelAll(tag);
        }
    }
}