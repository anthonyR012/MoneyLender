package com.anthony.moneylender.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.anthony.moneylender.ui.login.LoginActivity;

import java.util.concurrent.TimeUnit;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            TimeUnit.SECONDS.sleep(1);
            startActivity(new Intent(this, LoginActivity.class));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}