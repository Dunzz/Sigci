package utez.edu.mx.sicci.model;

public class Carrrera {

        int idcarrrera;
        String descripcion;
        int id_division;

        int usuario_id_usuario;
        public Carrrera(int idcarrrera, String descripcion, int id_division, int usuario_id_usuario) {
            this.idcarrrera = idcarrrera;
            this.descripcion = descripcion;
            this.id_division = id_division;
            this.usuario_id_usuario = usuario_id_usuario;
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

    public int getUsuario_id_usuario() {
        return usuario_id_usuario;
    }

    public void setUsuario_id_usuario(int usuario_id_usuario) {
        this.usuario_id_usuario = usuario_id_usuario;
    }
}
