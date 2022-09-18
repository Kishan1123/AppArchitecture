package com.sample.app.architecture.repository;

import com.sample.app.architecture.network.NetworkInterface;
import com.sample.app.architecture.network.RetrofitClient;

public class BaseRepository {

    NetworkInterface networkInterface = RetrofitClient.getClient().create(NetworkInterface.class);

}
