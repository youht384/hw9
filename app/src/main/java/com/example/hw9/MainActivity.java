package com.example.hw9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int random;
    private int guessTime;
    private boolean ReturnGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();
        ReturnGame = intent.getBooleanExtra("ReturnGame",true);
        guessTime = intent.getIntExtra("guessTime",0);
        random = intent.getIntExtra("random",0);

        if (ReturnGame == true){
            random =  (int)(Math.random()* 9+1);
            intent.putExtra("ReturnGame", false);
        }

        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("InputN", 1);
                intent.putExtra("guessTime",guessTime );
                startActivity(intent);
            }
        });
        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("InputN", 2);
                intent.putExtra("guessTime",guessTime );
                startActivity(intent);
            }
        });
        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("InputN", 3);
                intent.putExtra("guessTime",guessTime );
                startActivity(intent);
            }
        });
        final Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("InputN", 4);
                intent.putExtra("guessTime",guessTime );
                startActivity(intent);
            }
        });
        final Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("InputN", 5);
                intent.putExtra("guessTime",guessTime );
                startActivity(intent);
            }
        });
        final Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("InputN", 6);
                intent.putExtra("guessTime",guessTime );
                startActivity(intent);
            }
        });
        final Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("InputN", 7);
                intent.putExtra("guessTime",guessTime );
                startActivity(intent);
            }
        });
        final Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("InputN", 8);
                intent.putExtra("guessTime",guessTime );
                startActivity(intent);
            }
        });
        final Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("random", random);
                intent.putExtra("InputN", 9);
                intent.putExtra("guessTime",guessTime );
                startActivity(intent);
            }
        });
        final Button R_button = (Button) findViewById(R.id.R_button);
        R_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                random =  (int)(Math.random()* 9+1);
                guessTime = 0;

            }
        });
    }
}
