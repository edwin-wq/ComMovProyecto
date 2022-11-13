package com.example.commovproyecto;

import android.content.Intent;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class InicioModeradoresActivity extends AppCompatActivity implements View.OnClickListener{


    EditText correo, pwsM;
    Button btniniciar;
    ImageButton btnregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_moderadores);

        correo = (EditText) findViewById(R.id.editTextCorreo);
        pwsM =(EditText) findViewById(R.id.editTextPassword);
        btniniciar = (Button) findViewById(R.id.buttonIngresarM);
        btnregresar =(ImageButton) findViewById(R.id.imageButtonRegresar);

        btniniciar.setOnClickListener(this);
        btnregresar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonIngresarM:


                break;

            case R.id.imageButtonRegresar:
                startActivity(new Intent(InicioModeradoresActivity.this, MainActivity.class));
                break;
    }



    }
}