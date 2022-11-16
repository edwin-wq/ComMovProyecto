package com.example.commovproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText usuario, contrasena;
    Button btningresa, btnloginMod;
    ImageButton imgBtnsalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText) findViewById(R.id.editTextUser);
        contrasena = (EditText) findViewById(R.id.editTextPassword);
        btningresa = (Button) findViewById(R.id.buttonIngresar);
        btnloginMod =(Button) findViewById(R.id.buttonIniciarModeradores);
        imgBtnsalir = (ImageButton)findViewById(R.id.imageButtonSalir);

        btningresa.setOnClickListener(this);
        btnloginMod.setOnClickListener(this);
        imgBtnsalir.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonIngresar:
                if(usuario.getText().toString().equals("ed")&& contrasena.getText().toString().equals("05")){
                    startActivity(new Intent(MainActivity.this, MenuActivity.class));
                    finish();
                }
                else {
                    Toast.makeText(MainActivity.this,"Usuario o contraseña incorrecta", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.buttonIniciarModeradores:
                startActivity(new Intent(MainActivity.this, LoginModeradoresActivity.class));
                finish();
                //startActivity(new Intent(MainActivity.this, MnModeradoresActivity.class));

                break;
            case R.id.imageButtonSalir:

        }
    }
}



