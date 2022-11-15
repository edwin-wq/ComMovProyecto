package com.example.commovproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton moderadores, salas, regresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        moderadores =(ImageButton) findViewById(R.id.imageButtonModeradores);
        salas =(ImageButton) findViewById(R.id.imageButtonSalas);
        regresar =(ImageButton) findViewById(R.id.imageButtonSalir);

        moderadores.setOnClickListener(this);
        salas.setOnClickListener(this);
        regresar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
       switch (view.getId()){
           case(R.id.imageButtonModeradores):
               startActivity(new Intent(MenuActivity.this, MnModeradoresActivity.class));
               finish();
               break;

           case(R.id.imageButtonSalas):
               startActivity(new Intent(MenuActivity.this, MnSalasActivity.class));
               finish();
               break;

           case(R.id.imageButtonSalir):
               startActivity(new Intent(MenuActivity.this, MainActivity.class));
               finish();
               break;
        }
    }
}