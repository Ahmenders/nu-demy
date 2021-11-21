package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.classes.Login;
import com.example.myapplication.classes.User;
import com.example.myapplication.model.DbHelper;



public class MainActivity extends AppCompatActivity {

    EditText etemail,etpass;
    DbHelper db;
    User currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("-----MainActivity-onCreate :", "Started MainActivity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView createnewac=findViewById(R.id.createnewac);
        etemail = findViewById(R.id.etemail);
        etpass = findViewById(R.id.mypass);
        db = new DbHelper(this);

        Button btnlogin=findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logIn();
            }
        });

        createnewac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent);
            }
        });
    }

    private void logIn() {
        String email=etemail.getText().toString().trim();
        String pass=etpass.getText().toString();
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

        Login login = new Login(email, pass);
        if (login.validate(db)) {
                String name = db.getUserNameByEmail(email);
                Log.i("-----MainActivity-logIn :", "User "+name+" having email "+email+" is validated");
                currentUser = new User(name, email);

                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
//                intent.putExtra("currentUser", currentUser);
//                intent.putExtra("db", db);
                startActivity(intent);
        }
        else {
            Log.i("-----MainActivity-logIn :", "User having email "+email+" is NOT validated");
            Toast.makeText(getApplicationContext()," NOT A VALID USER",Toast.LENGTH_LONG).show();
        }

    }

}