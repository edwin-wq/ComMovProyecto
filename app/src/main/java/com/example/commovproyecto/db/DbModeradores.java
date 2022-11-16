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

    public long insertarModeradores(String nombre, String correo, String institucion, String password, String area1, String area2) {

        long id = 0;

        try {
            DbHelper dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("nombre", nombre);
            values.put("correo", correo);
            values.put("institucion", institucion);
            values.put("password", password);
            values.put("area1", area1);
            values.put("area2", area2);



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

        cursorModerador = db.rawQuery("SELECT id, nombre, correo, institucion, area1,area2 FROM " + TABLE_MODERADORES + " ORDER BY nombre ASC", null);

        if (cursorModerador.moveToFirst()) {
            do {
                moderador = new ModeradoresClass();
                moderador.setId(cursorModerador.getInt(0));
                moderador.setNombre(cursorModerador.getString(1));
                moderador.setCorreo(cursorModerador.getString(2));
                moderador.setInstitucion(cursorModerador.getString(3));
                moderador.setArea1(cursorModerador.getString(4));
                moderador.setArea2(cursorModerador.getString(5));


                listaModerador.add(moderador);
            } while (cursorModerador.moveToNext());
        }
        cursorModerador.close();
        return listaModerador;
    }

    public ModeradoresClass verModeradores(int id) {

        DbHelper dbHelper = new DbHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ModeradoresClass moderadores = null;
        Cursor cursorModeradores;

        cursorModeradores = db.rawQuery("SELECT id, nombre, correo, institucion, area1,area2 FROM " + TABLE_MODERADORES + " WHERE id = " + id + " LIMIT 1", null);

        if (cursorModeradores.moveToFirst()) {
            moderadores = new ModeradoresClass();
            moderadores.setId(cursorModeradores.getInt(0));
            moderadores.setNombre(cursorModeradores.getString(1));
            moderadores.setCorreo(cursorModeradores.getString(2));
            moderadores.setInstitucion(cursorModeradores.getString(3));
            moderadores.setArea1(cursorModeradores.getString(4));
            moderadores.setArea2(cursorModeradores.getString(5));

        }

        cursorModeradores.close();

        return moderadores;
    }

    public boolean eliminarModerador(int id) {

        boolean correcto = false;

        DbHelper dbHelper = new DbHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        try {
            db.execSQL("DELETE FROM " + TABLE_MODERADORES + " WHERE id = '" + id + "'LIMIT 1");
            correcto = true;
        } catch (Exception ex) {
            ex.toString();
            correcto = false;
        } finally {
            db.close();
        }

        return correcto;
    }

}

