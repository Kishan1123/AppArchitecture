package com.sample.app.architecture.database;

import static com.sample.app.architecture.database.SqlConst.DATABASE_VERSION;
import static com.sample.app.architecture.database.SqlConst.DATABSAE_NAME;
import static com.sample.app.architecture.database.SqlConst.FIRSTNAME;
import static com.sample.app.architecture.database.SqlConst.ISAVILABLE;
import static com.sample.app.architecture.database.SqlConst.LASTNAME;
import static com.sample.app.architecture.database.SqlConst.LOCATION;
import static com.sample.app.architecture.database.SqlConst.PRICE;
import static com.sample.app.architecture.database.SqlConst.PRODUCT;
import static com.sample.app.architecture.database.SqlConst.TABLE_NAME;
import static com.sample.app.architecture.database.SqlConst.availabledataquery;
import static com.sample.app.architecture.database.SqlConst.droptable;
import static com.sample.app.architecture.database.SqlConst.selecttable;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.sample.app.architecture.model.UserModel;

import java.util.ArrayList;

public class SqlDatabase extends SQLiteOpenHelper {

    public SqlDatabase(@Nullable Context context) {
        super(context, DATABSAE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SqlConst.createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(droptable);
        onCreate(db);
    }

    void insertDataBase(UserModel model) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(FIRSTNAME, model.getFirstname());
        values.put(LASTNAME, model.getLastname());
        values.put(PRICE, model.getPrice());
        values.put(PRODUCT, model.getProduct());
        values.put(ISAVILABLE, model.getIsavailable());
        values.put(LOCATION, model.getLocation());
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    ArrayList<UserModel> getUserModel() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<UserModel> model = new ArrayList<>();
        Cursor cursor = db.rawQuery(selecttable, null);
        if (cursor.moveToFirst()) {
            do {
                model.add(new UserModel(
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getInt(3),
                        cursor.getString(4),
                        cursor.getInt(5),
                        cursor.getString(6)
                ));
            } while (cursor.moveToNext());
        }
        db.close();

        return model;
    }

    ArrayList<UserModel> getAllAvailableProduct() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<UserModel> model = new ArrayList<>();
        Cursor cursor = availabledataquery(db);
        if (cursor.moveToFirst()) {
            do {
                model.add(new UserModel(
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getInt(3),
                        cursor.getString(4),
                        cursor.getInt(5),
                        cursor.getString(6)
                ));
            } while (cursor.moveToNext());
        }
        db.close();
        return model;
    }





}
