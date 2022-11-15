package com.example.commovproyecto.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;

import com.example.commovproyecto.entidades.ModeradoresClass;

import java.util.ArrayList;

public class DbModeradores extends DbHelper {

    Context context;

    public DbModeradores(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long insertarModeradores(String nombre, String correo, String area1, String area2, String institucion, String password) {

        long id = 0;

        try {
            DbHelper dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("nombre", nombre);
            values.put("correo", correo);
            values.put("area1", nombre);
            values.put("area2", correo);
            values.put("institucion", nombre);
            values.put("password", correo);


            id = db.insert(TABLE_MODERADORES, null, values);
        } catch (Exception ex) {
            ex.toString();
        }

        return id;
    }


    public ArrayList<ModeradoresClass> mostrarModeradores() {

        DbHelper dbHelper = new DbHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ArrayList<ModeradoresClass> listaModerador = new ArrayList<>();
        ModeradoresClass moderador;
        Cursor cursorModerador;

        cursorModerador = db.rawQuery("SELECT nombre, correo,area1,area2,institucion FROM " + TABLE_MODERADORES + " ORDER BY nombre ASC", null);

        if (cursorModerador.moveToFirst()) {
            do {
                moderador = new ModeradoresClass();
                moderador.setNombre(cursorModerador.getString(0));
                moderador.setCorreo(cursorModerador.getString(1));
                moderador.setArea1(cursorModerador.getString(2));
                moderador.setArea2(cursorModerador.getString(3));
                moderador.setInstitucion(cursorModerador.getString(4));

                listaModerador.add(moderador);
            } while (cursorModerador.moveToNext());
        }

        cursorModerador.close();

        return listaModerador;
    }



}

