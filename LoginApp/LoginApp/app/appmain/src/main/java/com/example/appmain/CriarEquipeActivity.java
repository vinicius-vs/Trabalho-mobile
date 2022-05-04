package com.example.appmain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class CriarEquipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_equipe);

        Spinner listaJogos = findViewById(R.id.JogoGrupo);
        String[] jogos = new String[]{
                "League of Legends",
                "Counter-Strike: GO"
        };
        ArrayAdapter<String>  listaJogosAdapter = new ArrayAdapter<String>(this,  android.R.layout.simple_spinner_item, jogos);
        listaJogos.setAdapter(listaJogosAdapter);

        Spinner visibilidade = findViewById(R.id.visibilidade);
        String[] privPubli = new String[]{
                "Privado",
                "Publico"
        };
        ArrayAdapter<String> visibilidadeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, privPubli);
        visibilidade.setAdapter(visibilidadeAdapter);

        Button buttonCriar = (Button) findViewById(R.id.buttonCriar);
        buttonCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Função em construção ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button buttonCancelarEquipe = (Button) findViewById(R.id.CancelarEquipe);
        buttonCancelarEquipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                retornarPaginaEquipe(view);
            }
        });

    }
    public void retornarPaginaEquipe(View view){
        Intent intent = new Intent(this, EquipeActivity.class);
        startActivity(intent);
    }
}