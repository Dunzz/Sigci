package utez.edu.mx.sicci.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.dao.CarreraDao;
import utez.edu.mx.sicci.model.Carrrera;
import utez.edu.mx.sicci.model.Grupo;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ActualizarCarreraServlet", value = "/actualizarCarrera")
public class ActualizarCarreraServlet extends HttpServlet {

    private CarreraDao carreraDao;

    @Override
    public void init() throws ServletException {
        carreraDao = new CarreraDao();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            int idcarrrera = Integer.parseInt(req.getParameter("idcarrrera"));
            String descripcion = req.getParameter("descripcion");
            Carrrera carrrera = new Carrrera(idcarrrera, descripcion);
            carreraDao.updateCarrera(carrrera);
            resp.sendRedirect("getListaCarrera");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
}
