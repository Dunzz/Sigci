package utez.edu.mx.sicci.model;

public class Carrera {

    int id_carrrera;
    String descripcion;

    public Carrera(int id_carrrera, String descripcion) {
        this.id_carrrera = id_carrrera;
        this.descripcion = descripcion;
    }

public Carrera(){

}

    public int getId_carrrera() {
        return id_carrrera;
    }

    public void setId_carrrera(int id_carrrera) {
        this.id_carrrera = id_carrrera;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
