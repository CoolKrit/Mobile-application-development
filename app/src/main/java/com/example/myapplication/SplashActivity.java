package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.HandlerThread;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.logging.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.black));
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}
