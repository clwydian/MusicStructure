package com.example.android.musicstructure;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by clwyd on 23/03/2018.
 */

public class RedChillax extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list_red);

        // Create an ArrayList of Song objects   Artist - Title - Duration and fill it
        ArrayList<Song> songlist = new ArrayList<Song>();
        songlist.add(new Song("Alfred Bryan", "Cherie Chilly-Pom-Pom-Pee", "1min"));
        songlist.add(new Song("Bob Dylan", "Everybody must get stoned", "2min"));
        songlist.add(new Song("Billy Hart", "Check-Mated And Bingoed", "3min"));
        songlist.add(new Song("Buddy Sharpe", "Three Eyed Man", "4min"));
        songlist.add(new Song("C+C Music Factory", "Things That Make You Go Hmmmm", "5min"));
        songlist.add(new Song("Carl Phillips", "Wig wam Willie", "10min"));
        songlist.add(new Song("Charlie Gore", "You Ain't Nothin' But A Female Hound Dog", "15mins"));
        songlist.add(new Song("Chuck Bowers", "Blabber Mouth Sidewalk Stroll", "20min"));

        // Construct a SongAdaptor for the songlist
        SongAdaptor adapter = new SongAdaptor(this, songlist);

        //  Make a ListView from music_Listview_red instructions
        ListView listView = findViewById(R.id.music_listview_red);

        //  Tell the adaptor which listview to use
        listView.setAdapter(adapter);

        // setOnItemClickListener for screen touch to 'pick a mix'
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                //  create textviews from the xml and fill from the selected mix
                TextView textView1 = view.findViewById(R.id.artist_text_view);
                String artistout = textView1.getText().toString();
                TextView textView2 = view.findViewById(R.id.title_text_view);
                String titleout = textView2.getText().toString();
                TextView textView3 = view.findViewById(R.id.duration_text_view);
                String durationout = textView3.getText().toString();

                //  Create a new intent to open the player activity with extras}
                Intent nowPlaying = new Intent(RedChillax.this, PlayItSam.class);
                Bundle extras = new Bundle();
                extras.putString("artistplay", artistout);
                extras.putString("titleplay", titleout);
                extras.putString("durationplay", durationout);
                nowPlaying.putExtras(extras);
                startActivity(nowPlaying);
            }
        });
    }
}