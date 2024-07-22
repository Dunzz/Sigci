package utez.edu.mx.sicci.model;

public class Grupo {
    private int id_grupo;
    private String descripcion;

    public Grupo(int id_grupo, String descripcion) {
        this.id_grupo = id_grupo;
        this.descripcion = descripcion;
    }

    public Grupo() {
    }

    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
