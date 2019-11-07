package com.example.android.naganews;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(@NonNull Context context, int resource, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        News currentNews = getItem(position);
        TextView typeView = listItemView.findViewById(R.id.type_text);
        TextView sectionView = listItemView.findViewById(R.id.section_text);
        TextView dateView = listItemView.findViewById(R.id.date_text);
        TextView titleView = listItemView.findViewById(R.id.title_text);
        TextView pillarNameView = listItemView.findViewById(R.id.pillar_text);
        typeView.setText(currentNews.getmType());
        sectionView.setText(currentNews.getmSection());
        dateView.setText(currentNews.getmDate());
        titleView.setText(currentNews.getmTitle());
        pillarNameView.setText(currentNews.getmPillarName());

        return listItemView;
    }

}

