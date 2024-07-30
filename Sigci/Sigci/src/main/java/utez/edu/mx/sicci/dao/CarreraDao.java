package utez.edu.mx.sicci.dao;

import utez.edu.mx.sicci.model.Carrrera;
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
        String query = "INSERT INTO carrrera(idcarrrera, descripcion, id_division) values(?,?,?)";

        try {
            Connection con = DatabaseConnectionManager.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,carrrera.getIdcarrrera());
            ps.setString(2, carrrera.getDescripcion());
            ps.setInt(3, carrrera.getId_division());

            if(ps.executeUpdate()==1){
                flag = true; //si se inserto el dato
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

}

