package utez.edu.mx.sicci.dao;

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

public class GrupoDao {


    private static final String SELECT_ALL_GRUPO = "SELECT * FROM grupo";
    private static final String SELECT_GRUPO_BY_ID = "select id_grupo, descripcion from grupo where id_grupo = ?";


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

    public boolean insert (Grupo grupo){
            boolean flag = false;
            String query = "INSERT INTO grupo(id_grupo, descripcion) values(?,?)";

            try {
                Connection con = DatabaseConnectionManager.getConnection();
                PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1,grupo.getId_grupo());
                ps.setString(2,grupo.getDescripcion());

                if(ps.executeUpdate()==1){
                    flag = true; //si se inserto el dato
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        return flag;
    }

    public boolean delete(int id_grupo) throws SQLException{
        boolean flag;
        String query = "DELETE FROM grupo WHERE id_grupo = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(query)){
            ps.setInt(1, id_grupo);
            flag = ps.executeUpdate()>0;
        }
        return flag;
    }

    public boolean updateGrupo(Grupo grupo) throws SQLException {
        boolean flag;
        String query = "UPDATE grupo SET descripcion = ? WHERE id_grupo = ?";
        try (Connection con = DatabaseConnectionManager.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, grupo.getDescripcion());
            ps.setInt(2, grupo.getId_grupo());
            flag = ps.executeUpdate() > 0;
        }
        return flag;
    }

    public Grupo selectGrupo(int id_grupo) {
        Grupo grupo = null;
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(SELECT_GRUPO_BY_ID)) {
            ps.setInt(1, id_grupo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String descripcion = rs.getString("descripcion");
                grupo = new Grupo(id_grupo, descripcion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return grupo;
    }

}
