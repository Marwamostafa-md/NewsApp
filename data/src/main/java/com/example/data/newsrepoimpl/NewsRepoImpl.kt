package com.example.data.newsrepoimpl
import com.example.data.mapper.toDomain
import com.example.data.mapper.toDomainModel
import com.example.data.mapper.toEntity
import com.example.data.newssource.NewsLocalDataSource
import com.example.data.newssource.NewsRemoteSource
import com.example.domain.newsmodels.NewsModel
import com.example.domain.newsrepo.NewsRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

class NewsRepositoryImpl(
    private val api: NewsRemoteSource,
    private val local: NewsLocalDataSource
) : NewsRepo {
    override fun getNews(): Flow<List<NewsModel>> = flow {
        try {
            val response = api.getAllNews()
            val mapped = response.results?.map { it.toDomainModel() } ?: emptyList()

            local.insertNews(mapped.map { it.toEntity() })
            emit(mapped)
        } catch (e: Exception) {
            try{
            emitAll(local.getAllNews().map { it.map { entity -> entity.toDomain() } })}
            catch(e:Exception){
               throw e;
            }

        }
    }
}
