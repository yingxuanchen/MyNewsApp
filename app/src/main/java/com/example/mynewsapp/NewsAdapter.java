package com.example.mynewsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Create a new {@link NewsAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param news    is the list of {@link News}s to be displayed.
     */
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link News} object located at this position in the list
        News currentNews = getItem(position);

        // Find the View in the list_item.xml layout. Get the data from the currentNews
        // object and set the data on the View.
        TextView sectionView = listItemView.findViewById(R.id.section_name);
        sectionView.setText(currentNews.getSection());

        TextView titleView = listItemView.findViewById(R.id.news_title);
        titleView.setText(currentNews.getTitle());

        // Create a new Date object from the time in milliseconds of the earthquake
        Date dateObject = new Date(currentNews.getTimeInMilliseconds());

        TextView dateView = listItemView.findViewById(R.id.date);
        String formattedDate = formatDate(dateObject);
        dateView.setText(formattedDate);

        TextView authorView = listItemView.findViewById(R.id.author);
        authorView.setText(currentNews.getAuthor());

        // Return the whole list item layout so that it can be shown in the ListView.
        return listItemView;
    }

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }
}
