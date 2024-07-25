package utez.edu.mx.sicci.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.dao.MateriaDao;

import java.io.IOException;
import java.sql.SQLException;


@WebServlet(name = "BorrarMateriaServlet", value = "/borrarMateria")

public class BorrarMateriaServlet extends HttpServlet {

    private MateriaDao materiaDao;

    @Override
    public void init() throws ServletException {
        materiaDao = new MateriaDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try{
            int id_materia = Integer.parseInt(req.getParameter("id_materia"));
            materiaDao.delete(id_materia);
            resp.sendRedirect("listaMaterias.jsp");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
