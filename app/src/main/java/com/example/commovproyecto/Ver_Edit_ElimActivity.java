package com.example.commovproyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.commovproyecto.adaptadores.ListaModeradoresAdapter;
import com.example.commovproyecto.adaptadores.ListaPrElModeradoresAdapter;
import com.example.commovproyecto.db.DbModeradores;
import com.example.commovproyecto.entidades.ModeradoresClass;

import java.util.ArrayList;

public class Ver_Edit_ElimActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton eliminar, editar, guardar,cancelar;
    EditText nombre, correo, institucion, pssw1,pssw2;
    String[] areas1 = {"area1","area2","area3"};
    String[] areas2 = {"area1","area2","area3"};

    AutoCompleteTextView autoCompleteTxtA1;
    ArrayAdapter<String> adapterAreas1;

    AutoCompleteTextView autoCompleteTxtA2;
    ArrayAdapter<String> adapterAreas2;

    ModeradoresClass moderadores;

    RecyclerView listaModeradorElimina;
    ArrayList<ModeradoresClass> listaArrayModeradoresEl;
    ListaPrElModeradoresAdapter adapter;

    int id = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_edit_elim);


        nombre =(EditText) findViewById(R.id.editTextNombreM);
        correo =(EditText) findViewById(R.id.editTextCorreo);
        institucion =(EditText) findViewById(R.id.editTextInstitucion);
        pssw1 =(EditText) findViewById(R.id.editTextContraseñaM);
        pssw2 =(EditText) findViewById(R.id.editTextContraseñaM2);

        autoCompleteTxtA1 = findViewById(R.id.auto_complete_txtA1);
        autoCompleteTxtA2 = findViewById(R.id.auto_complete_txtA2);

        eliminar =(ImageButton) findViewById(R.id.imageButtonEliminar);
        editar =(ImageButton) findViewById(R.id.imageButtonEditar);
        guardar =(ImageButton) findViewById(R.id.imageButtonGuardar);
        cancelar =(ImageButton) findViewById(R.id.imageButtonCancelar);

        adapterAreas1 =new ArrayAdapter<String>(this,R.layout.list_area_1,areas1);
        autoCompleteTxtA1.setAdapter(adapterAreas1);

        adapterAreas2 =new ArrayAdapter<String>(this,R.layout.list_area_1,areas2);
        autoCompleteTxtA2.setAdapter(adapterAreas2);


        autoCompleteTxtA1.setOnClickListener(this);
        autoCompleteTxtA2.setOnClickListener(this);
        eliminar.setOnClickListener(this);
        editar.setOnClickListener(this);
        guardar.setOnClickListener(this);
        cancelar.setOnClickListener(this);


        if(savedInstanceState == null){
            Bundle extras = getIntent().getExtras();
            if (extras == null){
                id = Integer.parseInt(null);
            }else{
                id = extras.getInt("ID");
            }
        }else{
            id = (int) savedInstanceState.getSerializable("ID");
        }
        DbModeradores dbModeradores = new DbModeradores(Ver_Edit_ElimActivity.this);
        moderadores= dbModeradores.verModeradores(id);

        if (moderadores != null){
            nombre.setText((moderadores.getNombre()));
            correo.setText((moderadores.getCorreo()));
            institucion.setText((moderadores.getInstitucion()));
            pssw1.setText((moderadores.getPassw()));
            autoCompleteTxtA1.setText((moderadores.getArea1()));
            autoCompleteTxtA2.setText((moderadores.getArea2()));
            // pssw2.setText((moderadores.getPssw2()));
            guardar.setVisibility(View.INVISIBLE);
            nombre.setInputType(InputType.TYPE_NULL);
            correo.setInputType(InputType.TYPE_NULL);
            institucion.setInputType(InputType.TYPE_NULL);
            pssw1.setInputType(InputType.TYPE_NULL);
            pssw2.setInputType(InputType.TYPE_NULL);
            autoCompleteTxtA1.setInputType(InputType.TYPE_NULL);
            autoCompleteTxtA2.setInputType(InputType.TYPE_NULL);


        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){



        }
    }
    }
