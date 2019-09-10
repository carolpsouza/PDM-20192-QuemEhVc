package com.example.quemvceh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class Resultado extends AppCompatActivity {

    TextView tvNome;
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvNome = findViewById(R.id.tvNome);
        tvResultado = findViewById(R.id.tvResultado);

        String nome = this.getIntent().getStringExtra("nome");

        tvNome.setText(nome);

        String[] personalidade = {"Você é legal!", "Você é chato!", "Você é bonitinho", "Uma plática te resolve"};
        int qual = new Random().nextInt(2);

        tvResultado.setText(personalidade[qual]);
    }
}
