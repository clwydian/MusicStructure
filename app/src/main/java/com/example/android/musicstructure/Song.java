package com.example.android.musicstructure;

import android.util.Log;

/**
 * {@link Song} represents a tune containing Artist  Title and Duration.
 * Three genres of tune appear groups as red amber and green.
 */
public class Song {

    /**
     * Artist name
     */
    private String mArtist;

    /**
     * Title of track
     */
    private String mTitle;

    /**
     * Duration in seconds as string
     */
    private String mDuration;

    /**
     * Create a new Song object.
     *
     * @param artistname   is the artist performing or writing
     * @param songtitle    is the title of the tune
     * @param songduration is the duration of the song in seconds as a string
     */


//    This is a constructor so must have the SAME name as the class (with three variables)
    public Song(String artistname, String songtitle, String songduration) {
        mArtist = artistname;
        Log.i("Song", "Song: mArtist value =" + mArtist);
        mTitle = songtitle;
        Log.i("Song", "Song: mTitle =" + mTitle);
        mDuration = songduration;
        Log.i("Song", "Song: mDuration =" + mDuration);
    }

    /**
     * Get the artist
     */
    public String getArtist() {
        Log.i("getmArtist", "Song: mArtist value =" + mArtist);
        return mArtist;
    }

    /**
     * Get the title.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Get the songlength as a string
     */
    public String getDuration() {
        return mDuration;
    }

}
