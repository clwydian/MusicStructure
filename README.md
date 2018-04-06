# MusicStructure
Udacity homework - music player structure

I am doing the Udacity Android Basics Nanodegree

This app lacks the code to play music - and is currently in the early stages.

It crashes at present.  I have put in a series of log entries to try and see where it fails.

03-31 15:52:06.282 4383-4383/com.example.android.musicstructure I/Song: Song: mArtist value =Eric Blurgh
03-31 15:52:06.284 4383-4383/com.example.android.musicstructure I/Song: Song: mTitle =I crossed a river
03-31 15:52:06.284 4383-4383/com.example.android.musicstructure I/Song: Song: mDuration =205
03-31 15:52:06.288 4383-4383/com.example.android.musicstructure I/Song: Song: mArtist value =Torvil Wunerbro
03-31 15:52:06.288 4383-4383/com.example.android.musicstructure I/Song: Song: mTitle =Dream on, but not on the motorway
03-31 15:52:06.288 4383-4383/com.example.android.musicstructure I/Song: Song: mDuration =178
03-31 15:52:06.288 4383-4383/com.example.android.musicstructure I/Song: Song: mArtist value =Scream Trio
03-31 15:52:06.288 4383-4383/com.example.android.musicstructure I/Song: Song: mTitle =My ice cream is melting for you
03-31 15:52:06.289 4383-4383/com.example.android.musicstructure I/Song: Song: mDuration =403
03-31 15:52:06.289 4383-4383/com.example.android.musicstructure I/Song: Song: mArtist value =Scream quat
03-31 15:52:06.290 4383-4383/com.example.android.musicstructure I/Song: Song: mTitle =Who likes ice cream
03-31 15:52:06.290 4383-4383/com.example.android.musicstructure I/Song: Song: mDuration =404
03-31 15:52:06.291 4383-4383/com.example.android.musicstructure I/Song: Song: mArtist value =Scream think
03-31 15:52:06.291 4383-4383/com.example.android.musicstructure I/Song: Song: mTitle =Tuttifrutti
03-31 15:52:06.291 4383-4383/com.example.android.musicstructure I/Song: Song: mDuration =405
03-31 15:52:06.291 4383-4383/com.example.android.musicstructure I/Song: Song: mArtist value =Scream sextant
03-31 15:52:06.291 4383-4383/com.example.android.musicstructure I/Song: Song: mTitle =Raining again
03-31 15:52:06.291 4383-4383/com.example.android.musicstructure I/Song: Song: mDuration =406
03-31 15:52:06.291 4383-4383/com.example.android.musicstructure I/Song: Song: mArtist value =Scream siezes
03-31 15:52:06.291 4383-4383/com.example.android.musicstructure I/Song: Song: mTitle =Slobber doober
03-31 15:52:06.291 4383-4383/com.example.android.musicstructure I/Song: Song: mDuration =407
03-31 15:52:06.291 4383-4383/com.example.android.musicstructure I/red chillax: just calling adapter after adding last song
03-31 15:53:25.563 4383-4383/com.example.android.musicstructure I/getview: getView: is just running
03-31 15:53:25.573 4383-4383/com.example.android.musicstructure I/songadaptor: Song currentSong is com.example.android.musicstructure.Song@bcda2e8
03-31 15:53:25.573 4383-4383/com.example.android.musicstructure I/getmArtist: Song: mArtist value =Eric Blurgh
03-31 15:53:25.573 4383-4383/com.example.android.musicstructure I/songadaptor: artist settxt and currentSong.getrtist() is Eric Blurgh
03-31 15:53:54.360 4383-4383/com.example.android.musicstructure I/getmArtist: Song: mArtist value =Eric Blurgh

03-31 15:53:54.396 4383-4383/com.example.android.musicstructure E/AndroidRuntime: FATAL EXCEPTION: main
                                                                                  Process: com.example.android.musicstructure, PID: 4383
                                                                                  java.lang.NullPointerException: Attempt to invoke virtual method 'void android.widget.TextView.setText(java.lang.CharSequence)' on a null object reference
                                                                                      
                                                                                      at com.example.android.musicstructure.SongAdaptor.getView(SongAdaptor.java:54)
                                                                                      at android.widget.AbsListView.obtainView(AbsListView.java:2434)
                                                                                      at android.widget.ListView.makeAndAddView(ListView.java:1970)
                                                                                      at android.widget.ListView.fillDown(ListView.java:704)

snipped
