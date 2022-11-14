package com.example.commovproyecto;

public class UsuarioModerClass {

    int id;
    String nombre, correo, area1, area2, institucion, passw, pssw2, nombreMR, correoMR, passwMR, institucionMR;


    public boolean isNull(){
        if(nombre.equals("")&&correo.equals("")&&area1.equals("")&&area2.equals("")&&institucion.equals("")&&passw.equals("")){
            return false;
        }else{
            return true;
        }
    }

    public UsuarioModerClass() {
    }

    public UsuarioModerClass(String nombre, String correo, String area1, String area2, String institucion, String passw) {
        this.nombre = nombre;
        this.correo = correo;
        this.area1 = area1;
        this.area2 = area2;
        this.institucion = institucion;
        this.passw = passw;
    }

    public UsuarioModerClass(String nombreMR, String correoMR, String passwMR, String institucionMR) {
        this.nombreMR = nombreMR;
        this.correoMR = correoMR;
        this.passwMR = passwMR;
        this.institucionMR = institucionMR;
    }

    public UsuarioModerClass(String nombre, String correo, String area1, String area2, String institucion, String passw, String nombreMR, String correoMR, String passwMR, String institucionMR) {
        this.nombre = nombre;
        this.correo = correo;
        this.area1 = area1;
        this.area2 = area2;
        this.institucion = institucion;
        this.passw = passw;
        this.nombreMR = nombreMR;
        this.correoMR = correoMR;
        this.passwMR = passwMR;
        this.institucionMR = institucionMR;
    }

    public UsuarioModerClass(int id, String nombre, String correo, String area1, String area2, String institucion, String passw, String nombreMR, String correoMR, String passwMR, String institucionMR) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.area1 = area1;
        this.area2 = area2;
        this.institucion = institucion;
        this.passw = passw;
        this.nombreMR = nombreMR;
        this.correoMR = correoMR;
        this.passwMR = passwMR;
        this.institucionMR = institucionMR;
    }

    public UsuarioModerClass(String nombre, String correo, String area1, String area2, String institucion, String passw, String pssw2, String nombreMR, String correoMR, String passwMR, String institucionMR) {
        this.nombre = nombre;
        this.correo = correo;
        this.area1 = area1;
        this.area2 = area2;
        this.institucion = institucion;
        this.passw = passw;
        this.pssw2 = pssw2;
        this.nombreMR = nombreMR;
        this.correoMR = correoMR;
        this.passwMR = passwMR;
        this.institucionMR = institucionMR;
    }

    public UsuarioModerClass(String nombre, String correo, String area1, String area2, String institucion, String passw, String pssw2) {
        this.nombre = nombre;
        this.correo = correo;
        this.area1 = area1;
        this.area2 = area2;
        this.institucion = institucion;
        this.passw = passw;
        this.pssw2 = pssw2;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getArea1() {
        return area1;
    }

    public void setArea1(String area1) {
        this.area1 = area1;
    }

    public String getArea2() {
        return area2;
    }

    public void setArea2(String area2) {
        this.area2 = area2;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) { this.passw = passw; }

    public String getPssw2() { return pssw2; }

    public void setPssw2(String pssw2) { this.pssw2 = pssw2; }

    public String getNombreMR() {
        return nombreMR;
    }

    public void setNombreMR(String nombreMR) {
        this.nombreMR = nombreMR;
    }

    public String getCorreoMR() {
        return correoMR;
    }

    public void setCorreoMR(String correoMR) {
        this.correoMR = correoMR;
    }

    public String getPasswMR() {
        return passwMR;
    }

    public void setPasswMR(String passwMR) {
        this.passwMR = passwMR;
    }

    public String getInstitucionMR() {
        return institucionMR;
    }

    public void setInstitucionMR(String institucionMR) {
        this.institucionMR = institucionMR;
    }
}
