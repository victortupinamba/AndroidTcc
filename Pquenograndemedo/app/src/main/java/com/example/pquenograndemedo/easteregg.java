package com.example.pquenograndemedo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class easteregg extends AppCompatActivity {

    Button buttonvolt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easteregg);

        Button voltar = findViewById(R.id.buttonvolt);
        voltar.setOnClickListener(view -> {
            Intent intent;
            intent = new Intent(easteregg.this, MainActivity.class);
            startActivity(intent);

        });
    }


}