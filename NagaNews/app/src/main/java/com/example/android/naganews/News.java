package com.example.android.naganews;

class News {

    private String mType;
    private String mSection;
    private String mDate;
    private String mTitle;
    private String mPillarName;
    private String mUrl;

    public News(String type, String section, String date,String title,String pillarName, String url) {
        mType = type;
        mSection = section;
        mDate = date;
        mTitle = title;
        mPillarName = pillarName ;
        mUrl = url;
    }

    public String getmType() {
        return mType;
    }

    public String getmSection() {
        return mSection;
    }

    public String getmDate() {
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
