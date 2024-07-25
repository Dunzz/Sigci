package utez.edu.mx.sicci.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.dao.MateriaDao;
import utez.edu.mx.sicci.model.Materia;


import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ActualizarMateriaServlet", value = "/actualizarMateria")

public class ActualizarMateriaServlet extends HttpServlet {

    private MateriaDao materiaDao;

    @Override
    public void init(){
        materiaDao = new MateriaDao();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            int id_materia = Integer.parseInt(req.getParameter("id_materia"));
            String nombre_materia = req.getParameter("nombre_materia");
            Materia materia = new Materia(id_materia, nombre_materia);
            materiaDao.updateMateria(materia);
            resp.sendRedirect("getListaMaterias");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException(e);
        }

    }
}
