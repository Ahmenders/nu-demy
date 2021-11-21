package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SDA extends AppCompatActivity {

    Button btn_videos;
    Button btn_lectures;
    Button btn_addtomycourses;
    Button btn_reviews;

    public static String sda_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sda);

        btn_videos = findViewById(R.id.sda_videos);
        btn_videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/drive/folders/1dHOtD_XyU3MhUAvtsKPWrQx_V-ctcrWO");
                Intent btn_videos = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(btn_videos);
            }
        });

        btn_lectures = findViewById(R.id.sda_lectures);
        btn_lectures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/drive/folders/1TbyN8hv11SclDDQRua_2k01ehw0g1Ygm");
                Intent btn_lectures = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(btn_lectures);
            }
        });

        btn_reviews = findViewById(R.id.sda_viewreviews);
        btn_reviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_reviews_intent = new Intent(SDA.this, SDA_Reviews.class);
                startActivity(btn_reviews_intent);
            }
        });

        btn_addtomycourses = findViewById(R.id.sda_addtomycourses);
        btn_addtomycourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sda_add = "true";

                Intent btn_addtomycourses = new Intent(SDA.this, MyCourses.class);
                startActivity(btn_addtomycourses);


            }
        });



    }
}