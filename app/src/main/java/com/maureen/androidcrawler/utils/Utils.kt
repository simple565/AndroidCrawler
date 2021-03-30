package com.maureen.androidcrawler.utils

import java.text.SimpleDateFormat
import java.util.*

/**
 * @Description
 * @Author Lianml
 * @Create 2019-12-13 22:14
 */
object Utils {
    fun getTime(currentMillions: Long): String {
        val date = Date(currentMillions)
        val format = SimpleDateFormat("MM-dd HH:mm:ss", Locale.CHINA)
        return format.format(date)
    }
}