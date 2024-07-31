package utez.edu.mx.sicci.model;

public class Usuario_has_Materia {

    private int usuario_id_usuario;
    private int materia_id_materia;

    public Usuario_has_Materia(int usuario_id_usuario, int materia_id_materia) {
        this.usuario_id_usuario = usuario_id_usuario;
        this.materia_id_materia = materia_id_materia;
    }

    public Usuario_has_Materia(){

    }

    public int getUsuario_id_usuario() {
        return usuario_id_usuario;
    }

    public void setUsuario_id_usuario(int usuario_id_usuario) {
        this.usuario_id_usuario = usuario_id_usuario;
    }

    public int getMateria_id_materia() {
        return materia_id_materia;
    }

    public void setMateria_id_materia(int materia_id_materia) {
        this.materia_id_materia = materia_id_materia;
    }
}
