package com.example.news.mapper

import com.example.domain.newsmodels.NewsModel
import com.example.news.NewsModelsApp.NewsUI

fun NewsModel.toUIModel(): NewsUI {
    return NewsUI(
        id = this.id ?: "",
        title = this.title ?: "",
        description = this.description ?: "",
        link = this.link ?: "",
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