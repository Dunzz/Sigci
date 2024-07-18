package utez.edu.mx.sicci.model;

public class Division {

    int idDivision;
    String nombreDivision;

    public Division() {

    }
    public Division(int idDivision, String nombreDivision) {
        this.idDivision = idDivision;
        this.nombreDivision = nombreDivision;
    }

    public int getIdDivision() {
        return idDivision;
    }

    public String getNombreDivision() {
        return nombreDivision;
    }

    public void setIdDivision(int idDivision) {
        this.idDivision = idDivision;
    }

    public void setNombreDivision(String nombreDivision) {
        this.nombreDivision = nombreDivision;
    }
}
