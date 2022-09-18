package com.sample.app.architecture.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class SqlConst {

    /**
     * databse const
     */
    static int DATABASE_VERSION = 1;
    static String DATABSAE_NAME = "demo_database";


    /**
     * table one
     */
    static String TABLE_NAME = "sample_table";
    static String ID_COL = "id";
    static String FIRSTNAME = "firstname";
    static String LASTNAME = "lastname";
    static String PRICE = "price";
    static String PRODUCT = "price";
    static String ISAVILABLE = "isavailable";
    static String LOCATION = "location";


    static String createTable = "CREATE TABLE " + TABLE_NAME + " ("
            + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + FIRSTNAME + " TEXT,"
            + LASTNAME + " TEXT,"
            + PRICE + " INTEGER,"
            + PRODUCT + " TEXT,"
            + ISAVILABLE + " INTEGER,"
            + LOCATION + " TEXT)";


    static String droptable = "DROP TABLE IF EXISTS " + TABLE_NAME;

    static String selecttable = "SELECT * FROM " + TABLE_NAME;

    //static String selecttable = "SELECT * FROM " + TABLE_NAME;


    static Cursor availabledataquery(SQLiteDatabase db) {
        return db.query
                (
                        TABLE_NAME,
                        new String[]{ISAVILABLE},
                        ISAVILABLE + "=" + 1,
                        null, null, null, null, null
                );
    }


}
