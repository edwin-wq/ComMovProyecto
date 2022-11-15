package com.example.commovproyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class RemplazoModeradoresActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton busca, guardar, cancelar;
    EditText nombrebusc, nombre, correo, area1, area2, institucion, nombreMR,correoMR, passwMR, passMR2, institucionMR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remplazo_moderadores);

        busca=(ImageButton) findViewById(R.id.imageButtonBuscar);
        guardar=(ImageButton) findViewById(R.id.imageButtonGuardar);
        cancelar=(ImageButton) findViewById(R.id.imageButtonCancelar);

        nombrebusc=(EditText) findViewById(R.id.editTextBuscaM);
        nombre=(EditText) findViewById(R.id.editTextNombreM);
        correo=(EditText) findViewById(R.id.editTextCorreo);
        area1=(EditText) findViewById(R.id.editAreaPricial);
        area2=(EditText) findViewById(R.id.editAreaSecundaria);
        institucion=(EditText) findViewById(R.id.editTextInstitucion);
        nombreMR=(EditText) findViewById(R.id.editTextNombreMRempazo);
        correoMR=(EditText) findViewById(R.id.editTextCorreoMRemplazo);
        passwMR=(EditText) findViewById(R.id.editTextContraseñaM);
        passMR2=(EditText) findViewById(R.id.editTextContraseñaM2);
        institucionMR=(EditText) findViewById(R.id.editTextInstitucionMRemplazo);

        busca.setOnClickListener(this);
        guardar.setOnClickListener(this);
        cancelar.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //case():
              //  break;
            //case():
              //  break;
            case(R.id.imageButtonCancelar):
                startActivity(new Intent(RemplazoModeradoresActivity.this, MnModeradoresActivity.class));
                finish();
                break;
        }
    }
}