package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FAQs extends AppCompatActivity {

    TextView etfaqs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);

        etfaqs = (TextView) findViewById(R.id.faqs);
        etfaqs.setText("1 - Who is this app for exactly?" + "---- This app is designed and made especially for Fastians and gives you great help in getting content to help in studies." +
                "\n" + "2 - Will there be more courses added to this app in the future?" + "---- Yes, with time we shall be including all major courses offered at FAST so students can access them easily." +
                "\n" + "3 - Is it just content related to university?" + "---- No, as you can go look at the paid courses section we have content that is not taught at FAST but is still very useful for any student." +
                "\n" + "4 - Who manages all this and uploads all this content?" + "---- We are a group of students from FAST who have made this app and upload content that we have been taught in FAST. ");
    }
}