package com.example.appmain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;




public class EquipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_equipe);
    }

    public void procurarGrupos (View view){

    }

    public void CriarGrupos(View view){
        Intent intent = new Intent(this,CriarEquipeActivity.class);
        startActivity(intent);
    }

}