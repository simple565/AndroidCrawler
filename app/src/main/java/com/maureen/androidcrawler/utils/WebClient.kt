package com.maureen.androidcrawler.utils


import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

/**
 * @Description Okhttp请求
 * @Author Lianml
 * @Create 2020-03-24 10:32
 */
object WebClient {
    val webClient: OkHttpClient by lazy {
        OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .connectionPool(ConnectionPool(32, 5, TimeUnit.MINUTES))
                .build()
    }
}