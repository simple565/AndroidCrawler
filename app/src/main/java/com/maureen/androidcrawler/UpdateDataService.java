package com.maureen.androidcrawler;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Description: 后台更新数据服务
 *
 * @author Maureen
 * Create 2020-08-29 14:50
 */
public class UpdateDataService extends Service {
    public UpdateDataService() {
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }


}
