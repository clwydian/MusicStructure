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

        TextView family = findViewById(R.id.amber_cooldown);
        family.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, AmberCooldown.class);
                startActivity(familyIntent);
            }
        });

        TextView colors = findViewById(R.id.green_goforit);
        colors.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, GreenGoForIt.class);
                startActivity(colorsIntent);
            }
        });

        TextView phrases = findViewById(R.id.settings);
        phrases.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, Settings.class);
                startActivity(phrasesIntent);
            }
        });
    }

}