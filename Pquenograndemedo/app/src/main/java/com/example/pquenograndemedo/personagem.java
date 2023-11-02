package com.example.pquenograndemedo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class personagem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem);

        Button voltar = findViewById(R.id.buttonvol);
        voltar.setOnClickListener(view -> {
            Intent intent;
            intent = new Intent(personagem.this, MainActivity.class);
            startActivity(intent);

        });


    }
}