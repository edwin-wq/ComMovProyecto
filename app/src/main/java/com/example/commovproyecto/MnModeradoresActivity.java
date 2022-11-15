package com.example.commovproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MnModeradoresActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton altas, elimina, consulta, remplaza, regresa
            ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mn_moderadores);

        altas=(ImageButton) findViewById(R.id.imageButtonAltasM);
        elimina=(ImageButton) findViewById(R.id.imageButtonEliminarM);
        consulta=(ImageButton) findViewById(R.id.imageButtonConsultarM);
        remplaza=(ImageButton) findViewById(R.id.imageButtonRemplazarM);
        regresa=(ImageButton) findViewById(R.id.imageButtonRegresar);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case(R.id.imageButtonAltasM):
                startActivity(new Intent(MnModeradoresActivity.this, AltasModeradoresActivity.class));
                finish();
                break;

            case(R.id.imageButtonEliminarM):
                startActivity(new Intent(MnModeradoresActivity.this, EliminaModeradoresActivity.class));
                finish();
                break;

            case(R.id.imageButtonConsultarM):
                startActivity(new Intent(MnModeradoresActivity.this, ConsultarModeradoresActivity.class));
                finish();
                break;
            case(R.id.imageButtonRemplazarM):
                startActivity(new Intent(MnModeradoresActivity.this, RemplazoModeradoresActivity.class));
                finish();
                break;

            case(R.id.imageButtonRegresar):
                startActivity(new Intent(MnModeradoresActivity.this, MenuActivity.class));
                finish();
                break;
        }
    }
}