package com.example.myapplication.classes;

import android.util.Log;

import com.example.myapplication.model.DbHelper;

public class Login {

    private String email;
    private String password;

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    public boolean validate(DbHelper db) {
        Log.i("------Login:", "Validating user");
        return db.isUser(email, password);
    }

}