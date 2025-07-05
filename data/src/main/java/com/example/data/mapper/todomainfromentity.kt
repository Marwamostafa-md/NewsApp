package com.example.data.mapper

import com.example.data.local.entities.NewsEntity
import com.example.domain.newsmodels.NewsModel

fun NewsEntity.toDomain(): NewsModel {
    return NewsModel(
        id = this.id,
        title = this.title,
        description = this.description,
        link = this.link,
        imageUrl = this.imageUrl,
        pubDate = this.pubDate,
        sourceId = this.sourceId,
        category = this.category,
        country = this.country,
        language = this.language,
        creator = this.creator,
        keywords = this.keywords,
        videoUrl = this.videoUrl
    )
}