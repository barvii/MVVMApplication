package com.pcc.mvvmapplication.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiHelper {
    private static ApiInterface apiInterface;

    public static ApiInterface getApi() {
        if (apiInterface == null) {
            Retrofit.Builder builder = new Retrofit.Builder()
                    .baseUrl("https://example.com/")
                    .addConverterFactory(GsonConverterFactory.create());
            apiInterface = builder.build().create(ApiInterface.class);
        }
        return apiInterface;
    }
}
