package com.example.appmain.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.appmain.CriarEquipeActivity;
import com.example.appmain.R;
import com.google.android.material.snackbar.Snackbar;

public class FragmentEquipe extends Fragment {

    Button buttonCriar;
    ImageView buttonPesquisar;
    View newView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        newView = inflater.inflate(R.layout.fragment_equipe,container,false);
        buttonCriar = (Button) newView.findViewById(R.id.buttonCriar);
        buttonPesquisar = (ImageView) newView.findViewById(R.id.Pesquisa);


        buttonPesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Função em construção ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        buttonCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Função em construção ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        return newView;
    }


}
