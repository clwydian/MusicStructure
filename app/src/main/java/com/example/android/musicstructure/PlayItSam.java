package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by clwyd on 01/04/2018.
 */

public class PlayItSam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playit_list);

        //  construct a layout from thePlayer in playit_list.xml -its a pretend ploayer-
        LinearLayout thePlayer = findViewById(R.id.thePlayer);

        //  set up four TextViews across the screen
        TextView textView = findViewById(R.id.NowPlaying);
        TextView textViewArtist = findViewById(R.id.playing_artist);
        TextView textViewTitle = findViewById(R.id.playing_title);
        TextView textViewDuration = findViewById(R.id.playing_duration);

        //  pull three text fields from the newly arrived intent call
        Bundle extras = getIntent().getExtras();
        String artisttoplay = extras.getString("artistplay"); // will return "FirstKeyValue"
        String titletoplay = extras.getString("titleplay");
        String durationtoplay = extras.getString("durationplay");

        //  set the variables into three of the TextViews
        textViewArtist.setText(artisttoplay);
        textViewTitle.setText(titletoplay);
        textViewDuration.setText(durationtoplay);

        //  pass intent back to Main when the screen is touched (as the musicplayer would when ended)
        thePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playerExitIntent = new Intent(PlayItSam.this, MainActivity.class);
                startActivity(playerExitIntent);
            }
        });
    }
}
