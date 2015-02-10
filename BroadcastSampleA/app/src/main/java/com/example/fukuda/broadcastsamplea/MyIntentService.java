package com.example.fukuda.broadcastsamplea;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p/>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class MyIntentService extends IntentService {

    /**
     * Starts this service to perform action Foo with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    public static void startActionBroadcast(Context context) {
        Intent intent = new Intent(context, MyIntentService.class);
        context.startService(intent);
    }

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        // do in background
        if (intent != null) {
            handleActionBroadcast();
        }
    }

    private void handleActionBroadcast() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }

        // send broadcast
        Intent intent = new Intent();
        intent.setAction("com.example.fukuda.broadcastsamplea.broadcastsample.BROADCAST_EVENT");
        sendBroadcast(intent);
    }

}
