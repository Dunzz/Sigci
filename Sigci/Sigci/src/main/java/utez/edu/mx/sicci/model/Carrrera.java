package utez.edu.mx.sicci.model;

public class Carrrera {

        int idcarrrera;
        String descripcion;
        int id_division;
        public Carrrera(int idcarrrera, String descripcion, int id_division, int usuario_id_usuario) {
            this.idcarrrera = idcarrrera;
            this.descripcion = descripcion;
            this.id_division = id_division;
        }

        public Carrrera(int idcarrrera, String descripcion) {
        this.idcarrrera = idcarrrera;
        this.descripcion = descripcion;
        }

    public Carrrera() {

    }

    public int getIdcarrrera() {
        return idcarrrera;
    }

    public void setIdcarrrera(int idcarrrera) {
        this.idcarrrera = idcarrrera;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_division() {
        return id_division;
    }

    public void setId_division(int id_division) {
        this.id_division = id_division;
    }

}
