package com.example.data.newsmodelsdata

import com.google.gson.annotations.SerializedName

data class AllNewsModel(
    @SerializedName("status")
    val status: String?,
    @SerializedName("totalResults")
    val totalResults: Int?,
    @SerializedName("results")
    val results: List<NewsModelsData>?,
    @SerializedName("nextPage")
    val nextPage: String?
)
