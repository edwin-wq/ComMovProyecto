package com.example.commovproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class EliminaModeradoresActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton busca, elimina, cancelar;
    EditText nombre, correo, area1, area2, institucion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elimina_moderadores);

        busca=(ImageButton) findViewById(R.id.imageButtonBuscar);
        elimina=(ImageButton) findViewById(R.id.imageButtonEliminarM);
        cancelar=(ImageButton) findViewById(R.id.imageButtonCancelar);

        nombre=(EditText) findViewById(R.id.editTextNombreM);
        correo=(EditText) findViewById(R.id.editTextCorreo);
        area1=(EditText) findViewById(R.id.editAreaPricial);
        area2=(EditText) findViewById(R.id.editAreaSecundaria);
        institucion=(EditText) findViewById(R.id.editTextInstitucion);

        busca.setOnClickListener(this);
        elimina.setOnClickListener(this);
        cancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //case(R.id.imageButtonCancelar):
              //  break;

            case(R.id.imageButtonCancelar):
                startActivity(new Intent(EliminaModeradoresActivity.this, MnModeradoresActivity.class));
                finish();
                break;


        }
    }
}