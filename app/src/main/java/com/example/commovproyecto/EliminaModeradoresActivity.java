package com.example.commovproyecto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.commovproyecto.adaptadores.ListaModeradoresAdapter;
import com.example.commovproyecto.adaptadores.ListaPrElModeradoresAdapter;
import com.example.commovproyecto.db.DbModeradores;
import com.example.commovproyecto.db.DbHelper;
import com.example.commovproyecto.entidades.ModeradoresClass;

import java.util.ArrayList;

public class EliminaModeradoresActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton busca, cancelar;
    EditText nombre;

    RecyclerView listaModeradoresElimina;
    ArrayList<ModeradoresClass> listaArrayModeradoresEl;
    ListaPrElModeradoresAdapter adapter;
    ModeradoresClass moderadores;
    int id =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elimina_moderadores);

        listaModeradoresElimina = findViewById(R.id.ListaModeradoresEliminar);
        cancelar=(ImageButton) findViewById(R.id.imageButtonCancelar) ;
        busca=(ImageButton) findViewById(R.id.imageButtonBuscar);

        listaModeradoresElimina.setLayoutManager(new LinearLayoutManager(this));

        busca.setOnClickListener(this);
        cancelar.setOnClickListener(this);

        DbModeradores dbModeradores = new DbModeradores(EliminaModeradoresActivity.this);
        listaArrayModeradoresEl = new ArrayList<>();
       adapter = new ListaPrElModeradoresAdapter(dbModeradores.mostrarModeradoresEliminar());
        listaModeradoresElimina.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case(R.id.imageButtonCancelar):
                startActivity(new Intent(EliminaModeradoresActivity.this, MnModeradoresActivity.class));
                finish();
                break;


        }
    }
}