package com.example.commovproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class LoginModeradoresActivity extends AppCompatActivity implements View.OnClickListener{

    EditText correoU, contrasena;
    Button btningresa;
    ImageButton imgBtnregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_moderadores);

        correoU =(EditText) findViewById(R.id.editTextCorreo);
        contrasena =(EditText) findViewById(R.id.editTextTextPassword);
        btningresa =(Button) findViewById(R.id.buttonIngresarM);
        imgBtnregresar =(ImageButton) findViewById(R.id.imageButtonRegresar);

        btningresa.setOnClickListener(this);
        imgBtnregresar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonIngresarM:

                if(correoU.getText().toString().equals("ed")&& contrasena.getText().toString().equals("05")){
                    startActivity(new Intent(LoginModeradoresActivity.this, ModeradoresBitacoraActivity.class));
                    finish();
                }
                else {
                    Toast.makeText(LoginModeradoresActivity.this,"Usuario o contraseña incorrecta", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.imageButtonRegresar:
                startActivity(new Intent(LoginModeradoresActivity.this, MainActivity.class));
                finish();
                break;

        }
    }
}