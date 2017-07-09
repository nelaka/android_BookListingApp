package com.example.android.booklistingapp;

/**
 * {@link Book} represents a vocabulary word that the user wants to learn
 * It contains a miwok and a default translation for that word.
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

   public String getAuthors() {  return mAuthors;   }

    public String getUrl() {return mUrl;}






}
