package com.bozdreams.mvp.presenter;

/**
 * 登录事件监听
 * @version 1.0
 */
public interface OnLoginFinishedListener {

    void onUsernameError();

    void onPasswordError();

    /**
     * 登录成功的业务处理
     */
    void onSuccess();
}
