package com.example.android.nagamusic;

public class Song {
    private String song_name;
    private String artist_name;
    private int image_id;
    private int song_id;

    public Song(String title, String artist, int image, int song) {
        song_name = title;
        artist_name = artist;
        image_id = image;
        song_id = song;
    }

    public String getSong_name() {
        return song_name;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public int getImageId() {
        return image_id;
    }

    public int getSongId() {
        return song_id;
    }
}
