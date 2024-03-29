package com.example.android.naganews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(@NonNull Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }
        News currentNews = getItem(position);
        TextView sectionView = listItemView.findViewById(R.id.section_text);
        TextView dateView = listItemView.findViewById(R.id.date_text);
        TextView titleView = listItemView.findViewById(R.id.title_text);
        TextView pillarNameView = listItemView.findViewById(R.id.pillar_text);
        TextView authorNameView = listItemView.findViewById(R.id.author_text);
        sectionView.setText(currentNews.getmSection());
        dateView.setText(formatDate(currentNews.getmDate()));
        titleView.setText(currentNews.getmTitle());
        pillarNameView.setText(currentNews.getmPillarName());
        authorNameView.setText(currentNews.getmAuthorName());

        return listItemView;
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

}

