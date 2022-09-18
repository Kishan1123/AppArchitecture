package com.sample.app.architecture.other;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sample.app.architecture.model.SampleModel;

import java.util.List;

public class Utils {

    void convertModelToString(SampleModel model) {
        String convertedToString = new Gson().toJson(model);
    }

    void convertStringToModel(String data){
        SampleModel convertedToModel = new Gson().fromJson(data,SampleModel.class);
        /**
         * when want to convert list of object to model
         * */
       // List<SampleModel> convertedToModel1 = new Gson().fromJson(data,new TypeToken<List<SampleModel>>(){}.getType());

    }


}
