package com.example.fukuda.listviewlesson3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/**
 * Created by fukuda on 2015/02/24.
 */
public class User {
    Drawable mIcon;
    String mTitle;
    String mMessage;
    String mPublisher;
    Integer mPrice;

    public Drawable getIcon() {
        return mIcon;
    }

    public void setIcon(Drawable mIcon) {
        this.mIcon = mIcon;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String mMessage) {
        this.mMessage = mMessage;
    }

    public String getPublisher() {
        return mPublisher;
    }

    public void setPublisher(String mPublisher) {
        this.mPublisher = mPublisher;
    }

    public Integer getPrice() {
        return mPrice;
    }

    public void setPrice(Integer mPrice) {
        this.mPrice = mPrice;
    }
}
