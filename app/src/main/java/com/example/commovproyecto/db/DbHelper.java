package com.example.commovproyecto.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NOMBRE = "moderadores.db";
    public static final String TABLE_MODERADORES = "t_moderUsu";
    public static final String TABLE_SALAS = "t_salas";


    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_MODERADORES + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre TEXT NOT NULL," +
                "correo TEXT NOT NULL," +
                "institucion TEXT NOT NULL," +
                "password TEXT," +
                "area1 TEXT NOT NULL," +
                "area2 TEXT NOT NULL)");


        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_SALAS + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombreS TEXT NOT NULL," +
                "Aarea TEXT NOT NULL," +
                "moderador TEXT NOT NULL)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE " + TABLE_MODERADORES);
        onCreate(sqLiteDatabase);

        sqLiteDatabase.execSQL("DROP TABLE " + TABLE_SALAS);
        onCreate(sqLiteDatabase);

    }
}
