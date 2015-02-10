package com.example.fukuda.broadcastsamplea;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.button)).setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private static final String ACTION_BROADCAST_EVENT =
            "com.example.fukuda.broadcastsamplea.broadcastsample"
                    + ".BROADCAST_EVENT";

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button: {
                Intent intent = new Intent();
                intent.setAction(ACTION_BROADCAST_EVENT);
                intent.putExtra("edittext", ((EditText)findViewById(R.id.edittext)).getText().toString());
                sendBroadcast(intent);
                break;
            }
            case R.id.button2: {
                // TODO: Serviceの呼び出し
                MyIntentService.startActionBroadcast(getApplicationContext());
                break;
            }
        }

        /*
        Intent intent = new Intent();
        intent.setAction(ACTION_BROADCAST_EVENT);
        sendBroadcast(intent);
        */
    }
}
