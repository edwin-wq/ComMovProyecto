package com.example.commovproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ConsultarModeradoresActivity extends AppCompatActivity implements View.OnClickListener{
    ImageButton regresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_moderadores);

        regresa=(ImageButton) findViewById(R.id.imageButtonRegresar);

        regresa.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case (R.id.imageButtonRegresar):
                startActivity(new Intent(ConsultarModeradoresActivity.this, MnModeradoresActivity.class));
                finish();
                break;

        }
    }
}