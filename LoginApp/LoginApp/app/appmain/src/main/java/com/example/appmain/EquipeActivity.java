package com.example.appmain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appmain.databinding.FragmentEquipeBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;




public class EquipeActivity extends AppCompatActivity {

    private FragmentEquipeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_equipe);

        binding = FragmentEquipeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.Pesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Função em construção ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                return;
            }
        });
        Button buttonCriar = (Button) findViewById(R.id.buttonCriar);

        buttonCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              criarEquipe(view);
            }
        });
    }

    public void criarEquipe(View view) {
        Intent intent = new Intent(this, CriarEquipeActivity.class);
        startActivity(intent);
        return;
    }

}