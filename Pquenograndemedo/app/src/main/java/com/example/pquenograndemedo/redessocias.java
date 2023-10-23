package com.example.pquenograndemedo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class redessocias extends AppCompatActivity {

    Button btnInstagram;
    Button btnThreads;

    Button buttonaaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redessocias);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnInstagram = findViewById(R.id.btnInstagram);
        btnInstagram.setOnClickListener(v -> {
            String url = "https://instagram.com/sirius_entmt?igshid=MzRlODBiNWFlZA==";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnThreads = findViewById(R.id.btnThreads);
        btnThreads.setOnClickListener(v -> {
            String url = "https://www.linkedin.com/in/sirius-entertainment-5824b5270?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        Button voltar = findViewById(R.id.buttonaaa);
        voltar.setOnClickListener(view -> {
            Intent intent;
            intent = new Intent(redessocias.this, MainActivity.class);
            startActivity(intent);

        });
    }

}