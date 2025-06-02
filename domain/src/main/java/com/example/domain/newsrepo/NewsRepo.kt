package com.example.domain.newsrepo

import com.example.domain.newsmodels.NewsModel
import kotlinx.coroutines.flow.Flow

interface NewsRepo {
    fun getNews(): Flow<List<NewsModel>>
}