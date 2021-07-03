package com.example.tugas4.service;

import com.example.tugas4.model.ResponseDataHarian;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CovidRepository {
    @GET("rekapitulasi_v2/jabar/harian")
    Call<ResponseDataHarian> getResponseData();
}
