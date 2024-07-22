package utez.edu.mx.sicci.dao;

import utez.edu.mx.sicci.model.Carrera;
import utez.edu.mx.sicci.model.Grupo;
import utez.edu.mx.sicci.utils.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarreraDao {
    private static final String SELECT_ALL_CARRERA = "SELECT * FROM carrrera";

    public List<Carrera> getAllCarrera() {
        List<Carrera> carrera = new ArrayList<>();
        try(
                Connection con = DatabaseConnectionManager.getConnection();
                PreparedStatement ps = con.prepareStatement(SELECT_ALL_CARRERA);
                ResultSet rs = ps.executeQuery()){
            while (rs.next()) { // Iteramos cada fila resultado de la query
                int idcarrrera = rs.getInt("idcarrrera");
                String descripcion = rs.getString("descripcion");
                carrera.add(new Carrera(idcarrrera, descripcion));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carrera;
    }
}
