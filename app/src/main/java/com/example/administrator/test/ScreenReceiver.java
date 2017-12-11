package com.example.administrator.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * ScreenReceiver
 * Created by My on 2017/12/11.
 */

public class ScreenReceiver extends BroadcastReceiver {
    private static final String TAG = "ScreenReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_ON".equals(action)) {
            Log.d(TAG, "onReceive: 说明屏幕解锁了");
        } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
            Log.d(TAG, "onReceive: 说明屏幕锁屏了");
        }
    }
}
