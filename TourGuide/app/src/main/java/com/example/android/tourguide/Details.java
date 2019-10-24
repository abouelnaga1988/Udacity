package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Details extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details);
        Intent intent = getIntent();
        int frontImageId = intent.getIntExtra("front image id", 0);
        final int image1Id = intent.getIntExtra("image 1 id", 0);
        final int image2Id = intent.getIntExtra("image 2 id", 0);
        final int image3Id = intent.getIntExtra("image 3 id", 0);
        String placeName = intent.getStringExtra("place name");
        String placeAddress = intent.getStringExtra("place address");
        String placePhone = intent.getStringExtra("place phone");
        String placeDescription = intent.getStringExtra("place description");
        ImageView frontImage = findViewById(R.id.front_image);
        ImageView image1 = findViewById(R.id.image1);
        ImageView image2 = findViewById(R.id.image2);
        ImageView image3 = findViewById(R.id.image3);
        TextView name = findViewById(R.id.name_text);
        TextView address = findViewById(R.id.address_text);
        TextView phone = findViewById(R.id.phone_text);
        TextView description = findViewById(R.id.description_text);
        frontImage.setImageResource(frontImageId);
        image1.setImageResource(image1Id);
        image2.setImageResource(image2Id);
        image3.setImageResource(image3Id);
        name.setText(placeName);
        address.setText(placeAddress);
        phone.setText(placePhone);
        description.setText(placeDescription);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Image.class);
                intent.putExtra("image", image1Id);
                startActivity(intent);
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Image.class);
                intent.putExtra("image", image2Id);
                startActivity(intent);
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Image.class);
                intent.putExtra("image", image3Id);
                startActivity(intent);
            }
        });


    }
}
