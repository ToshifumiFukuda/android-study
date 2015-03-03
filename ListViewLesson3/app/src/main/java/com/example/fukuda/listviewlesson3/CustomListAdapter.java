package com.example.fukuda.listviewlesson3;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fukuda.listviewlesson3.R;

import java.util.List;

/**
 * Created by fukuda on 2015/02/24.
 */
public class CustomListAdapter extends ArrayAdapter<User> {
    LayoutInflater mLayoutInflater;

    public CustomListAdapter(Context context, int resource, List<User> object) {
        super(context, resource, object);

        mLayoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = null;

        if (convertView == null) {
            view = mLayoutInflater.inflate(R.layout.listitem, parent, false);
        } else {
            view = convertView;
        }

        User user = getItem(position);
        ((ImageView)view.findViewById(R.id.icon)).setImageDrawable(user.getIcon());
        ((TextView)view.findViewById(R.id.title)).setText(user.getTitle());
        ((TextView)view.findViewById(R.id.message)).setText(user.getMessage());
        ((TextView)view.findViewById(R.id.publisher)).setText(user.getPublisher());
        ((TextView)view.findViewById(R.id.price)).setText(user.getPrice().toString());

        return view;
    }
}
