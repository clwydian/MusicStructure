package com.example.android.musicstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by clwyd on 23/03/2018.
 */

public class RedChillax extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Create a list of songs  Artist - Title - Duration
        ArrayList<Song> songlist = new ArrayList<Song>();
//        words.add("one");
        songlist.add(new Song("Eric Blurgh", "I crossed a river", "205"));

//        Is exactly the same as
//        Word w = new Word("one","lutti");
//        words.add(w);

        songlist.add(new Song("Torvil Wunerbro", "Dream on, but not on the motorway", "178"));
        songlist.add(new Song("Scream Trio", "My ice cream is melting for you", "403"));
        songlist.add(new Song("Scream quat", "Who likes ice cream", "404"));
        songlist.add(new Song("Scream think", "Tuttifrutti", "405"));
        songlist.add(new Song("Scream sextant", "Raining again", "406"));
        songlist.add(new Song("Scream siezes", "Slobber doober", "407"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        Log.i("red chillax", "just calling adapter after adding last song");

        SongAdaptor adapter = new SongAdaptor(this, songlist);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // music_list.xml file.
        ListView listView = findViewById(R.id.music_listview);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}