package com.jasonzou.retrofitdemo.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jasonzou.retrofitdemo.ui.guidepage.GuidePageActivity;

/**
 * 启动页
 */
public class LaunchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, GuidePageActivity.class));
        finish();
    }
}
