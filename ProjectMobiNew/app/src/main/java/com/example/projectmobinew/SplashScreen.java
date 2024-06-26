package com.example.projectmobinew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //запуск окна splash screen и указание следующего окна
                Intent intent = new Intent(SplashScreen.this, Onboarding1.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}