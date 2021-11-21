package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaidCourses extends AppCompatActivity {

    Button paidcourse1;
    Button paidcourse2;
    Button paidcourse3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paid_courses);

        paidcourse1 = findViewById(R.id.paidcourse1);
        paidcourse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://recluze.teachable.com/p/hyperledger-fabric-composer-first-practical-blockchain");
                Intent btn_paidcourse1 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(btn_paidcourse1);
            }
        });

        paidcourse2 = findViewById(R.id.paidcourse2);
        paidcourse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://recluze.teachable.com/p/practical-deep-learning-with-keras-python");
                Intent btn_paidcourse2 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(btn_paidcourse2);
            }
        });

        paidcourse3 = findViewById(R.id.paidcourse3);
        paidcourse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://recluze.teachable.com/p/linux-command-line-from-zero-to-expert");
                Intent btn_paidcourse3 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(btn_paidcourse3);
            }
        });


    }
}