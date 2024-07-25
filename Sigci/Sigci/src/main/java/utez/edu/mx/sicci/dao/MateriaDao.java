package utez.edu.mx.sicci.dao;

import utez.edu.mx.sicci.model.Materia;
import utez.edu.mx.sicci.model.User;
import utez.edu.mx.sicci.utils.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static utez.edu.mx.sicci.utils.DatabaseConnectionManager.getConnection;

public class MateriaDao {

    private static final String SELECT_ALL_MATERIA = "SELECT * FROM materia";

    public List<Materia> getAllMateria() {
        List<Materia> materia = new ArrayList<>();
        try (
                Connection con = DatabaseConnectionManager.getConnection();
                PreparedStatement ps = con.prepareStatement(SELECT_ALL_MATERIA);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) { // Iteramos cada fila resultado de la query
                int id_materia = rs.getInt("id_materia");
                String nombre_materia = rs.getString("nombre_materia");
                materia.add(new Materia(id_materia, nombre_materia));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return materia;
    }

    public boolean insert(Materia materia) {
        boolean flag = false;
        String query = "INSERT INTO materia(id_materia, nombre_materia) values(?,?)";

        try {

            Connection con = DatabaseConnectionManager.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, materia.getId_materia());
            ps.setString(2, materia.getNombre_materia());

            if(ps.executeUpdate()==1){
                flag = true; //si se inserto el dato
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public ArrayList<Materia> getAll() {
        ArrayList<Materia> materia = new ArrayList<>();
        try(
                Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement(SELECT_ALL_MATERIA);
                ResultSet rs = ps.executeQuery()){
            while (rs.next()) { // Iteramos cada fila resultado de la query
                Materia m = new Materia();
                m.setId_materia(rs.getInt("id_materia"));
                m.setNombre_materia(rs.getString("nombre_materia"));
                materia.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return materia;
    }

    public boolean delete(int id_materia) throws SQLException{
        boolean flag;
        String query = "DELETE FROM materia WHERE id_materia = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(query)){
            ps.setInt(1, id_materia);
            flag = ps.executeUpdate()>0;
        }
        return flag;
    }

}