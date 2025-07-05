package com.example.data.mapper

import com.example.data.local.entities.NewsEntity
import com.example.domain.newsmodels.NewsModel

fun NewsModel.toEntity() = NewsEntity(
    id, title, description, link, imageUrl, pubDate, sourceId,
    category, country, language, creator, keywords, videoUrl
)
