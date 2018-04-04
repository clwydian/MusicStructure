package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by clwyd on 23/03/2018.
 */

public class GreenGoForIt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list_green);

        // Create an ArrayList of Song objects   Artist - Title - Duration
        ArrayList<Song> songlist = new ArrayList<Song>();
        //  Add the songs to the ArrayList
        songlist.add(new Song("Hank Penney", "Wham! Bam! Thank You Ma'am!", "15s"));
        songlist.add(new Song("Gordon Sizemore", "Waddlin' Mama", "30s"));
        songlist.add(new Song("Harry Peppel", "Thermostat Baby", "45s"));
        songlist.add(new Song("Harry Woods", "Me Too Ho-Ho! Ha-Ha!", "1min"));
        songlist.add(new Song("Jack Yellen", "She Don't Wanna!", "2min"));
        songlist.add(new Song("Johnny Carrol", "You Two Timed Me Two Times Too Often", "4min"));
        songlist.add(new Song("Johnny Horton", "They Shined Up Rudolph's Nose", "5min"));

        //construct SongAdaptor called adapter with content songlist
        SongAdaptor adapter = new SongAdaptor(this, songlist);

        // find the listview for green
        ListView listView = findViewById(R.id.music_listview_green);

        // tell the songadapter where the listview is
        listView.setAdapter(adapter);

        // setOnItemClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                TextView textView1 = view.findViewById(R.id.artist_text_view);
                String artistout = textView1.getText().toString();
                TextView textView2 = view.findViewById(R.id.title_text_view);
                String titleout = textView2.getText().toString();
                TextView textView3 = view.findViewById(R.id.duration_text_view);
                String durationout = textView3.getText().toString();

//                Create a new intent to open the {@link RedChillax activity}
                Intent nowPlaying = new Intent(GreenGoForIt.this, PlayItSam.class);
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
