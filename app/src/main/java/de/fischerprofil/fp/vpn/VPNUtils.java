package de.fischerprofil.fp.vpn;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.net.URL;
import java.net.URLConnection;

public class VPNUtils {

    public static void makeToast(Context context, String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    public class checkServerConnection extends AsyncTask<String, Boolean, Boolean> {

        private Context mContext;

/*
        public void checkServerConnection (Context c) {
            mContext = c;
            this.execute("qw1");
        }
*/

        @Override
        protected Boolean doInBackground(String... params) {
            String s = params[0];
            Boolean ret = false;
            //isURLReachable(); //ok
            ret  = isConnectedToServer("http://222.222.222.60", 2000);
            Log.d("isConnectedToServer", ret.toString());
            publishProgress(ret);
            return ret;
        }
        @Override
        protected void onProgressUpdate(Boolean... values) {
            Log.d("isConnectedToServer", "onProgressUpdate(): " + values[0]);
        }

        @Override
        protected void onPostExecute(Boolean res) {

            super.onPostExecute(res);
            Log.d("isConnectedToServer", "onPostExecute(): " + res);
            if (res==false) {
                Toast.makeText(mContext, "Keine Serververbindung", Toast.LENGTH_SHORT).show();
                showVPN();
            }
        }

        private void showVPN() {

            try {
                PackageManager manager = mContext.getPackageManager();
                Intent intent = manager.getLaunchIntentForPackage("app.openconnect");
                //intent.putExtra("Fp", "upb ssl"); // zum direkten Öffenen der FP-Einstellungen, sonst weglassen
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); //TODO: wirklich notwendig ?
                mContext.startActivity(intent);
            }
            catch (Exception e)
            {
                e.printStackTrace();
                Toast.makeText(mContext, "Die VPN App ist nicht installiert", Toast.LENGTH_SHORT).show();
            }
        }

        private Boolean isConnectedToServer(String url, int timeout) {
            try{
                URL myUrl = new URL(url);
                URLConnection connection = myUrl.openConnection();
                connection.setConnectTimeout(timeout);
                connection.connect();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }
    }

}