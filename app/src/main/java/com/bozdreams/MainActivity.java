package com.bozdreams;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.bozdreams.mvp.view.MvpActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {


    @BindView(R.id.main_tv)
    TextView mainTv;
    public static final String SERVE_URL = BuildConfig.API_URL;
    public static final boolean DEBUG = BuildConfig.LOG_ON;

    @RequiresApi(api = Build.VERSION_CODES.DONUT)
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        String appName = this.getApplicationInfo().loadLabel(this.getPackageManager()).toString();
        String packageName = this.getPackageName();
        String className = this.getClass().getName();
        mainTv.setText("");
        mainTv.append("\nLOG_DEBUG:    " + DEBUG);
        mainTv.append("\n包名:    " + packageName);
        mainTv.append("\n类名:    " + className);
        mainTv.append("\nAppName:    " + appName);
        mainTv.append("\nSERVE_URL:    " + SERVE_URL);
    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    @OnClick(R.id.main_tv)
    public void onViewClicked() {
        Intent intent = new Intent(this, MvpActivity.class);
        startActivity(intent);
    }
}
