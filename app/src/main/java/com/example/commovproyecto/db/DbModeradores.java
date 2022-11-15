package com.example.commovproyecto.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;

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


}

