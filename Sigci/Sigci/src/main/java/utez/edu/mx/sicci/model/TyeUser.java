package utez.edu.mx.sicci.model;

public class TyeUser {

    int idType;
    String nombre;

    public TyeUser(){

    }

    public TyeUser(int idType, String nombre) {
        this.idType = idType;
        this.nombre = nombre;
    }

    public int getIdType() {
        return idType;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
