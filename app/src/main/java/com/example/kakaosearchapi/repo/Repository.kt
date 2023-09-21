package com.example.kakaosearchapi.repo

import com.example.kakaosearchapi.model.SearchResponse
import com.example.kakaosearchapi.retrofit.RetrofitInstance
import retrofit2.Response

class Repository {

    suspend fun searchImage(query : String, sort : String) : Response<SearchResponse> {
        return RetrofitInstance.api.searchImage(query = query, sort = sort, page = 1, size = 5)
    }
}