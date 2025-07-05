package com.example.data.newssource

import com.example.data.local.entities.NewsEntity
import com.example.data.localdatabase.NewsDao
import kotlinx.coroutines.flow.Flow

interface NewsLocalDataSource {
    suspend fun insertNews(news: List<NewsEntity>)
    fun getAllNews(): Flow<List<NewsEntity>>
}

class NewsLocalDataSourceImpl(private val dao: NewsDao) : NewsLocalDataSource {
    override suspend fun insertNews(news: List<NewsEntity>) = dao.insertAll(news)
    override fun getAllNews(): Flow<List<NewsEntity>> = dao.getAllNews()
}