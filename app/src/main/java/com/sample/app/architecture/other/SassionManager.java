package com.sample.app.architecture.other;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;

public class SassionManager {
    public SassionManager() {

    }

    void saveStringUtils(String key, String value, Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("MySharedPref",MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putString(key, value);
        myEdit.apply();
    }

    String getStringUtils(String key,Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences("MySharedPref",MODE_PRIVATE);
        return sharedPreferences.getString(key,""/**<-------------when value is not available or empty**/);
    }


}
