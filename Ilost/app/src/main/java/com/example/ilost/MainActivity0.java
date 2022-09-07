package com.example.ilost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
        startActivity(new Intent(MainActivity0.this,MainActivity1.class));
                   finish();
                    }
                },5000);
    }
}