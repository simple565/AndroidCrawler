package com.maureen.androidcrawler

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * @author Maureen
 */
class MainActivity : AppCompatActivity() {
    private var mContext: Context? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mContext = this

    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}