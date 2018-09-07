package com.bozdreams.application;


import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.umeng.commonsdk.UMConfigure;

/**
 * 业务名:
 * 功能说明:
 * 编写日期: 2018/9/6 09:48
 * 作者:zhangbo
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
public class AndroidCodeApplication extends MultiDexApplication {

    private static AndroidCodeApplication application;
    public static boolean isRefresh = false;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        UMConfigure.init(this, UMConfigure.DEVICE_TYPE_PHONE,"");
    }

    public static AndroidCodeApplication getInstance() {
        return application;
    }

    public static Context getContext() {
        return application.getApplicationContext();
    }

}
