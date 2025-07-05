package com.example.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "news")
data class NewsEntity(
    @PrimaryKey val id: String,
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
