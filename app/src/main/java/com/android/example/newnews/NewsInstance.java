package com.android.example.newnews;

public class NewsInstance {

    private final String mAuthor;
    private final String mSection;
    private final String mTitle;
    private final String mDate;
    private final String mUrl;

    public NewsInstance(String author, String section, String title, String date, String Url) {
        mAuthor = author;
        mSection = section;
        mTitle = title;
        mDate = date;
        mUrl = Url;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getSection() {
        return mSection;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDate() {
        return mDate;
    }

    public String getURL() {
        return mUrl;
    }
}