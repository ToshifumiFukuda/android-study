package com.example.fukuda.notificationsample;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void onClick(View v) {
        Intent intent = new Intent(this, SubActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        Notification notification = builder
                // 通知の日時
                .setWhen(System.currentTimeMillis())
                        // 通知のタイトル
                .setContentTitle("通知だヨ！")
                        // 通知の詳細メッセージ
                .setContentText("通知の詳しい内容をここに書きます。")
                        // 通知のアイコン
                .setSmallIcon(R.drawable.ic_launcher)
                        // 通知を表示した瞬間、通知バーに表示するショートメッセージ
                .setTicker("通知だヨ！")
                        // 通知をタップした時に使う PendingIntent
                .setContentIntent(pendingIntent)
                        // この通知が未だ表示されていない時だけ、音やバイブレーション、ショートメッセージの表示を行う
                .setOnlyAlertOnce(true)
                        // タップしたら消えるようにする
                .setAutoCancel(true)
                .build();

    }
}
