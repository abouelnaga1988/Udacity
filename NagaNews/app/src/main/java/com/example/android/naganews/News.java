package com.example.android.naganews;

import java.util.Date;

class News {

    private String mSection;
    private Date mDate;
    private String mTitle;
    private String mPillarName;
    private String mUrl;

    public News(String section, Date date, String title, String pillarName, String url) {
        mSection = section;
        mDate = date;
        mTitle = title;
        mPillarName = pillarName;
        mUrl = url;
    }

    public String getmSection() {
        return mSection;
    }

    public Date getmDate() {
        return mDate;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmPillarName() {
        return mPillarName;
    }

    public String getmUrl() {
        return mUrl;
    }
}
