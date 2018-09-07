package com.bozdreams.mvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.bozdreams.R;
import com.bozdreams.mvp.presenter.LoginPresenter;
import com.bozdreams.mvp.presenter.LoginPresenterImpl;

/**
 * 业务名:
 * 功能说明:
 * 编写日期: 2018/9/3 11:50
 * 作者:zhangbo
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
public class MvpActivity extends Activity implements LoginView, View.OnClickListener {

    /**
     * 圈形进度条
     */
    private LinearLayout progressBar;
    /**
     * 用户名输入框
     */
    private EditText username;
    /**
     * 密码输入框
     */
    private EditText password;
    /**
     * 登录按钮
     */
    private Button loginButton;
    /**
     * 表示器
     */
    private LoginPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        findViews();
        setListener();
        setPresenter();
    }

    /**
     * 获取控件对象
     */
    private void findViews() {
        progressBar = (LinearLayout) findViewById(R.id.progress);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.loginButton);
    }

    /**
     * 监听绑定
     */
    private void setListener() {
        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        presenter.validateCredentials(username.getText().toString(), password.getText().toString());
    }

    /**
     * 设置presenter
     */
    private void setPresenter() {
        presenter = new LoginPresenterImpl(this);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        username.setError("用户名无效");
    }

    @Override
    public void setPasswordError() {
        password.setError("密码无效");
    }

    @Override
    public void navigateToHome() {
        hideProgress();
        Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }
}
