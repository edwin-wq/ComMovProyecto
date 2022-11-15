package com.example.commovproyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.commovproyecto.entidades.ModeradoresClass;

import java.util.ArrayList;

public class ConsultarModeradoresActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton regresa;
    RecyclerView listaModeradores;
    ArrayList<ModeradoresClass> listaArrayModeradores;
    //ListaContactosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_moderadores);

        listaModeradores = findViewById(R.id.ListaModeradores);
        regresa=(ImageButton) findViewById(R.id.imageButtonRegresar);

        listaModeradores.setLayoutManager(new LinearLayoutManager(this));

        regresa.setOnClickListener(this);


    }





    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case (R.id.imageButtonRegresar):
                startActivity(new Intent(ConsultarModeradoresActivity.this, MnModeradoresActivity.class));
                finish();
                break;
        }
    }
}