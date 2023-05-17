package com.mid_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.Objects;

public class Splah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah);

        Objects.requireNonNull(getSupportActionBar()).hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Splah.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },2200);
    }
}