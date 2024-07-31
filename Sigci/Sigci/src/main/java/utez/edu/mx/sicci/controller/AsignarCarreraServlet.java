package utez.edu.mx.sicci.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.dao.DivisionDao;
import utez.edu.mx.sicci.model.Division;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "AsignarCarreraServlet", value = "/asignarCarrera")
public class AsignarCarreraServlet extends HttpServlet {
    private DivisionDao divisionDao;

    @Override
    public void init() throws ServletException {
        divisionDao = new DivisionDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Division> lista_division = divisionDao.getAllDivision();
        req.setAttribute("lista_division", lista_division);
        RequestDispatcher rd = req.getRequestDispatcher("registrarCarrera.jsp");
        rd.forward(req,resp);
    }
}
