package utez.edu.mx.sicci.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.dao.GrupoDao;
import utez.edu.mx.sicci.model.Grupo;
import utez.edu.mx.sicci.model.Materia;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ActualizarGrupoServlet", value = "/actualizarGrupo")

public class ActualizarGrupoServlet extends HttpServlet {

    private GrupoDao grupoDao;

    @Override
    public void init() throws ServletException {
        grupoDao = new GrupoDao();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            int id_grupo = Integer.parseInt(req.getParameter("id_grupo"));
            String descripcion = req.getParameter("descripcion");
            Grupo grupo = new Grupo(id_grupo, descripcion);
            grupoDao.updateGrupo(grupo);
            resp.sendRedirect("getListaGrupos");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException(e);
        }

    }
}
