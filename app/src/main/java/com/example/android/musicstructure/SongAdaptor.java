package com.example.android.musicstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by clwyd on 23/03/2018.
 */

public class SongAdaptor extends ArrayAdapter<Song> {

    public SongAdaptor(Activity context, ArrayList<Song> Song) {
        //  initialise ArrayAdaptor but ignore second value set to 0
        super(context, 0, Song);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is not being recycled, inflate the view using song_item.xml as a template
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }

        Song currentSong = getItem(position);

        // music_list.xml layout holds the three textview templates artist_text_view title_text_view and duration_t_v
        TextView artistview = listItemView.findViewById(R.id.artist_text_view);
        TextView titleview = listItemView.findViewById(R.id.title_text_view);
        TextView durationview = listItemView.findViewById(R.id.duration_text_view);

        //  then set three textfields
        artistview.setText(currentSong.getArtist());
        titleview.setText(currentSong.getTitle());
        durationview.setText(currentSong.getDuration());

        return listItemView;
    }
}