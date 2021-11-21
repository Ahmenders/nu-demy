package com.example.myapplication;


import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.classes.Register;
import com.example.myapplication.model.DbHelper;


public class SignUp extends AppCompatActivity {
    EditText etname,etemail,etpass;
    DbHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etname=findViewById(R.id.editName);
        etemail=findViewById(R.id.editEmail);
        etpass=findViewById(R.id.editPass);
        Button btn_new=findViewById(R.id.buttonAcount);

        DbHelper db = new DbHelper(this);



        btn_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNewAccount(db);
            }
        });

    }

    private void createNewAccount(DbHelper db) {
        String name=etname.getText().toString().trim();
        String email=etemail.getText().toString().trim();
        String pass=etpass.getText().toString().trim();

        Log.i("-----SignupActivity-createNewAccount :", "User "+name+" having email "+email+" is typed");
        if (TextUtils.isEmpty(name)){
            etname.setError("Please Enter Name");
            etname.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(email)){
            etemail.setError("Please Enter Email");
            etemail.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(pass)){
            etpass.setError("Please Enter Password");
            etpass.requestFocus();
            return;
        }

        Register register = new Register(name, email, pass);
        if (register.register(db)) {
            Toast.makeText(getApplicationContext(),"Signed up",Toast.LENGTH_LONG).show();
        }
    }

}
