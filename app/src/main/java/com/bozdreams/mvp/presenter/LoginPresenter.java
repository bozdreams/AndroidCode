package com.bozdreams.mvp.presenter;

/**
 * 登录的　Presenter 的接口，实现类为LoginPresenterImpl，完成登录的验证，以及销毁当前view
 * Created by Administrator on 2016/7/3.
 */
public interface LoginPresenter {
    /**
     * 登录验证处理
     * @param username 登录名
     * @param password 登录密码
     */
    void validateCredentials(String username, String password);

    void onDestroy();
}
