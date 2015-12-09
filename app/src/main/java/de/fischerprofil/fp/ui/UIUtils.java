package de.fischerprofil.fp.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

public class UIUtils {

    public static void makeToast(Context context, String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    public static  class DialogBox extends AlertDialog.Builder {

        private Context context;


        public DialogBox(Context c) {
            super(c);
            context = c;
        }


        public DialogBox(Context context, String title, String message) {
            super(context);
            this.context = context;
            setMessage(message);
            setTitle(title);
            setCancelable(false);
            setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    dialog.dismiss(); // It's just for info so we don't really care what this does
                }
            });
        }
    }
}