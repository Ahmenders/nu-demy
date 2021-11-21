package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class About extends AppCompatActivity {

    TextView etabout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        etabout = (TextView) findViewById(R.id.about);
        etabout.setText("Ahmad Abbasi: An enthusiastic database developer, currently working in the domain of game development.\n" + "\n" +
                "Ali Muzahir: Currently working on Database Systems deployment and looking forward going into AI and ML.\n" + "\n" +
                "Ammar Abid: An aspiring data scientist who is always ready to dive into projects which seem hard but gets done in time.\n" + "\n" +
                "Momina Atif Dar: A human who loves Flask and has recently savored app development. Other than this, a vivid reader and writer.\n" + "\n" +
                "Shafeeq Jadoon: An ambitious ML and AI aspirant who loves to explore deeper levels of AI and wishes to implement them in near future.");


    }
}