package com.bozdreams.mvp.view;

/**
 * Created by Administrator on 2016/7/3.
 */
public interface LoginView {
    
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
