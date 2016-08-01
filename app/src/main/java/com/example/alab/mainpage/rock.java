package com.example.alab.mainpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class rock extends AppCompatActivity {

    Button b_rock, b_paper, b_scissors;
    ImageView iv_cpu, iv_me;

    String myChoice, cpuChoice, result;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);



        iv_cpu = (ImageView) findViewById(R.id.iv_cpu);
        iv_me = (ImageView) findViewById(R.id.iv_me);

        b_rock = (Button) findViewById(R.id.b_rock);
        b_paper = (Button) findViewById(R.id.b_paper);
        b_scissors = (Button) findViewById(R.id.b_scissors);

        r = new Random();

        b_rock.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                myChoice = "rock";
                iv_me.setImageResource(R.drawable.rock);
                calculate();
            }
        });

        b_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myChoice = "paper";
                iv_me.setImageResource(R.drawable.paper);
                calculate();
            }
        });

        b_scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myChoice = "scissors";
                iv_me.setImageResource(R.drawable.scissors);
                calculate();
            }
        });
    }

    public void  calculate(){
        int cpu = r.nextInt(3);
        if(cpu == 0) {
            cpuChoice = "rock";
            iv_cpu.setImageResource(R.drawable.rock);
        } else if (cpu == 1) {
            cpuChoice = "paper";
            iv_cpu.setImageResource(R.drawable.paper);
        } else if (cpu == 2) {
            cpuChoice = "scissors";
            iv_cpu.setImageResource(R.drawable.scissors);
        }

        if (myChoice.equals("rock") && cpuChoice.equals("paper")) {
            result = "You lose!";
        } else
        if (myChoice.equals("rock") && cpuChoice.equals("scissors")) {
            result = "You win!";
        } else
        if (myChoice.equals("paper") && cpuChoice.equals("rock")) {
            result = "You win!";
        } else
        if (myChoice.equals("paper") && cpuChoice.equals("scissors")) {
            result = "You lost!";
        } else
        if (myChoice.equals("scissors") && cpuChoice.equals("paper")) {
            result = "You win!";
        } else
        if (myChoice.equals("scissors") && cpuChoice.equals("rock")) {
            result = "You lost!";
        } else
        if(myChoice.equals("rock") && cpuChoice.equals("rock")) {
            result = "Play again!";
        } else
        if (myChoice.equals("paper") && cpuChoice.equals("paper")) {
            result = "Play again!";
        } else
        if (myChoice.equals("scissors") && cpuChoice.equals("scissors")) {
            result = "Play again!";
        }



        Toast.makeText(rock.this, result, Toast.LENGTH_SHORT).show();



    }
}
