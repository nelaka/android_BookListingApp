package com.example.android.booklistingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/*
* {@link BookListingAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Book} objects.
* */
public class BookListingAdapter extends ArrayAdapter<Book> {
    /**
     * @param context The current context. Used to inflate the layout file.
     * @param books   A List of Book objects to display in a list
     */

    public BookListingAdapter(Context context, List<Book> books) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }

        // Get the {@link Book} object located at this position in the list
        Book currentBook = getItem(position);

        // Find the TextView with view ID title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentBook.getTitle());

        // Find the TextView with view ID subtitle and hide it, if it is empty
        TextView subtitleTextView = (TextView) listItemView.findViewById(R.id.subtitle);
        if (currentBook.getSubtitle() == null) subtitleTextView.setVisibility(View.GONE);
        else {
            subtitleTextView.setText(currentBook.getSubtitle());
            subtitleTextView.setVisibility(View.VISIBLE);
        }

        // Find the TextView with view ID authors and hide it, if it is empty
        TextView authorsTextView = (TextView) listItemView.findViewById(R.id.authors);
        if (currentBook.getAuthors() == "") authorsTextView.setVisibility(View.GONE);
        else {
            authorsTextView.setText(currentBook.getAuthors());
            authorsTextView.setVisibility(View.VISIBLE);
        }
        return listItemView;
    }
}