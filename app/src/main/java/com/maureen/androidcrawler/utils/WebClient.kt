package com.maureen.androidcrawler.utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.ConnectionPool;
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
    private final static int READ_TIMEOUT = 100;
    private final static int CONNECT_TIMEOUT = 60;
    private final static int WRITE_TIMEOUT = 60;

    private WebClient() {
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        //读取超时
        clientBuilder.readTimeout(READ_TIMEOUT, TimeUnit.SECONDS);
        //连接超时
        clientBuilder.connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS);
        //写入超时
        clientBuilder.writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS);
        //自定义连接池最大空闲连接数和等待时间大小，否则默认最大5个空闲连接
        clientBuilder.connectionPool(new ConnectionPool(32, 5, TimeUnit.MINUTES));
        mClient = clientBuilder.build();
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
        Request request = new Request.Builder().url(url).build();
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
