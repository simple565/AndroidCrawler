package com.maureen.androidcrawler.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @Description
 * @Author Lianml
 * @Create 2019-12-13 22:14
 */
public class Utils {

    public static String getTime(long currentMillions) {
        Date date = new Date(currentMillions);
        SimpleDateFormat format = new SimpleDateFormat("MM-dd HH:mm:ss", Locale.CHINA);
        return format.format(date);
    }
}
