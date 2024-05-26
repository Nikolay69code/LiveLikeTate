package com.example.tates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BasicActivity extends AppCompatActivity {
    Button successButton;
    Button goalsButton;
    Button maneyButton;
    Button chelendgeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        successButton = findViewById(R.id.button);
        goalsButton = findViewById(R.id.button2);
        maneyButton = findViewById(R.id.button3);
        chelendgeButton = findViewById(R.id.button4);

        chelendgeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BasicActivity.this, SpecealActivity.class);
                startActivity(intent);
            }
        });

        successButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BasicActivity.this, SuccessActivity.class);
                startActivity(intent);
            }
        });
        goalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BasicActivity.this, GoalsActivity.class);
                startActivity(intent);
            }
        });
        maneyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BasicActivity.this, MoneysActivity.class);
                startActivity(intent);
            }
        });

    }

}