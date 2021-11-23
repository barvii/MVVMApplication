package com.pcc.mvvmapplication.api;

import com.pcc.mvvmapplication.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("api/getuserlist")
    Call<List<User>> getUserList();
}
