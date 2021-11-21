package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SDA_Reviews extends AppCompatActivity {

    TextView etreviews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdareviews);

        etreviews = (TextView) findViewById(R.id.sda_reviews);
        etreviews.setText("1 - This was a well explained course however it lacked a practical viewpoint of some concepts.");

    }
}