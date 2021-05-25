package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.number);

// Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumberActivity.class);
                startActivity(numbersIntent);
            }
        });

        TextView phases = (TextView) findViewById(R.id.phase);

// Set a click listener on that View
        phases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent phasesIntent = new Intent(MainActivity.this, PhasesActivity.class);
                startActivity(phasesIntent);
            }
        });

        TextView color = (TextView) findViewById(R.id.color);

// Set a click listener on that View
        color.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorActivity.class);
                startActivity(colorsIntent);
            }
        });

        TextView member = (TextView) findViewById(R.id.member);

// Set a click listener on that View
        member.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent membersIntent = new Intent(MainActivity.this, MembersActivity.class);
                startActivity(membersIntent);
            }
        });


    }
    /*public void numberClick(View view){
        Intent i = new Intent(this,NumberActivity.class);
        startActivity(i);

    }*/
}