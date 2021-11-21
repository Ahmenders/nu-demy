package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CN extends AppCompatActivity {

    Button btn_lectures;
    Button btn_addtomycourses;
    Button btn_videos;
    Button btn_reviews;

    public static String cn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cn);

        btn_videos = findViewById(R.id.cn_videos);
        btn_videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/drive/folders/1eBmnyOaB87zcUnfWArYBfnuGE4wzGKby");
                Intent btn_videos = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(btn_videos);
            }
        });

        btn_lectures = findViewById(R.id.cn_lectures);
        btn_lectures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/drive/folders/15kl528AUK_oaMUUcLlx3iajjQDiSXUjF");
                Intent btn_lectures = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(btn_lectures);
            }
        });

        btn_reviews = findViewById(R.id.cn_viewreviews);
        btn_reviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_reviews_intent = new Intent(CN.this, CN_Reviews.class);
                startActivity(btn_reviews_intent);
            }
        });

        btn_addtomycourses = findViewById(R.id.cn_addtomycourses);
        btn_addtomycourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cn_add = "true";

                Intent btn_addtomycourses = new Intent(CN.this, MyCourses.class);
                startActivity(btn_addtomycourses);

            }
        });

    }
}
