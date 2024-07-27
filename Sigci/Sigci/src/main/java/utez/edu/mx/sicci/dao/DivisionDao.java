package utez.edu.mx.sicci.dao;

import utez.edu.mx.sicci.model.Carrrera;
import utez.edu.mx.sicci.model.Division;
import utez.edu.mx.sicci.model.Grupo;
import utez.edu.mx.sicci.utils.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DivisionDao {
    private static final String SELECT_ALL_DIVISION = "SELECT * FROM division";

    public List<Division> getAllDivision() {
        List<Division> division = new ArrayList<>();
        try(
                Connection con = DatabaseConnectionManager.getConnection();
                PreparedStatement ps = con.prepareStatement(SELECT_ALL_DIVISION);
                ResultSet rs = ps.executeQuery()){
            while (rs.next()) { // Iteramos cada fila resultado de la query
                int id_division = rs.getInt("id_division");
                String nombre = rs.getString("nombre");
                division.add(new Division(id_division, nombre));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return division;
    }

    public boolean insert (Division division){
        boolean flag = false;
        String query = "INSERT INTO division(id_division, nombre) values(?,?)";

        try {
            Connection con = DatabaseConnectionManager.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,division.getId_division());
            ps.setString(2,division.getNombre());

            if(ps.executeUpdate()==1){
                flag = true; //si se inserto el dato
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return flag;
    }
}
