package utez.edu.mx.sicci.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.dao.MateriaDao;
import utez.edu.mx.sicci.model.Materia;
import utez.edu.mx.sicci.model.User;

import java.io.IOException;


@WebServlet(name = "MateriaDataToUpdateServlet", value = "/updateMateria")

public class MateriaDataToUpdateServlet extends HttpServlet {

    MateriaDao materiaDao;

    @Override
    public void init() throws ServletException {
        materiaDao = new MateriaDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id_materia = Integer.parseInt(req.getParameter("id_materia"));
        Materia existingMateria = materiaDao.selectMateria(id_materia);
        RequestDispatcher dispatcher = req.getRequestDispatcher("actualizarMateria.jsp");
        req.setAttribute("materia", existingMateria);
        dispatcher.forward(req, resp);
    }
}
