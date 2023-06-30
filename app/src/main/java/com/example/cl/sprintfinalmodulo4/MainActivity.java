package com.example.cl.sprintfinalmodulo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cl.sprintfinalmodulo4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


        binding.btnIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activitySegundaPantalla = new Intent(getBaseContext(), SegundaPantalla.class);
                startActivity(activitySegundaPantalla);
            }
        });

        //binding.btnIr.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {

          //  }
        //});

    }
}