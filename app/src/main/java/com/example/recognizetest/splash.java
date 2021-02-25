package com.example.recognizetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);
        Timer t=new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent i=new Intent(splash.this,MainActivity.class);
                startActivity(i);

            }
        },3000);
    }
}