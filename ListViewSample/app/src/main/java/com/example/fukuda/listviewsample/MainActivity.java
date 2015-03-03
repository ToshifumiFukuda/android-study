package com.example.fukuda.listviewsample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, // getApplicationContext(),
                android.R.layout.simple_list_item_1,
                new String[]{
                        "hoge1", "hoge2", "hoge3", "hoge4", "hoge5", "hoge6", "hoge7"
                });
        */
        ArrayList<User> list = new ArrayList<User>();
        User user1 = new User();
        user1.setIcon(getResources().getDrawable(R.drawable.ic_launcher));
        user1.setTitle("title1");
        user1.setMessage("message1");
        User user2 = new User();
        user2.setIcon(getResources().getDrawable(R.drawable.ic_launcher));
        user2.setTitle("title2");
        user2.setMessage("message2");
        User user3 = new User();
        user3.setIcon(getResources().getDrawable(R.drawable.ic_launcher));
        user3.setTitle("title3");
        user3.setMessage("message3");
        list.add(user1);
        list.add(user2);
        list.add(user3);

        CustomListAdapter adapter = new CustomListAdapter(
                this,
                R.layout.listitem,
                list);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i("hoge", "position: " + position);
        String item = (String) parent.getItemAtPosition(position);
        Log.i("hoge", "get item: " + item);
    }
}
