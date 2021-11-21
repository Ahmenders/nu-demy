package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity{

    Button btn_freecourses;
    Button btn_paidcourses;
    Button btn_mycourses;
    Button btn_faqs;
    Button btn_ask;
    Button btn_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        btn_freecourses = findViewById(R.id.freecourses);
        btn_freecourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent free_courses_intent = new Intent(ProfileActivity.this, FreeCourses.class);
                startActivity(free_courses_intent);
            }
        });

        btn_paidcourses = findViewById(R.id.paidcourses);
        btn_paidcourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paid_courses_intent = new Intent(ProfileActivity.this, PaidCourses.class);
                startActivity(paid_courses_intent);
            }
        });

        btn_mycourses = findViewById(R.id.my_courses);
        btn_mycourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mycourses_intent = new Intent(ProfileActivity.this, MyCourses.class);
                startActivity(mycourses_intent);
            }
        });


        btn_faqs = findViewById(R.id.faqs);
        btn_faqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paid_courses_intent = new Intent(ProfileActivity.this, FAQs.class);
                startActivity(paid_courses_intent);
            }
        });


        btn_ask = findViewById(R.id.onlineguide);
        btn_ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfjShN-RgcZ8gQQhw-CMV4XuG7LJEP__Pscbl9TO9TMJR5f1g/viewform");
                Intent btn_ask = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(btn_ask);
            }
        });

        btn_about = findViewById(R.id.about);
        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about_intent = new Intent(ProfileActivity.this, About.class);
                startActivity(about_intent);
            }
        });

    }

}
