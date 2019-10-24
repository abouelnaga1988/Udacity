package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PlaceArrayAdapter extends ArrayAdapter<Place> {
    public PlaceArrayAdapter(@NonNull Context context, @NonNull List<Place> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater listItem = LayoutInflater.from(getContext());
            convertView = listItem.inflate(R.layout.place_list_item, parent, false);
        }
        Place currentPlace = getItem(position);
        TextView placeName = convertView.findViewById(R.id.pl_name);
        TextView placeShortDescription = convertView.findViewById(R.id.pl_short_description);
        ImageView image = convertView.findViewById(R.id.image);
        placeName.setText(currentPlace.getPlace_name());
        placeShortDescription.setText(currentPlace.getPlace_short_description());
        image.setImageResource(currentPlace.getFront_image_id());
        return convertView;
    }
}
