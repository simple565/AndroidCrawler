package com.maureen.androidcrawler

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
            val jsonArray: String = WebClient.webClient.newCall(popularityRequest).execute().body.toString()
            val realJsonArray = jsonArray.substring(jsonArray.indexOf("{"), jsonArray.lastIndexOf("}") + 1)
            println(realJsonArray)
            val objects: JsonObject = gson.fromJson(realJsonArray, JsonObject::class.java)
            println(objects.get("222071"))
            val dokiEntity: DokiEntity = gson.fromJson(objects.get("222071"), DokiEntity::class.java)
            println(dokiEntity.strName + dokiEntity.stFanTuanScoreInfo?.ddwPopularity)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}