package utez.edu.mx.sicci.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.dao.MateriaDao;
import utez.edu.mx.sicci.model.Materia;

import java.io.IOException;
import java.util.List;


@WebServlet(name="GetMateriasDocentesServlet", value = "/getListaMaterias")

public class GetListaMateriasServlet extends HttpServlet {

    private MateriaDao materiaDao;

    @Override
    public void init() throws ServletException {
        materiaDao = new MateriaDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Materia> lista_materias = materiaDao.getAll();
        req.setAttribute("lista_materia", lista_materias);
        RequestDispatcher rd = req.getRequestDispatcher("listaMaterias.jsp");
        rd.forward(req,resp);
    }
}
