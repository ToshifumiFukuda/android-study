package com.example.fukuda.listviewsample;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/**
 * Created by fukuda on 2015/02/24.
 */
public class User {
    String mTitle;
    String mMessage;
    Drawable mIcon;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public Drawable getIcon() {
        return mIcon;
    }

    public void setIcon(Drawable icon) {
        mIcon = icon;
    }
}
