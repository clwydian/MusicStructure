package com.example.android.musicstructure;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by clwyd on 23/03/2018.
 */

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_list);
        LinearLayout infoLayout = findViewById(R.id.settings_listview);

        // five textboxes for the help screen
        TextView infoText1 = new TextView(this);
        infoText1.setTextSize(40);
        infoText1.setTextColor(Color.WHITE);
        infoText1.setBackgroundColor(0xFF0803AB);
        infoText1.setGravity(Gravity.CENTER | Gravity.TOP);
        infoText1.setPadding(20, 10, 20, 10);

        TextView infoText2 = new TextView(this);
        infoText2.setTextSize(25);
        infoText2.setTextColor(Color.WHITE);
        infoText2.setBackgroundColor(0xFFB90303);
        infoText2.setPadding(10, 20, 10, 20);

        TextView infoText3 = new TextView(this);
        infoText3.setTextSize(25);
        infoText3.setTextColor(Color.WHITE);
        infoText3.setBackgroundColor(0xFFB37436);
        infoText3.setPadding(10, 20, 10, 20);

        TextView infoText4 = new TextView(this);
        infoText4.setTextSize(25);
        infoText4.setTextColor(Color.WHITE);
        infoText4.setBackgroundColor(0xFF109C00);
        infoText4.setPadding(10, 20, 10, 20);

        TextView infoText5 = new TextView(this);
        infoText5.setTextSize(25);
        infoText5.setTextColor(Color.WHITE);
        infoText5.setBackgroundColor(0xFF0803AB);
        infoText5.setPadding(10, 20, 10, 20);

        infoText1.setText(R.string.TrafficLightTunes);
        infoText2.setText(R.string.selectred);
        infoText3.setText(R.string.selectamber);
        infoText4.setText(R.string.selectgreen);
        infoText5.setText(R.string.selectsettings);

        // layout changes
        infoText1.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        infoText2.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        infoText3.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        infoText4.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        infoText5.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        // add the five boxes of text for the adaptor to serve to the screen
        infoLayout.addView(infoText1);
        infoLayout.addView(infoText2);
        infoLayout.addView(infoText3);
        infoLayout.addView(infoText4);
        infoLayout.addView(infoText5);

        //  listen for clicks
        infoLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingIntent = new Intent(Settings.this, MainActivity.class);
                startActivity(settingIntent);
            }
        });
    }
}