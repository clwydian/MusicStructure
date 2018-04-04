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

public class AmberCooldown extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list_amber);

        // Create an ArrayList of Song objects   Artist - Title - Duration
        ArrayList<Song> songlist = new ArrayList<Song>();
        songlist.add(new Song("Motley Crue", "Don't Go Away Mad (Just Go Away)", "1min"));
        songlist.add(new Song("Coye Wilcox", "Zippy, Hippy, Dippy", "2min"));
        songlist.add(new Song("Dall Raney", "Can Your Hossie Do The Dog", "3min"));
        songlist.add(new Song("Delbert Barker", "Yonder Comes A Sucker", "4min"));
        songlist.add(new Song("The Rock", "Dude From Mars", "5min"));
        songlist.add(new Song("Eddie Bond", "Boo Bop Caa Caa", "10min"));
        songlist.add(new Song("Elaine Chandler", "Tip toein' Thru the Teepee", "20min"));
        songlist.add(new Song("Ernest Breuer", "Does Your Chewing Gum Lose Its Flavor on the Bed post Over Night", "30min"));

        // Construct a SongAdaptor called adapter with content songlist
        SongAdaptor adapter = new SongAdaptor(this, songlist);

        // find listview object
        ListView listView = findViewById(R.id.music_listview_amber);

        // call setadaptor method
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

//                Create a new intent to open the {@link PlayItSam player activity}
                Intent nowPlaying = new Intent(AmberCooldown.this, PlayItSam.class);
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
