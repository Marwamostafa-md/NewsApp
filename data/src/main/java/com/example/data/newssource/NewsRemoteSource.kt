package com.example.data.newssource

import com.example.data.newsmodelsdata.AllNewsModel
import retrofit2.http.GET
import retrofit2.http.Query
interface NewsRemoteSource {
    @GET("latest")
    suspend fun getAllNews(
        @Query("q") query: String? = null,
        @Query("country") country: String? = null,
        @Query("language") language: String? = null,
        @Query("category") category: String? = null,

        ):AllNewsModel
}