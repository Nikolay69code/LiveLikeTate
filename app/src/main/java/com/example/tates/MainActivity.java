package com.example.tates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.MediaController;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.pretext1);
        Random random = new Random();
        int rtext = 1 + random.nextInt(10);
        switch (rtext){
            case 1:
                textView.setText(R.string.text1);
                break;
            case 2:
                textView.setText(R.string.text2);
                break;
            case 3:
                textView.setText(R.string.text3);
                break;
            case 4:
                textView.setText(R.string.text4);
                break;
            case 5:
                textView.setText(R.string.text5);
                break;
            case 6:
                textView.setText(R.string.text6);
                break;
            case 7:
                textView.setText(R.string.text7);
                break;
            case 8:
                textView.setText(R.string.text8);
                break;
            case 9:
                textView.setText(R.string.text9);
                break;
            case 10:
                textView.setText(R.string.text10);
                break;
            case 11:
                textView.setText(R.string.text11);
                break;
            case 12:
                textView.setText(R.string.text12);
                break;
            case 13:
                textView.setText(R.string.text13);
                break;
            case 14:
                textView.setText(R.string.text14);
                break;
            case 15:
                textView.setText(R.string.text15);
                break;
            case 16:
                textView.setText(R.string.text16);
                break;
            case 17:
                textView.setText(R.string.text17);
                break;
            case 18:
                textView.setText(R.string.text18);
                break;
            case 19:
                textView.setText(R.string.text19);
                break;
            case 20:
                textView.setText(R.string.text20);
                break;
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, BasicActivity.class);
                startActivity(intent);
                finish();
            }
        }, 7000);
    }
}