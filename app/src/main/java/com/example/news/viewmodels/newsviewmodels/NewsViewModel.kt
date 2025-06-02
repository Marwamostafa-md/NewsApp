package com.example.news.viewmodels.newsviewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.newsusecase.GetNews
import com.example.news.NewsModelsApp.NewsUI
import com.example.news.mapper.toUIModel
import com.example.news.di.DISPATCHER_IO
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val getNews: GetNews,
    @Named(DISPATCHER_IO)
    private val dispatcherIO:CoroutineDispatcher
) : ViewModel() {
    private val _newsState: MutableStateFlow<NewsState?> = MutableStateFlow(NewsState())

    val newsState: StateFlow<NewsState?> = _newsState
    fun getAllNews() {
        _newsState.value = _newsState.value?.copy(Loading = true)
        getNews().flowOn(dispatcherIO)
            .map { result -> result.map { it.toUIModel() } }
            .onEach { result -> handleSuccess(result) }
            .catch { handleOnError(it) }
            .launchIn(viewModelScope)
    }

    private fun handleSuccess(allNews: List<NewsUI>) {
        _newsState.value =
            _newsState.value?.copy(
                Loading = false,
                newsUIS= allNews,
            )
    }

    private fun handleOnError(e: Throwable) {
        Log.e("RecipeDetailsViewModel", e.message.toString())
        _newsState.value =
            _newsState.value?.copy(Loading = false, error = e)
    }

}