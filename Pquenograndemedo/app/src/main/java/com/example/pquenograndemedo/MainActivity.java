package com.example.pquenograndemedo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton hist = findViewById(R.id.btnhist);
        hist.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, historia.class);
            startActivity(intent);

        });


        ImageButton perso = findViewById(R.id.btnperso);
        perso.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, personagem.class);
            startActivity(intent);

        });


        ImageButton EasterEgg = findViewById(R.id.btnEasteregg);
        EasterEgg.setOnClickListener(view -> {
            Intent intent;
            intent = new Intent(MainActivity.this, easteregg.class);
            startActivity(intent);

        });

        ImageButton RedesSociais = findViewById(R.id.btnRedesSociais);
        RedesSociais.setOnClickListener(view -> {
            Intent intent;
            intent = new Intent(MainActivity.this, redessocias.class);
            startActivity(intent);

        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton btnSpotify = findViewById(R.id.imagebtnVoltar);
        btnSpotify.setOnClickListener(v -> {
            String url = "https://open.spotify.com/playlist/3dhi5IcjKffrhhCpM7rv2S?si=440bb814dc1e42eb&pt=029efe8907bd076fdd0361f4cf525c18";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton btnThreads = findViewById(R.id.imageButton);
        btnThreads.setOnClickListener(v -> {
            String url = "https://www.linkedin.com/in/sirius-entertainment-5824b5270?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });
    }
}