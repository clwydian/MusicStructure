package com.example.android.musicstructure;

import android.util.Log;

/**
 * {@link Song} represents a music mix containing Artist  Title and Duration.
 * Three genres of tune appear groups as red amber and green.
 */

public class Song {
    //  internal objects for artist, title and duration strings
    private String mArtist;
    private String mTitle;
    private String mDuration;
    /**
     * Create a new Song object of artist, title and duration
     * @param artistname
     * @param songtitle
     * @param songduration
     */

//    This constructor has class name (with three variables)
    public Song(String artistname, String songtitle, String songduration) {
        mArtist = artistname;
        mTitle = songtitle;
        mDuration = songduration;
    }

    //  getArtist getTitle and getDuration methods
    public String getArtist() {
        return mArtist;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDuration() {
        return mDuration;
    }
}
