package com.example.appmain;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.appmain.databinding.ActivityTabBinding;
import com.example.appmain.databinding.FragmentHomeBinding;
import com.example.appmain.ui.main.SectionsPagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {

    private FragmentHomeBinding  binding;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


Button publicarButton = (Button) findViewById(R.id.bPublicar);

publicarButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        return;
    }
});
      /*  binding = FragmentHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bPublicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Função em construção ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
}
