package com.example.assignment.i002.model.api;

import com.example.assignment.i002.model.api.dto.Pojo;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import rx.Observable;

public interface ExpressNetApiOps {
    @GET("/sample.json")
    Observable<Pojo> getData();
}