package com.example.administrator.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


/**
 * 特殊广播接收者,如屏幕解锁和锁屏,清单文件注册无效,需要代码中注册.
 * 屏幕解锁和锁屏广播接收者
 * 如果在Activity中注册屏幕解锁和锁屏广播接收者,则应用退出无效
 * 需要在服务中注册才能永久生效
 * 2017年12月11日10:24:04
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1.首先开启服务
        startService(new Intent(this, ScreenService.class));
    }

}
