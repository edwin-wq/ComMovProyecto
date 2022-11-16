package com.example.commovproyecto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import com.example.commovproyecto.db.DbModeradores;
import com.example.commovproyecto.db.DbHelper;
import com.example.commovproyecto.entidades.ModeradoresClass;

public class EliminaModeradoresActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton busca, elimina, cancelar;
    EditText nombre, correo, area1, area2, institucion;
    ModeradoresClass moderadores;
    int id =0;

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
            case(R.id.imageButtonEliminarM):

                final DbModeradores dbModeradores = new DbModeradores(EliminaModeradoresActivity.this);
                moderadores = dbModeradores.verModeradores(id);

                        AlertDialog.Builder builder = new AlertDialog.Builder(EliminaModeradoresActivity.this);
                        builder.setMessage("¿Desea eliminar este contacto?")
                                .setPositiveButton("SI", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {

                                        if(dbModeradores.eliminarModerador(id)){
                                            startActivity(new Intent(EliminaModeradoresActivity.this, MnModeradoresActivity.class));
                                            finish();
                                        }
                                    }
                                })
                                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {

                                    }
                                }).show();
               break;

            case(R.id.imageButtonCancelar):
                startActivity(new Intent(EliminaModeradoresActivity.this, MnModeradoresActivity.class));
                finish();
                break;


        }
    }
}