package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MembersActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members);

        //getSupportActionBar().setTitle("Member");
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("one","lutti" , R.mipmap.ic_launcher,R.raw.number_one));
        words.add(new word("two","ottiko", R.mipmap.ic_launcher,R.raw.hmm));
        words.add(new word("three","tolookuso", R.drawable.ic_launcher_background,R.raw.ok));
        words.add(new word("four","oyyisa", R.drawable.ic_launcher_background,R.raw.hmm));
        words.add(new word("five","massoka", R.drawable.ic_launcher_background,R.raw.ok));
        words.add(new word("one","lutti", R.drawable.ic_launcher_background,R.raw.number_one));
        words.add(new word("two","ottiko", R.drawable.ic_launcher_background,R.raw.hmm));
        words.add(new word("three","tolookuso", R.drawable.ic_launcher_background,R.raw.ok));
        words.add(new word("four","oyyisa", R.drawable.ic_launcher_background,R.raw.number_one));
        words.add(new word("five","massoka", R.drawable.ic_launcher_background,R.raw.hmm));


        wordAdapter itemsAdapter = new wordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word word = words.get(position);
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(MembersActivity.this,word.getMaudio());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(onCompletionListener);


            }
        });




    }

    @Override
    protected void onStop(){
        super.onStop();

        releaseMediaPlayer();
    }
    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
        }
    }
}