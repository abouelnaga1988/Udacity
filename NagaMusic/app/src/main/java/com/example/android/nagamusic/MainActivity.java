package com.example.android.nagamusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Play List");
        final ArrayList<Song> songsList = new ArrayList<Song>();
        songsList.add(new Song("Nafs Elmakan", "Amr Diab", R.drawable.nafs_elmakan, R.raw.song_nafs_elmakan));
        songsList.add(new Song("Ma Bakhaf", "Carol Samaha", R.drawable.mabkhaf, R.raw.song_ma_bakhaf));
        songsList.add(new Song("Allah Alam", "Fadl Shaker", R.drawable.allah_a3lam, R.raw.song_allah_alam));
        songsList.add(new Song("6 El Sobh", "Hussein El Jasmy", R.drawable.setta_elsobh, R.raw.song_setta_elsobh));
        songsList.add(new Song("Matgebsh Serti", "Mai Kassab", R.drawable.matgebsh_serty, R.raw.song_matgebsh_serti));
        songsList.add(new Song("Ehsas Fazeea", "Mohamed Hamaki", R.drawable.ehsas_fazeeh, R.raw.song_ehsas_fazeea));
        songsList.add(new Song("Ya Nhar Abyad", "Mostafa Ammar", R.drawable.yanhar_abyad, R.raw.song_yanhar_abyad));
        songsList.add(new Song("Eh Ally Garraly", "Nancy Ajram", R.drawable.eh_elly_garaly, R.raw.song_eh_ally_garraly));
        songsList.add(new Song("Lemeen Haeesh", "Wael Jassar", R.drawable.lameen_ha3eesh, R.raw.song_lemeen_haeesh));
        songsList.add(new Song("Hob", "Tamer Hosney", R.drawable.hob, R.raw.song_hob));
        SongArrayAdapter itemsAdapter = new SongArrayAdapter(this, R.layout.list_item, songsList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(android.widget.AdapterView<?> parent, View view, int position, long id) {
                Song currentSong = songsList.get(position);
                Intent intent = new Intent(view.getContext(), PlayerActivity.class);
                intent.putExtra("image id", currentSong.getImageId());
                intent.putExtra("song id", currentSong.getSongId());
                intent.putExtra("artist name", currentSong.getArtist_name());
                intent.putExtra("song title", currentSong.getSong_name());
                startActivity(intent);
            }
        });

    }
}
