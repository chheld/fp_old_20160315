package de.fischerprofil.fp.ui.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import de.fischerprofil.fp.R;

public class WWWFragment extends Fragment {
	
    String mURL = "http://222.222.222.60";
    private Activity mContext;

    public WWWFragment() {
        super();
        mContext = getActivity();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (savedInstanceState != null)
            mURL = savedInstanceState.getString("currentURL", "");

        if(!mURL.trim().equalsIgnoreCase("")){
            WebView myWebView = (WebView) getView().findViewById(R.id.webview);
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.setWebViewClient(new MyWebViewClient());
            myWebView.setWebChromeClient(new CustomWebChromeClient());
            myWebView.loadUrl(mURL);
        }
        setRetainInstance(true);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("currentURL", mURL);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_www, container, false);
        return rootview;
    }





    private class CustomWebChromeClient extends WebChromeClient{
        @Override
        public void onProgressChanged(    WebView view,    int newProgress){
            final ProgressBar progress=(ProgressBar)getView().findViewById(R.id.progressBar);
            progress.setProgress(newProgress);
            progress.setVisibility(View.VISIBLE);
            if (newProgress == 100) {
                progress.setVisibility(View.GONE);
            }
        }
    }





     private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            mURL = url;
            view.loadUrl(url);
            return true;
        }
        @Override
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            //Toast.makeText(mContext, "Oh no! " + description, Toast.LENGTH_SHORT).show();
        }
    }
 }
