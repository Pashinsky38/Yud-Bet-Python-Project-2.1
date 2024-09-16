package com.example.makinganopening;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class HelperDB extends SQLiteOpenHelper {
    public static final String DB_FILE = "lesson_in_chemistry.db";
    public static final String USERS_TABLE= "Users";
    public static final String USER_NAME = "UserName";
    public static final String USER_PWD= "UserPassword";
    public static final String USER_EMAIL= "UserEmail";
    public static final String USER_PHONE= "UserPhone";


    public HelperDB(@Nullable Context context) {
        super(context, DB_FILE, null, 1);
    }// END OF HelperDB (Constructor)

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(buildUserTable());
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // DO NOT TOUCH
    }// END OF onUpgrade

    public String buildUserTable() {
        String st = "CREATE TABLE IF NOT EXISTS " + USERS_TABLE;
        st+="(" + USER_NAME + " TEXT,";
        st+=USER_PWD + " TEXT, ";
        st+=USER_EMAIL + " TEXT, ";
        st+=USER_PHONE + " TEXT";
        return st;
    }
    
}// END OF CLASS
