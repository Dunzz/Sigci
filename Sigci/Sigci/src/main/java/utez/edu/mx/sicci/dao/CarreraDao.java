package utez.edu.mx.sicci.dao;

import utez.edu.mx.sicci.model.Carrrera;
import utez.edu.mx.sicci.model.Grupo;
import utez.edu.mx.sicci.model.Materia;
import utez.edu.mx.sicci.utils.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static utez.edu.mx.sicci.utils.DatabaseConnectionManager.getConnection;

public class CarreraDao {
    private static final String SELECT_ALL_CARRERA = "SELECT * FROM carrrera";

    private static final String SELECT_CARRERA_BY_ID = "select idcarrrera, descripcion from carrrera where idcarrrera = ?";


    public List<Carrrera> getAllCarrera() {
        List<Carrrera> carrrera = new ArrayList<>();
        try(
                Connection con = DatabaseConnectionManager.getConnection();
                PreparedStatement ps = con.prepareStatement(SELECT_ALL_CARRERA);
                ResultSet rs = ps.executeQuery()){
            while (rs.next()) { // Iteramos cada fila resultado de la query
                int idcarrrera = rs.getInt("idcarrrera");
                String descripcion = rs.getString("descripcion");
                carrrera.add(new Carrrera(idcarrrera, descripcion));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carrrera;
    }

    public boolean insert (Carrrera carrrera){
        boolean flag = false;
        String query = "INSERT INTO carrrera(descripcion, id_division) values(?,?)";

        try {
            Connection con = DatabaseConnectionManager.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, carrrera.getDescripcion());
            ps.setInt(2, carrrera.getId_division());

            if(ps.executeUpdate()==1){
                flag = true; //si se inserto el dato
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

    public Carrrera selectCarrera(int idcarrrera) {
        Carrrera carrrera = null;
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(SELECT_CARRERA_BY_ID)) {
            ps.setInt(1, idcarrrera);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String descripcion = rs.getString("descripcion");
                carrrera = new Carrrera(idcarrrera, descripcion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carrrera;
    }

    public boolean updateCarrera(Carrrera carrrera) throws SQLException {
        boolean flag;
        String query = "UPDATE carrrera SET descripcion = ? WHERE idcarrrera = ?";
        try (Connection con = DatabaseConnectionManager.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, carrrera.getDescripcion());
            ps.setInt(2, carrrera.getIdcarrrera());
            flag = ps.executeUpdate() > 0;
        }
        return flag;
    }

    public boolean delete(int idcarrrera) throws SQLException{
        boolean flag;
        String query = "DELETE FROM carrrera WHERE idcarrrera = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(query)){
            ps.setInt(1, idcarrrera);
            flag = ps.executeUpdate()>0;
        }
        return flag;
    }

}

