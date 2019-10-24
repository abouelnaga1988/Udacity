package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Image extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_viewer);
        Intent intent = getIntent();
        int imageId = intent.getIntExtra("image", 0);
        ImageView imageView = findViewById(R.id.viewer_image);
        imageView.setImageResource(imageId);
    }
}