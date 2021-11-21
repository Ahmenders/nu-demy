package com.example.myapplication.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;


public class DbHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "NuDemy.db";
    public static final int DATABASE_VERSION = 1;

    public static final String USERS_TABLE_NAME = "users";
    public static final String USERS_COLUMN_ID = "id";
    public static final String USERS_COLUMN_NAME = "name";
    public static final String USERS_COLUMN_EMAIL = "email";
    public static final String USERS_COLUMN_PASSWORD = "password";

    private SQLiteDatabase read = this.getReadableDatabase();
    private SQLiteDatabase write = this.getWritableDatabase();


    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE "+USERS_TABLE_NAME+" (" +
                        USERS_COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                        USERS_COLUMN_NAME+" VARCHAR(255) ,"+
                        USERS_COLUMN_EMAIL+" VARCHAR(255) UNIQUE,"+
                        USERS_COLUMN_PASSWORD+" VARCHAR(255));"
        );
        Log.i("------DBHelper: ", "Created users table");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(
                "DROP TABLE IF EXISTS "+USERS_TABLE_NAME +";"
        );
        onCreate(db);
        Log.i("------DBHelper: ", "Dropped table Users and created it again");
    }

    public boolean insertUser(String name, String email, String password) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(USERS_COLUMN_NAME, name);
        contentValues.put(USERS_COLUMN_EMAIL, email);
        contentValues.put(USERS_COLUMN_PASSWORD, password);

        write.insert(USERS_TABLE_NAME, null, contentValues);
        Log.i("------DBHelper: ", "Inserted "+name+" user in users table");

        return true;
    }


    public boolean isUser(String email, String password) {
        Cursor res = read.rawQuery(
                "SELECT * FROM "+USERS_TABLE_NAME+
                        " WHERE "+USERS_COLUMN_EMAIL+"='"+email+"' AND "+
                        USERS_COLUMN_PASSWORD+"='"+password+"';", null
        );

        boolean user = res.moveToFirst();
        if (!user) {
            Log.w("------DBHelper: ", "has NO user by this email "+email);
            return false;
        }
        Log.i("------DBHelper: ", "has a user by this email "+email);
        return true;
    }

    public String getUserNameByEmail(String email) {
        Cursor res = read.rawQuery(
                "SELECT * FROM "+USERS_TABLE_NAME+
                        " WHERE "+USERS_COLUMN_EMAIL+"='"+email+"';", null
        );

        boolean user = res.moveToFirst();
        if (!user) {
            Log.w("------DBHelper: ", "has NO user by this email "+email);
            return "";
        }

        String name = res.getString( res.getColumnIndex(USERS_COLUMN_NAME) );
        Log.i("------DBHelper: ", "has a user by this email "+email+" having name "+name);
        return name;
    }
}
