package com.example.myapplication.classes;

import android.util.Log;

import com.example.myapplication.model.DbHelper;

public class Register {
    public String name;
    public String email;
    public String password;

    public Register(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public boolean register(DbHelper db) {
        Log.i("------Register:", "Registering user");
        return db.insertUser(this.name, this.email, this.password);
    }
}
