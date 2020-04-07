package com.maureen.androidcrawler.utils;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @Description Okhttp请求
 * @Author Lianml
 * @Create 2020-03-24 10:32
 */
public class WebClient {
    private static volatile WebClient mInstance;
    private OkHttpClient mClient;

    private WebClient() {
        mClient = new OkHttpClient();
    }

    public static WebClient getInstance() {
        if (null == mInstance) {
            synchronized (WebClient.class) {
                if (null == mInstance) {
                    mInstance = new WebClient();
                }
            }
        }
        return mInstance;
    }

    public Response syncGet(String url) throws Exception {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response;
        try {
            response = mClient.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        return response;
    }
}
