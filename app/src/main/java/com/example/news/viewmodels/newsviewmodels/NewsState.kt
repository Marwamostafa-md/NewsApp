package com.example.news.viewmodels.newsviewmodels

import com.example.news.NewsModelsApp.NewsUI

data class NewsState(
    val Loading: Boolean = false,
    val newsUIS: List<NewsUI?> = emptyList(),
    val error: Throwable? = null
) {
    fun isLoading() = Loading && newsUIS.isEmpty()
    fun isSuccess() = newsUIS.isNotEmpty() && error == null
    fun isError() = error != null
}
