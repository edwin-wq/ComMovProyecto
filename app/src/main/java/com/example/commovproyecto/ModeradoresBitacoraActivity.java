package com.example.commovproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.FileObserver;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class ModeradoresBitacoraActivity extends AppCompatActivity implements View.OnClickListener {

    EditText horaI, comentario, horaF;
    ImageButton guarda1, guarda2, guarda3, regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moderadores_bitacora);

        horaI= (EditText) findViewById(R.id.editTextHoradeInicio);
        horaF= (EditText) findViewById(R.id.editTextHoradeFin);
        comentario=(EditText) findViewById(R.id.editTextTextPersonName);

        guarda1=(ImageButton) findViewById(R.id.imageButtonG1);
        guarda2=(ImageButton) findViewById(R.id.imageButtonG2);
        guarda3=(ImageButton) findViewById(R.id.imageButtonG3);
        regresar=(ImageButton) findViewById(R.id.imageButtonRegresar);

        guarda1.setOnClickListener(this);
        guarda2.setOnClickListener(this);
        guarda3.setOnClickListener(this);
        regresar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
           // case():
             //   break;
            case(R.id.imageButtonRegresar):
                startActivity(new Intent(ModeradoresBitacoraActivity.this, LoginModeradoresActivity.class));
                finish();
                break;


        }

    }
}