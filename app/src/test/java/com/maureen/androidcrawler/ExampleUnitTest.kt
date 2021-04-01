package com.maureen.androidcrawler

import android.util.Log
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.maureen.androidcrawler.bean.DokiEntity
import com.maureen.androidcrawler.utils.POPULARITY_DATA_URL
import com.maureen.androidcrawler.utils.WebClient
import okhttp3.Request
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val popularityRequest = Request.Builder().url(POPULARITY_DATA_URL).build()
        try {
            val gson = Gson()
            val jsonArray = WebClient.webClient.newCall(popularityRequest).execute().body?.string()
            val realJsonArray = jsonArray?.substring(jsonArray.indexOf("{"), jsonArray.lastIndexOf("}") + 1)
            val dokiEntity = gson.fromJson(realJsonArray, DokiEntity::class.java)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}