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
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);


        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Button button = binding.bPublicar;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar mySnackbar = Snackbar.make(view, "Em construção", Snackbar.LENGTH_LONG);
                mySnackbar.show();
            }
        });
    }
}
