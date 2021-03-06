package br.com.wolneyhqf.aulas.appcbr.util;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by wolney on 03/01/17.
 */

public class AlertUtil {

    public static ProgressDialog getProgressDialog(Context context, String title, String message){
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(title);
        progressDialog.setMessage(message);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public static void toast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
