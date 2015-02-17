package com.example.fukuda.broadcastsampleb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("hoge", "getAction: " + intent.getAction());

        Intent activity = new Intent();
        activity.setClass(context, MainActivity.class);
        activity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.putExtra("textview", intent.getStringExtra("edittext"));

        context.startActivity(activity);
    }
}
