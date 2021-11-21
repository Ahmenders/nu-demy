package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FreeCourses extends AppCompatActivity {

    Button freecourse1;
    Button freecourse2;
    Button freecourse3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_courses);

        freecourse1 = findViewById(R.id.freecourse1);
        freecourse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent freecourse1 = new Intent(FreeCourses.this, SDA.class);
                startActivity(freecourse1);
            }
        });

        freecourse2 = findViewById(R.id.freecourse2);
        freecourse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent freecourse2 = new Intent(FreeCourses.this, Automata.class);
                startActivity(freecourse2);
            }
        });

        freecourse3 = findViewById(R.id.freecourse3);
        freecourse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent freecourse3 = new Intent(FreeCourses.this, CN.class);
                startActivity(freecourse3);
            }
        });



    }
}