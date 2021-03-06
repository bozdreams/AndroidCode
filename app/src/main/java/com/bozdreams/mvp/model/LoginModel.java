package com.bozdreams.mvp.model;


import com.bozdreams.mvp.presenter.OnLoginFinishedListener;

/**
 * 模拟登录的操作的接口，实现类为LoginModelImpl.相当于MVP模式中的Model层
 * @version 1.0
 */
public interface LoginModel {
    void login(String username, String password, OnLoginFinishedListener listener);
}
