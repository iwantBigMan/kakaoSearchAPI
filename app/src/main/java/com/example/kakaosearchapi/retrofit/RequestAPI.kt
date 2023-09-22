package com.example.kakaosearchapi.retrofit


import com.example.kakaosearchapi.constants.Constants
import com.example.kakaosearchapi.model.SearchResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface RequestAPI {
    @GET("v2/search/image")
    suspend fun searchImage(
        @Header("Authorization") apiKey: String = Constants.AUTH_HEADER,
        @Query("query") query : String,
        @Query("sort") sort : String,
        @Query("page") page: Int,
        @Query("size") size: Int
    ) : Call<SearchResponse>
}