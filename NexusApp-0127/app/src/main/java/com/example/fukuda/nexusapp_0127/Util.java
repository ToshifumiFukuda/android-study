package com.example.fukuda.nexusapp_0127;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by fukuda on 2015/01/27.
 */
public class Util {

    public static void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

}
