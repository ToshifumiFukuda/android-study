package com.example.fukuda.nexusapp_0127;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity2 extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.KEY_INTENT_DATA_EDITTEXT);
        TextView textView = (TextView) findViewById(R.id.textview);
        textView.setText(text);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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

    public static String KEY_INTENT_DATA_RETURNTEXT = "return_data";

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.putExtra(KEY_INTENT_DATA_RETURNTEXT, "return text");
        setResult(RESULT_OK, intent);
        finish();
    }
}
