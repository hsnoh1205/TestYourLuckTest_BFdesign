package com.example.alab.mainpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        Button b_ball = (Button) findViewById(R.id.b_ball);
        b_ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ball.class);
                startActivityForResult(intent, 0);
            }
        });
        Button b_bottle = (Button) findViewById(R.id.b_bottle);
        b_bottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), bottle.class);
                startActivityForResult(intent, 0);
            }
        });
        Button b_coin = (Button) findViewById(R.id.b_coin);
        b_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), coin.class);
                startActivityForResult(intent, 0);
            }
        });
        Button b_Updown = (Button) findViewById(R.id.b_Updown);
        b_Updown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Updown.class);
                startActivityForResult(intent, 0);
            }
        });
        Button b_Rock = (Button) findViewById(R.id.b_rock);
        b_Rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Rock.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
