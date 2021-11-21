package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CN_Reviews extends AppCompatActivity {

    TextView etreviews;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnreviews);

        etreviews = (TextView) findViewById(R.id.cn_reviews);
        etreviews.setText("1 - An amazingly taught course and very good implementations done.");

    }
}