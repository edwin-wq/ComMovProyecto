package com.example.commovproyecto;

import android.os.Bundle;
import android.preference.EditTextPreference;
import android.provider.ContactsContract;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class InicioModeradoresActivity extends AppCompatActivity {


    EditText correo, pwsM;
    Button btniniciar, btnregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_moderadores);


        btnregresar = findViewById(R.id.buttonIngresarM);

    }
}