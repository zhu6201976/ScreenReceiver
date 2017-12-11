package com.example.administrator.test;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * ScreenService
 * Created by My on 2017/12/11.
 */

public class ScreenService extends Service {
    private ScreenReceiver mScreenReceiver;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // 2.服务中注册广播接收者
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        mScreenReceiver = new ScreenReceiver();
        registerReceiver(mScreenReceiver, intentFilter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mScreenReceiver != null) {
            unregisterReceiver(mScreenReceiver);
        }
    }
}
