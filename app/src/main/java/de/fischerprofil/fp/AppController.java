package de.fischerprofil.fp;

import android.app.Application;
import android.text.TextUtils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.Volley;


public class AppController extends Application {

    /**
     * Log or request VOLLEY_PATTERNS
     */
    public static final String VOLLEY_PATTERNS = "VolleyPatterns";

    /**
     * Global request queue for Volley
     */
    private RequestQueue mRequestQueue;

    /**
     * A singleton instance of the application class for easy access in other places
     */
    private static AppController sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        // initialize the singleton
        sInstance = this;
    }

    /**
     * @return AppController singleton instance
     */
    public static synchronized AppController getInstance() {
        return sInstance;
    }

    /**
     * @return The Volley Request queue, the queue will be created if it is null
     */
    public RequestQueue getRequestQueue() {
        // lazy initialize the request queue, the queue instance will be
        // created when it is accessed for the first time
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return mRequestQueue;
    }

    /**
     * Adds the specified request to the global queue, if tag is specified
     * then it is used else Default VOLLEY_PATTERNS is used.
     *
     * @param req
     * @param tag
     */
    public <T> void addToRequestQueue(Request<T> req, String tag) {
        // set the default tag if tag is empty
        req.setTag(TextUtils.isEmpty(tag) ? VOLLEY_PATTERNS : tag);
        VolleyLog.d("Adding request to queue: %s", req.getUrl());
        //req.setRetryPolicy(new DefaultRetryPolicy(3000, 1, 2));
        getRequestQueue().add(req);
    }

    /**
     * Adds the specified request to the global queue using the Default VOLLEY_PATTERNS.
     *
     * @param req
     */
    public <T> void addToRequestQueue(Request<T> req) {
        // set the default tag if tag is empty
        req.setTag(VOLLEY_PATTERNS);
        getRequestQueue().add(req);
    }

    /**
     * Cancels all pending requests by the specified VOLLEY_PATTERNS, it is important
     * to specify a VOLLEY_PATTERNS so that the pending/ongoing requests can be cancelled.
     *
     * @param tag
     */
    public void cancelPendingRequests(Object tag) {
        if (mRequestQueue != null) {
            mRequestQueue.cancelAll(tag);
        }
    }
}