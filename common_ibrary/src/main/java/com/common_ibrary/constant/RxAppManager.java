package com.common_ibrary.constant;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;

import java.util.Stack;

/**
 * 业务名:
 * 功能说明:对所有Activity进行一个统一的管理，实现一键退出应用。
 * 编写日期:2018/4/17 下午4:56;
 * 作者:zhangbo;
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
public class RxAppManager {

    private Stack<Activity> activityStack;

    private static RxAppManager instance;

    private RxAppManager() {
    }

    /**
     * 单例模式-初始化
     *
     * @return
     */
    public synchronized static RxAppManager getInstance() {
        if (instance == null) {
            instance = new RxAppManager();
        }
        return instance;
    }

    /**
     * 添加Activity到堆栈
     *
     * @param activity
     */
    public void addActivity(Activity activity) {
        if (activityStack == null) {
            activityStack = new Stack<Activity>();
        }
        activityStack.add(activity);
    }

    public Activity fromActivity() {
        int preIndex = activityStack.size() - 2;
        if (preIndex >= 0) {
            return activityStack.get(preIndex);
        }
        return null;
    }

    /**
     * 获取当前Activity（堆栈中最后一个压入的）
     *
     * @return
     */
    public Activity currentActivity() {
        Activity activity = activityStack.lastElement();
        return activity;
    }

    /**
     * 结束当前Activity（堆栈中最后一个压入的）
     */
    public void finish() {
        if (!activityStack.isEmpty()) {
            Activity activity = activityStack.lastElement();
            finishActivity(activity);
        }

    }

    /**
     * 结束指定的Activity
     *
     * @param activity
     */
    public void finishActivity(Activity activity) {
        if (activity != null) {
            activityStack.remove(activity);
            activity.finish();
            activity = null;
        }
    }

    /**
     * 结束指定类名的Activity
     *
     * @param cls
     */
    public void finishActivity(Class<?> cls) {
        for (Activity activity : activityStack) {
            if (activity.getClass().equals(cls)) {
                finishActivity(activity);
            }
        }
    }

    /**
     * get指定类名的Activity
     *
     * @param cls
     * @return
     */
    public Activity getActivity4ClassName(Class<?> cls) {
        for (Activity activity : activityStack) {
            if (activity.getClass().equals(cls)) {
                return activity;
            }
        }
        return null;
    }

    /**
     * 结束所有Activity
     */
    public void finishAllActivity() {
        for (int i = 0, size = activityStack.size(); i < size; i++) {
            if (null != activityStack.get(i)) {
                activityStack.get(i).finish();
            }
        }
        activityStack.clear();
    }

    /**
     * 任意地方获取到前台Activity
     *
     * @return
     */
    public Activity getTaskTop() {
        return activityStack.get(activityStack.size() - 1);
    }

    /**
     * 退出应用程序
     *
     * @param context      上下文
     * @param isBackground 是否开开启后台运行
     */
    public void appExit(Context context, boolean isBackground) {
        try {
            finishAllActivity();
            ActivityManager activityMgr = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
            activityMgr.restartPackage(context.getPackageName());
        } catch (Exception e) {

        } finally {
            // 注意，如果您有后台程序运行，请不要执行此句子
            if (!isBackground) {
                Process.killProcess(Process.myPid());
                System.exit(0);
            }
        }
    }
}
