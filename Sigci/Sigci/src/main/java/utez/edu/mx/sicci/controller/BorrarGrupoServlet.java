package utez.edu.mx.sicci.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.dao.GrupoDao;
import utez.edu.mx.sicci.dao.MateriaDao;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "BorrarGrupoServlet", value = "/borrarGrupo")

public class BorrarGrupoServlet extends HttpServlet {

    private GrupoDao grupoDao;

    @Override
    public void init() throws ServletException {
        grupoDao = new GrupoDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try{
            int id_grupo = Integer.parseInt(req.getParameter("id_grupo"));
            grupoDao.delete(id_grupo);
            resp.sendRedirect("getListaGrupos");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
