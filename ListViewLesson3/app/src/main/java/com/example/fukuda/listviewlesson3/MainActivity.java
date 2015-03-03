package com.example.fukuda.listviewlesson3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<User> list = new ArrayList<User>();
        User user1 = new User();
        user1.setIcon(getResources().getDrawable(R.drawable.ic_launcher));
        user1.setTitle("title1");
        user1.setPublisher("publisher1");
        user1.setPrice(0);
        User user2 = new User();
        user2.setIcon(getResources().getDrawable(R.drawable.ic_launcher));
        user2.setTitle("title2");
        user2.setPublisher("publisher2");
        user2.setPrice(10);
        User user3 = new User();
        user3.setIcon(getResources().getDrawable(R.drawable.ic_launcher));
        user3.setTitle("title3");
        user3.setPublisher("publisher3");
        user3.setPrice(20);
        User user4 = new User();
        user4.setIcon(getResources().getDrawable(R.drawable.ic_launcher));
        user4.setTitle("title4");
        user4.setPublisher("publisher4");
        user4.setPrice(30);
        User user5 = new User();
        user5.setIcon(getResources().getDrawable(R.drawable.ic_launcher));
        user5.setTitle("title5");
        user5.setPublisher("publisher5");
        user5.setPrice(40);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        CustomListAdapter adapter = new CustomListAdapter(
                this,
                R.layout.listitem,
                list);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
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
}
