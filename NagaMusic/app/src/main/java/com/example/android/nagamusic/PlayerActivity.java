package com.example.android.nagamusic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PlayerActivity extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);
        Intent intent = getIntent();
        int songId = intent.getIntExtra("song id", 0);
        int imageId = intent.getIntExtra("image id", 0);
        String songTitle = intent.getStringExtra("song title");
        String artistName = intent.getStringExtra("artist name");
        TextView title = findViewById(R.id.play_title);
        TextView artist = findViewById(R.id.play_artist);
        ImageView poster = findViewById(R.id.play_image);
        title.setText(songTitle);
        artist.setText(artistName);
        poster.setImageResource(imageId);
        Play(songId);
        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Stop();
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void Play(int id) {
        if (player == null) {
            player = MediaPlayer.create(this, id);
        }
        player.start();
    }
    public void Stop() {
        if (player != null) {
            player.stop();
        }
    }
}

