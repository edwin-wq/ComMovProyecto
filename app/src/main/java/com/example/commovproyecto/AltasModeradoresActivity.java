package com.example.commovproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.commovproyecto.db.DbModeradores;

public class AltasModeradoresActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nombre, correo, institucion, pssw1,pssw2;
    ImageButton guardar, canselar;
    String[] areas1 = {"area1","area2","area3"};
    String[] areas2 = {"area1","area2","area3"};
    //daoUsuarioModerClass dao;

    AutoCompleteTextView autoCompleteTxtA1;
    ArrayAdapter<String> adapterAreas1;

    AutoCompleteTextView autoCompleteTxtA2;
    ArrayAdapter<String> adapterAreas2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altas_moderadores);

        nombre =(EditText) findViewById(R.id.editTextNombreM);
        correo =(EditText) findViewById(R.id.editTextCorreo);
        institucion =(EditText) findViewById(R.id.editTextInstitucion);
        pssw1 =(EditText) findViewById(R.id.editTextContraseñaM);
        pssw2 =(EditText) findViewById(R.id.editTextContraseñaM2);
        guardar =(ImageButton) findViewById(R.id.imageButtonGuardar);
        canselar =(ImageButton) findViewById(R.id.imageButtonCancelar);
        autoCompleteTxtA1 = findViewById(R.id.auto_complete_txtA1);
        autoCompleteTxtA2 = findViewById(R.id.auto_complete_txtA2);

        adapterAreas1 =new ArrayAdapter<String>(this,R.layout.list_area_1,areas1);
        autoCompleteTxtA1.setAdapter(adapterAreas1);

        adapterAreas2 =new ArrayAdapter<String>(this,R.layout.list_area_1,areas2);
        autoCompleteTxtA2.setAdapter(adapterAreas2);


        guardar.setOnClickListener(this);
        canselar.setOnClickListener(this);
        autoCompleteTxtA1.setOnClickListener(this);
        autoCompleteTxtA2.setOnClickListener(this);
       // dao=new daoUsuarioModerClass(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButtonGuardar:

                if(!nombre.getText().toString().equals("") &&
                        !correo.getText().toString().equals("")&&
                        !institucion.getText().toString().equals("")&&
                        !pssw1.getText().toString().equals("")&&
                        !pssw2.getText().toString().equals("")&&
                        !autoCompleteTxtA1.getText().toString().equals("")&&
                        !autoCompleteTxtA2.getText().toString().equals("")) {

                     DbModeradores dbModeradores = new DbModeradores(AltasModeradoresActivity.this);
                    long id = dbModeradores.insertarModeradores(nombre.getText().toString(), correo.getText().toString(), institucion.getText().toString(),pssw1.getText().toString(),autoCompleteTxtA1.getText().toString(),autoCompleteTxtA2.getText().toString());

                    if (id > 0) {
                        Toast.makeText(AltasModeradoresActivity.this, "MODERADOR GUARDADO", Toast.LENGTH_LONG).show();
                        nombre.setText("");
                        correo.setText("");
                        institucion.setText("");
                        pssw1.setText("");
                        pssw2.setText("");
                        autoCompleteTxtA1.setText("");
                        autoCompleteTxtA2.setText("");

                    } else {
                        Toast.makeText(AltasModeradoresActivity.this, "ERROR AL GUARDAR mODERADOR", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(AltasModeradoresActivity.this, "DEBE LLENAR LOS CAMPOS OBLIGATORIOS", Toast.LENGTH_LONG).show();
                }















            /*Metodo para dar de altas Mod
                public void altasMod(View view){
                AdminSQLiteHelper admin =new AdminSQLiteHelper(this,"Moderadores", null, 1);
                SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

                String Nombre = nombre.getText().toString();
                String Correo=correo.getText().toString();
                String Area1=autoCompleteTxtA1.getText().toString();
                String Area2=autoCompleteTxtA2.getText().toString();
                String Institucion=institucion.getText().toString();
                String Passw=pssw1.getText().toString();
                String Pssw2=pssw2.getText().toString();

                if (!Nombre.isEmpty() && !Correo.isEmpty()&& !Area1.isEmpty()&& !Area2.isEmpty()&& !Institucion.isEmpty()&& !Passw.isEmpty()&& !Pssw2.isEmpty()){

                    ContentValues cv =new ContentValues();
                    cv.put("nombre", Nombre);
                    cv.put("correp", Correo);
                    cv.put("area1", Area1);
                    cv.put("area2", Area2);
                    cv.put("institucion", Institucion);
                    cv.put("password", Passw);

                    BaseDeDatos.insert("modeUsu",null, cv);
                    BaseDeDatos.close();
                    nombre.setText("");
                    correo.setText("");
                    autoCompleteTxtA1.setText("");
                    autoCompleteTxtA2.setText("");
                    institucion.setText("");
                    pssw1.setText("");
                    pssw2.setText("");

                    Toast.makeText(this,"Moderador registrado exitosamente", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"ERROR: Campos vacios", Toast.LENGTH_LONG).show();
                }





            //}
                //UsuarioModerClass u= new UsuarioModerClass();
                //u.setNombre(nombre.getText().toString());
                //u.setCorreo(correo.getText().toString());
                //u.setArea1(autoCompleteTxtA1.getText().toString());
                //u.setArea2(autoCompleteTxtA2.getText().toString());
                //u.setInstitucion(institucion.getText().toString());
                //u.setPassw(pssw1.getText().toString());
                //u.setPssw2(pssw2.getText().toString());
                //if (!u.isNull()){
                  //  Toast.makeText(this,"ERROR: Campos vacios", Toast.LENGTH_LONG).show();
                   // } else if (pssw1.equals(pssw2)){
                       // Toast.makeText(this,"ERROR: Contraceñas diferentes", Toast.LENGTH_LONG).show();
                     //    else if (dao.insertUsuarioM(u)){
                       //     Toast.makeText(this,"Moderador registrado exitosamente", Toast.LENGTH_LONG).show();
                        //    } else {
                          //  Toast.makeText(this,"Moderador ya registrado", Toast.LENGTH_LONG).show();
               // }*/

                break;

            case R.id.imageButtonCancelar:
                startActivity(new Intent(AltasModeradoresActivity.this, MnModeradoresActivity.class));
                finish();
                break;
        }
    }
}