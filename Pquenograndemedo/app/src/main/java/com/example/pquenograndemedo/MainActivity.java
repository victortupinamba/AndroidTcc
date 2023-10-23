package com.example.pquenograndemedo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button hist = findViewById(R.id.btnhist);
        hist.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, historia.class);
            startActivity(intent);

        });


        Button perso = findViewById(R.id.btnperso);
        perso.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, personagem.class);
            startActivity(intent);

        });


        Button EasterEgg = findViewById(R.id.btnEasteregg);
        EasterEgg.setOnClickListener(view -> {
            Intent intent;
            intent = new Intent(MainActivity.this, easteregg.class);
            startActivity(intent);

        });

        Button RedesSociais = findViewById(R.id.btnRedesSociais);
        RedesSociais.setOnClickListener(view -> {
            Intent intent;
            intent = new Intent(MainActivity.this, redessocias.class);
            startActivity(intent);

        });
    }
}