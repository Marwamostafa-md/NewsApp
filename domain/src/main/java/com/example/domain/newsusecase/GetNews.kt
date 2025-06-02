package com.example.domain.newsusecase

import com.example.domain.newsmodels.NewsModel
import com.example.domain.newsrepo.NewsRepo
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetNews(
    private val newsRepo: NewsRepo
) {
    operator fun invoke(): Flow<List<NewsModel>> = newsRepo.getNews()
}