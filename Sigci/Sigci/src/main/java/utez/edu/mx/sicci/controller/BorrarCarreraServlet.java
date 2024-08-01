package utez.edu.mx.sicci.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.dao.CarreraDao;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "BorrarCarreraServlet", value = "/borrarCarrera")
public class BorrarCarreraServlet extends HttpServlet {

    private CarreraDao carreraDao;

    @Override
    public void init() throws ServletException {
        carreraDao = new CarreraDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try{
            int idcarrrera = Integer.parseInt(req.getParameter("idcarrrera"));
            carreraDao.delete(idcarrrera);
            resp.sendRedirect("getListaCarrera");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}