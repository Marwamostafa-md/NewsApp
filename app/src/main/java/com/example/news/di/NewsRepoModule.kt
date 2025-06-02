package com.example.news.di

import com.example.data.newsremote.NewsService
import com.example.data.newsrepoimpl.NewsRepoImpl
import com.example.domain.newsrepo.NewsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NewsRepoModule {
    @Provides
    fun provideRepo(newsService: NewsService): NewsRepo {
        return NewsRepoImpl(newsService)
    }
}