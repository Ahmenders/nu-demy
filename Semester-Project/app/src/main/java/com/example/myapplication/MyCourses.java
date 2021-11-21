package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.SDA;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MyCourses extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycourses);

        if (SDA.sda_add == "true"){
            Button mycourse1;

            mycourse1 = findViewById(R.id.mycourse1);
            mycourse1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mycourse1 = new Intent(MyCourses.this, SDA.class);
                    startActivity(mycourse1);
                }
            });


        }

        if (CN.cn_add == "true"){
            Button mycourse2;

            mycourse2 = findViewById(R.id.mycourse2);
            mycourse2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mycourse2 = new Intent(MyCourses.this, CN.class);
                    startActivity(mycourse2);
                }
            });


        }

        if (Automata.automata_add == "true"){
            Button mycourse3;

            mycourse3 = findViewById(R.id.mycourse3);
            mycourse3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mycourse3 = new Intent(MyCourses.this, Automata.class);
                    startActivity(mycourse3);
                }
            });


        }



    }
}