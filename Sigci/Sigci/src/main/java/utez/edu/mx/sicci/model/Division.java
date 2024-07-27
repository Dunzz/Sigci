package utez.edu.mx.sicci.model;

public class Division {

    int id_division;
    String nombre;

    public Division(int id_division, String nombre) {
        this.id_division = id_division;
        this.nombre = nombre;
    }

    public Division(){
    }

    public int getId_division() {
        return id_division;
    }

    public void setId_division(int id_division) {
        this.id_division = id_division;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
