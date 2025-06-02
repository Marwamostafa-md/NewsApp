package com.example.data.newsmodelsdata

import com.google.gson.annotations.SerializedName

data class NewsModelsData(
    @SerializedName("article_id")
    val articleId: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("link")
    val link: String?,
    @SerializedName("keywords")
    val keywords: List<String>?,
    @SerializedName("creator")
    val creator: List<String>?,
    @SerializedName("video_url")
    val videoUrl: String?,
    @SerializedName("image_url")
    val imageUrl: String?,
    @SerializedName("pubDate")
    val pubDate: String?,
    @SerializedName("source_id")
    val sourceId: String?,
    @SerializedName("country")
    val country: List<String>?,
    @SerializedName("category")
    val category: List<String>?,
    @SerializedName("language")
    val language: String?

)
