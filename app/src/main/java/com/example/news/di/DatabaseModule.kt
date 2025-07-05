package com.example.news.di
import android.app.Application
import com.example.data.localdatabase.LocalDataBase
import com.example.data.localdatabase.NewsDao
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideLocalDatabase(app: Application): LocalDataBase {
        return Room.databaseBuilder(
            app,
            LocalDataBase::class.java,
            "news_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideNewsDao(db: LocalDataBase): NewsDao = db.newsDao()
}
