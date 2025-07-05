package com.example.data.localdatabase

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.data.local.entities.NewsEntity
import com.example.data.newsmodelsdata.Converters

@Database(entities = [NewsEntity::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class LocalDataBase:RoomDatabase() {
    abstract fun newsDao(): NewsDao
}
