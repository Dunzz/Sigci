package utez.edu.mx.sicci.dao;

import utez.edu.mx.sicci.model.Grupo;
import utez.edu.mx.sicci.utils.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GrupoDao {

    private static final String SELECT_ALL_GRUPO = "SELECT * FROM grupo";

    public List<Grupo> getAllGrupo() {
        List<Grupo> grupo = new ArrayList<>();
        try(
                Connection con = DatabaseConnectionManager.getConnection();
                PreparedStatement ps = con.prepareStatement(SELECT_ALL_GRUPO);
                ResultSet rs = ps.executeQuery()){
            while (rs.next()) { // Iteramos cada fila resultado de la query
                int id_grupo = rs.getInt("id_grupo");
                String descripcion = rs.getString("descripcion");
                grupo.add(new Grupo(id_grupo, descripcion));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return grupo;
    }

}