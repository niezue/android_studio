package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button= findViewById(R.id.btn);
        button.setOnClickListener((view -> {
            Intent intent = new Intent(this,Insides.class);
            startActivity(intent);
        }));
        Button button1 = findViewById(R.id.video);
        button1.setOnClickListener((view -> {
            Intent intent = new Intent(this,Video.class);
            startActivity(intent);

        }));


    }
}