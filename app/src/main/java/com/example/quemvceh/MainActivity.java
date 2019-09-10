package com.example.quemvceh;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNome = findViewById(R.id.edNome);
    }

    public void onClick (View view){
        String nome = edNome.getText().toString();

        Intent intent = new Intent(getApplicationContext(), Resultado.class);
        intent.putExtra("nome", nome);
        startActivity(intent);
    }
}
