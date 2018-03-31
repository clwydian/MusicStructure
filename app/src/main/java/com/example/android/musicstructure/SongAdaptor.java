package com.example.android.musicstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by clwyd on 23/03/2018.
 */

public class SongAdaptor extends ArrayAdapter<Song> {


    public SongAdaptor(Activity context, ArrayList<Song> Song) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Song);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
// Check if the existing view is being reused, otherwise inflate the view
        Log.i("getview", "getView: is just running");

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.music_list, parent, false);
        }

        Song currentSong = getItem(position);
        Log.i("songadaptor", "Song currentSong is " + currentSong);

//        // Find the TextView in the music_list.xml layout with the ID version_name


        TextView artistview = listItemView.findViewById(R.id.artist_text_view);
//        // Get the artist name from the current Song object and
//        // set this text on the Artist TextView
        Log.i("songadaptor", "artist settxt and currentSong.getrtist() is " + currentSong.getArtist());
        artistview.setText(currentSong.getArtist());

        Log.i("songadaptor", "its back from Artist.setText");

        TextView titleview = listItemView.findViewById(R.id.title_text_view);

        titleview.setText(currentSong.getTitle());
        Log.i("songadaptor", "its back from Titleview.setText");

        TextView durationview = listItemView.findViewById(R.id.duration_text_view);
        durationview.setText(currentSong.getDuration());
        Log.i("songadaptor", "its back from Durationview.setText");


        Log.i("getview songadaptor", "getView: " + currentSong.getDuration());

        return listItemView;
    }

//    Word currentWord = getItem(position);
////        // Find the TextView in the list_item.xml layout with the ID version_name
//
//    TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwok_text_view);
////        // Get the version name from the current Word object and
////        // set this text on the name TextView
//        miwokTranslation.setText(currentWord.getMiwokTranslation());
//
//    TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.default_text_view);
//        defaultTranslation.setText(currentWord.getDefaultTranslation());
//
//        return listItemView;


}


//
//        // Find the TextView in the list_item.xml layout with the ID version_number
//        TextView numberTextView = (TextView) listItemView.findViewById(R.id.version_number);
//        // Get the version number from the current AndroidFlavor object and
//        // set this text on the number TextView
//        numberTextView.setText(currentAndroidFlavor.getVersionNumber());
//
//        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
//        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
//        // Get the image resource ID from the current AndroidFlavor object and
//        // set the image to iconView
//        iconView.setImageResource(currentAndroidFlavor.getImageResourceId());
//
//        // Return the whole list item layout (containing 2 TextViews and an ImageView)
//        // so that it can be shown in the ListView
//        return listItemView;

//    }


//
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
//    }
//}


//
//public class AndroidFlavorAdapter extends ArrayAdapter<AndroidFlavor> {
//
//    private static final String LOG_TAG = AndroidFlavorAdapter.class.getSimpleName();
//
//    /**
//     * This is our own custom constructor (it doesn't mirror a superclass constructor).
//     * The context is used to inflate the layout file, and the list is the data we want
//     * to populate into the lists.
//     *
//     * @param context        The current context. Used to inflate the layout file.
//     * @param androidFlavors A List of AndroidFlavor objects to display in a list
//     */
//    public AndroidFlavorAdapter(Activity context, ArrayList<AndroidFlavor> androidFlavors) {
//        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
//        // the second argument is used when the ArrayAdapter is populating a single TextView.
//        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
//        // going to use this second argument, so it can be any value. Here, we used 0.
//        super(context, 0, androidFlavors);
//    }
//
//    /**
//     * Provides a view for an AdapterView (ListView, GridView, etc.)
//     *
//     * @param position The position in the list of data that should be displayed in the
//     *                 list item view.
//     * @param convertView The recycled view to populate.
//     * @param parent The parent ViewGroup that is used for inflation.
//     * @return The View for the position in the AdapterView.
//     */
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        // Check if the existing view is being reused, otherwise inflate the view
//        View listItemView = convertView;
//        if(listItemView == null) {
//            listItemView = LayoutInflater.from(getContext()).inflate(
//                    R.layout.list_item, parent, false);
//        }
//
//        // Get the {@link AndroidFlavor} object located at this position in the list
//        AndroidFlavor currentAndroidFlavor = getItem(position);
//
//        // Find the TextView in the list_item.xml layout with the ID version_name
//        TextView nameTextView = (TextView) listItemView.findViewById(R.id.version_name);
//        // Get the version name from the current AndroidFlavor object and
//        // set this text on the name TextView
//        nameTextView.setText(currentAndroidFlavor.getVersionName());
//
//        // Find the TextView in the list_item.xml layout with the ID version_number
//        TextView numberTextView = (TextView) listItemView.findViewById(R.id.version_number);
//        // Get the version number from the current AndroidFlavor object and
//        // set this text on the number TextView
//        numberTextView.setText(currentAndroidFlavor.getVersionNumber());
//
//        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
//        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
//        // Get the image resource ID from the current AndroidFlavor object and
//        // set the image to iconView
//        iconView.setImageResource(currentAndroidFlavor.getImageResourceId());
//
//        // Return the whole list item layout (containing 2 TextViews and an ImageView)
//        // so that it can be shown in the ListView
//        return listItemView;
//    }
//
