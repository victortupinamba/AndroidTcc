package com.example.pquenograndemedo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class historia extends AppCompatActivity {


    Button buttonvtr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);

        ImageButton voltar = findViewById(R.id.buttonvtr);
        voltar.setOnClickListener(view -> {
            Intent intent;
            intent = new Intent(historia.this, MainActivity.class);
            startActivity(intent);

        });

    }
    }