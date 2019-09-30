package com.example.android.nagamusic;

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

public class SongArrayAdapter extends ArrayAdapter<Song> {
    public SongArrayAdapter(@NonNull Context context, int resource, @NonNull List<Song> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater listItem = LayoutInflater.from(getContext());
            convertView = listItem.inflate(R.layout.list_item, parent, false);
        } else {
            Song currentSong = getItem(position);
            TextView titleText = convertView.findViewById(R.id.track_text);
            TextView artistText = convertView.findViewById(R.id.artist_text);
            ImageView songImage = convertView.findViewById(R.id.icon_image);
            titleText.setText(currentSong.getSong_name());
            artistText.setText(currentSong.getArtist_name());
            songImage.setImageResource(currentSong.getImageId());
        }
        return convertView;

    }
}

