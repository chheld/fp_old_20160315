package de.fischerprofil.fp.rest;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

/**
 * Created by held on 29.09.2015.
 */
public class VolleyJsonObjectRequestHigh extends JsonObjectRequest {

    Request.Priority mPriority;

    public VolleyJsonObjectRequestHigh(String url, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        super(url, listener, errorListener);
        this.setShouldCache(true);
        this.setPriority(Priority.HIGH);
    }


    public void setPriority(Request.Priority priority) {
        mPriority = priority;
    }

    @Override
    public Request.Priority getPriority() {
        // If you didn't use the setPriority method,
        // the priority is automatically set to HIGH

/*
        Priority.LOW // images, thumbnails, ...
        Priority.NORMAL // residual
        Priority.HIGH // descriptions, lists, ...
        Priority.IMMEDIATE // login, logout, ...
*/

        return mPriority != null ? mPriority : Priority.HIGH;
    }

}
