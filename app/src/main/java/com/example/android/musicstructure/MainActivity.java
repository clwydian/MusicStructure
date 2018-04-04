/*
 * Copyright (C) 2016 The Android Open Source Project
 */
package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.example.android.musicstructure.AmberCooldown;
import com.example.android.musicstructure.GreenGoForIt;
import com.example.android.musicstructure.R;
import com.example.android.musicstructure.RedChillax;
import com.example.android.musicstructure.Settings;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        // Find the View that shows the red category
        TextView redSongs = findViewById(R.id.red_chillax);
        // Set a click listener on that View object
        redSongs.setOnClickListener(new OnClickListener() {
            // The code in this othereise abstract method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RedChillax activity}
                Intent redIntent = new Intent(MainActivity.this, RedChillax.class);
                // Start the new activity
                startActivity(redIntent);
            }
        });

        // same for amber
        TextView amberSongs = findViewById(R.id.amber_cooldown);
        amberSongs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent amberIntent = new Intent(MainActivity.this, AmberCooldown.class);
                startActivity(amberIntent);
            }
        });

        // again for green
        TextView greenSongs = findViewById(R.id.green_goforit);
        greenSongs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent greenIntent = new Intent(MainActivity.this, GreenGoForIt.class);
                startActivity(greenIntent);
            }
        });

        // and for the helpscreen textview panel
        TextView settingsClick = findViewById(R.id.settings);
        settingsClick.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingsIntent = new Intent(MainActivity.this, Settings.class);
                startActivity(settingsIntent);
            }
        });
    }
}