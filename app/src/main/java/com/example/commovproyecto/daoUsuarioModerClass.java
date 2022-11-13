package com.example.commovproyecto;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class daoUsuarioModerClass {

    Context c;
    UsuarioModerClass u;
    ArrayList<UsuarioModerClass> Lista;
    SQLiteDatabase sql;
    String bd = "BDModeradores";
    String tabla = "create table usuarioMod(id integer primary key autoincrement," +
                                                                "nombre text," +
                                                                "correo text," +
                                                                "area1 text," +
                                                                "area2 text," +
                                                                "institucion text," +
                                                                "password text," +
                                                                "nombreMR text," +
                                                                "correoMR text," +
                                                                "passwordMR text," +
                                                                "institucionMR text)";

    public daoUsuarioModerClass(Context c){
        this.c = c;
        sql = c.openOrCreateDatabase(bd, c.MODE_PRIVATE, null);
        sql.execSQL(tabla);
        u = new UsuarioModerClass();
    }

    public boolean insertUsuarioM(UsuarioModerClass u){
        if(buscar(u.getCorreo())==0){
            ContentValues cv =new ContentValues();
            cv.put("nombre",u.getNombre());
            cv.put("correp",u.getCorreo());
            cv.put("area1",u.getArea1());
            cv.put("area2",u.getArea2());
            cv.put("institucion",u.getInstitucion());
            cv.put("password",u.getPassw());
            cv.put("nombreMR",u.getNombreMR());
            cv.put("correoMR",u.getCorreoMR());
            cv.put("passwordMR",u.getPasswMR());
            cv.put("institucionMR",u.getInstitucionMR());
            return (sql.insert("usuarioMod",null,cv)>0);
        }else {
            return false;
        }
    }

    public ArrayList<UsuarioModerClass> usuariosModerClass(){
        ArrayList<UsuarioModerClass> lista=new ArrayList<UsuarioModerClass>();
        lista.clear();
    Cursor cr=sql.rawQuery("select * from usuarioMod", null);
    if (cr!=null&&cr.moveToFirst()){
        do{
            UsuarioModerClass u=new UsuarioModerClass();
            u.setId(cr.getInt(0));
            u.setNombre(cr.getString(1));
            u.setCorreo(cr.getString(2));
            u.setArea1(cr.getString(3));
            u.setArea2(cr.getString(3));
            u.setInstitucion(cr.getString(4));
            u.setPassw(cr.getString(5));
            u.setNombreMR(cr.getString(6));
            u.setCorreoMR(cr.getString(7));
            u.setPasswMR(cr.getString(8));
            u.setInstitucionMR(cr.getString(9));
            lista.add(u);
        }while (cr.moveToNext());
    }
    return lista;
    }

    public int buscar(String u){

        int x = 0;
        Lista=usuariosModerClass();
        for (UsuarioModerClass us:Lista){
            if (us.getCorreo().equals(u)){
                x++;
            }
        }
        return x;
    }

}
