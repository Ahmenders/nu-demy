package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Automata_Reviews extends AppCompatActivity {

    TextView etreviews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automatareviews);

        etreviews = (TextView) findViewById(R.id.automata_reviews);
        etreviews.setText("1 - The course was well designed but it could have been made better by giving more detailed assignments.");

    }
}