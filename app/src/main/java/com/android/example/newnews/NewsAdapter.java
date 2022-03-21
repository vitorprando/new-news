package com.android.example.newnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<NewsInstance> {

    public NewsAdapter(@NonNull Context context, List<NewsInstance> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        NewsInstance currentNewsInstance = getItem(position);

        TextView authorView = listItemView.findViewById(R.id.author);
        authorView.setText(currentNewsInstance.getAuthor());

        TextView sectionView = listItemView.findViewById(R.id.section);
        sectionView.setText(currentNewsInstance.getSection());

        TextView titleView = listItemView.findViewById(R.id.title);
        titleView.setText(currentNewsInstance.getTitle());

        TextView dateView = listItemView.findViewById(R.id.date);
        dateView.setText(currentNewsInstance.getDate());

        return listItemView;
    }
}