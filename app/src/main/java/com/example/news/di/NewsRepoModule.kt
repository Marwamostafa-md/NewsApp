package com.example.news.di

import com.example.data.localdatabase.NewsDao
import com.example.data.newssource.NewsLocalDataSource
import com.example.data.newssource.NewsLocalDataSourceImpl
import com.example.data.newssource.NewsRemoteSource
import com.example.data.newsrepoimpl.NewsRepositoryImpl
import com.example.domain.newsrepo.NewsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NewsRepoModule {

    @Provides
    @Singleton
    fun provideNewsLocalDataSource(newsDao: NewsDao): NewsLocalDataSource =
        NewsLocalDataSourceImpl(newsDao)

    @Provides
    @Singleton
    fun provideNewsRepo(
        remoteSource: NewsRemoteSource,
        localSource: NewsLocalDataSource
    ): NewsRepo {
        return NewsRepositoryImpl(remoteSource, localSource)
    }
}
