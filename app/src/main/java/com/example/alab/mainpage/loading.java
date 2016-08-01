package com.example.alab.mainpage;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

    Handler handler =new Handler();
    handler.postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent intent =new Intent(getApplicationContext(), MainPage.class);
            startActivity(intent);
            finish();
        }
    },2000);
}
}
