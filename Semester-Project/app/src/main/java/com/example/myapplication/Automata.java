package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Automata extends AppCompatActivity {

    Button btn_lectures;
    Button btn_addtomycourses;
    Button btn_videos;
    Button btn_reviews;

    public static String automata_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automata);

        btn_videos = findViewById(R.id.automata_videos);
        btn_videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/drive/folders/1ym5tIlRXM9eFgaRSsGiHznHuM3ZuGwE-");
                Intent btn_videos = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(btn_videos);
            }
        });

        btn_lectures = findViewById(R.id.automata_lectures);
        btn_lectures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/drive/folders/1dRrYrIQ1FCd01Y0rPHEufBY-y32b2RPA");
                Intent btn_lectures = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(btn_lectures);
            }
        });

        btn_reviews = findViewById(R.id.automata_viewreviews);
        btn_reviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_reviews_intent = new Intent(Automata.this, Automata_Reviews.class);
                startActivity(btn_reviews_intent);

            }
        });

        btn_addtomycourses = findViewById(R.id.automata_addtomycourses);
        btn_addtomycourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                automata_add = "true";

                Intent btn_addtomycourses = new Intent(Automata.this, MyCourses.class);
                startActivity(btn_addtomycourses);

            }
        });

    }
}