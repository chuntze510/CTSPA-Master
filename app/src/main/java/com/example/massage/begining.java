package com.example.massage;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class begining extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begining);

        new Handler().postDelayed(new Runnable(){

            @Override
            public void run(){
                Intent intent = new Intent(begining.this, MainActivity.class);
                startActivity(intent);
                //跳出回到main阿咖踢
                finish();
            }}
            ,
                SPLASH_TIME_OUT);
    }
}
