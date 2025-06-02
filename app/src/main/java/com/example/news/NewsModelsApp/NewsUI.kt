package com.example.news.NewsModelsApp

data class NewsUI(
    val id: String,
    val title: String,
    val description: String,
    val link: String,
    val imageUrl: String?,
    val pubDate: String?,
    val sourceId: String?,
    val category: List<String>?,
    val country: List<String>?,
    val language: String?,
    val creator: List<String>?,
    val keywords: List<String>?,
    val videoUrl: String?
)
