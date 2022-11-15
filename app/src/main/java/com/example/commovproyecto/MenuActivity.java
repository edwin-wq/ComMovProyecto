package com.example.commovproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.commovproyecto.db.DbHelper;


public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton moderadores, salas, regresar, cargaBD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        moderadores =(ImageButton) findViewById(R.id.imageButtonModeradores);
        salas =(ImageButton) findViewById(R.id.imageButtonSalas);
        regresar =(ImageButton) findViewById(R.id.imageButtonSalir);
        cargaBD = (ImageButton) findViewById(R.id.imageButtonCreaBD);

        moderadores.setOnClickListener(this);
        salas.setOnClickListener(this);
        regresar.setOnClickListener(this);
        cargaBD.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
       switch (view.getId()){
           case(R.id.imageButtonModeradores):
               startActivity(new Intent(MenuActivity.this, MnModeradoresActivity.class));
               finish();
               break;

           case(R.id.imageButtonSalas):
               startActivity(new Intent(MenuActivity.this, MnSalasActivity.class));
               finish();
               break;
           case(R.id.imageButtonSalir):
               startActivity(new Intent(MenuActivity.this, MainActivity.class));
               finish();
               break;

           case(R.id.imageButtonCreaBD):

               DbHelper DBHelper= new DbHelper(MenuActivity.this);
               SQLiteDatabase db = DBHelper.getWritableDatabase();
               if(db !=null){
                   Toast.makeText(this,"BASE DE DATOS CREADA", Toast.LENGTH_LONG).show();
               }else {
                   Toast.makeText(this,"ERROR AL CREAR BASE DE DATOS", Toast.LENGTH_LONG).show();
               }

               break;
        }
    }
}