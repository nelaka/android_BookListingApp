package com.example.android.booklistingapp.model;

/**
 * {@link Book} represents a Google Book.
 * It consist of a title, a subtitle, authors and a infoLink url.
 */

public class Book {

    private String mTitle;
    private String mSubtitle;
    private String mAuthors;
    private String mUrl;

    public Book(String title, String subtitle, String authors, String url) {
        mTitle = title;
        mSubtitle = subtitle;
        mAuthors = authors;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSubtitle() {
        return mSubtitle;
    }

    public String getAuthors() {
        return mAuthors;
    }

    public String getUrl() {
        return mUrl;
    }
}
