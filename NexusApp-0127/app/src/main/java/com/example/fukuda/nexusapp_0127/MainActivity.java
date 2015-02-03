package com.example.fukuda.nexusapp_0127;

import android.content.Intent;
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

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
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

    private static final int RESULT_CODE_1 = 1;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case RESULT_CODE_1: {
                switch (resultCode) {
                    case RESULT_OK: {
//                        Util.showToast(getApplicationContext(), "RESULT_OK");
                        String text = data.getStringExtra(MainActivity2.KEY_INTENT_DATA_RETURNTEXT);
                        Util.showToast(getApplicationContext(), text);
                        break;
                    }
                    case RESULT_CANCELED: {
                        Util.showToast(getApplicationContext(), "RESULT_CANCELED");
                        break;
                    }
                    case RESULT_FIRST_USER: {
                        Util.showToast(getApplicationContext(), "RESULT_FIRST_USER");
                        break;
                    }
                    case RESULT_FIRST_USER + 1: {
                        Util.showToast(getApplicationContext(), "RESULT_FIRST_USER+1");
                        break;
                    }
                }
                break;
            }
            default: {
                Util.showToast(getApplicationContext(), "unknown");
                // unknown
                break;
            }
        }
    }

    public static String KEY_INTENT_DATA_EDITTEXT = "text_data";

    @Override
    public void onClick(View v) {

        EditText editText = (EditText) findViewById(R.id.edittext);
        String text = editText.getText().toString();

        Intent intent = new Intent();
//        intent.setClassName(getApplicationContext(), MainActivity2.class);
        intent.setClassName(getApplicationContext(), "com.example.fukuda.nexusapp_0127.MainActivity2");
//        intent.setClassName(getApplicationContext(), "com.android.settings/.Settings");
        intent.putExtra(KEY_INTENT_DATA_EDITTEXT, text);
//        startActivity(intent);
        startActivityForResult(intent, RESULT_CODE_1);
    }
}
