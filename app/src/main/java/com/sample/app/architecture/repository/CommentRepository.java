package com.sample.app.architecture.repository;

import androidx.lifecycle.MutableLiveData;

public class CommentRepository extends BaseRepository{


    MutableLiveData<String> getSampledata(){
        networkInterface.getsample();
        return null;
    }


}
