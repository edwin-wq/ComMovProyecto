package com.example.commovproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario, constrasena;
    Button btningresa, btnloginMod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.editTextUser);
        constrasena = findViewById(R.id.editTextPassword);
        btningresa = findViewById(R.id.buttonIngresar);
        btnloginMod =findViewById(R.id.buttonIniciarModeradores);

        btningresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usuario.getText().toString().equals("Admin")&& constrasena.getText().toString().equals("0519gomez")){
                    startActivity(new Intent(MainActivity.this, MenuActivity.class));
                }
                else {
                    Toast.makeText(MainActivity.this,"Usuario o contraseña incorrecta", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnloginMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, InicioModeradoresActivity.class));
            }
        });

    }
}