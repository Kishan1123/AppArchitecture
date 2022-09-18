package com.sample.app.architecture.network;


import retrofit2.Call;
import retrofit2.http.GET;

public interface NetworkInterface {


    @GET("")
    Call<String> getsample();


}
