package com.example.news.di

import com.example.domain.newsrepo.NewsRepo
import com.example.domain.newsusecase.GetNews
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NewsUseCaseModule {
    @Provides
    fun provideAllNews(newsRepo: NewsRepo):GetNews {
        return GetNews(newsRepo)
    }
}