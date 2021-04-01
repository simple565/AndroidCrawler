package com.maureen.androidcrawler

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.gson.Gson
import com.maureen.androidcrawler.bean.DokiEntity
import com.maureen.androidcrawler.utils.POPULARITY_DATA_URL
import com.maureen.androidcrawler.utils.WebClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Request

/**
 * @author Maureen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycleScope.launch(Dispatchers.IO) {
            val popularityRequest = Request.Builder().url(POPULARITY_DATA_URL).build()
            try {
                val jsonArray = WebClient.webClient.newCall(popularityRequest).execute().body?.string()
                val realJsonArray = jsonArray?.substring(jsonArray.indexOf("{"), jsonArray.lastIndexOf("}") + 1)
                val dokiEntity = Gson().fromJson(realJsonArray, DokiEntity::class.java)
                Log.d(TAG, "onCreate: ${dokiEntity.data.vecStarInfo.size}")
                val startInfo = dokiEntity.data.vecStarInfo
                startInfo.forEach{
                    Log.d(TAG, "onCreate: ${it.strName} ${it.iRank}  ${it.lScore}")
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}