package com.example.data.newsrepoimpl

import com.example.data.mapper.toDomainModel
import com.example.data.newsremote.NewsService
import com.example.domain.newsmodels.NewsModel
import com.example.domain.newsrepo.NewsRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class NewsRepoImpl(private val newsService: NewsService) : NewsRepo {
    override fun getNews(): Flow<List<NewsModel>> {
        return flow {
            val response = newsService.getAllNews()
            val result = response.results?.map { it.toDomainModel() } ?: emptyList()
            emit(result)
        }
    }
}