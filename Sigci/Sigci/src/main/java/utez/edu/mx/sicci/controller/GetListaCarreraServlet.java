package utez.edu.mx.sicci.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.dao.CarreraDao;
import utez.edu.mx.sicci.model.Carrrera;
import utez.edu.mx.sicci.model.Grupo;

import java.io.IOException;
import java.util.List;

@WebServlet(name="GetListaCarreraServlet", value = "/getListaCarrera")

public class GetListaCarreraServlet extends HttpServlet {

    private CarreraDao carreraDao;

    @Override
    public void init() throws ServletException {
       carreraDao = new CarreraDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Carrrera> lista_carrera = carreraDao.getAllCarrera();
        req.setAttribute("lista_carrera", lista_carrera);
        RequestDispatcher rd = req.getRequestDispatcher("listaCarrera.jsp");
        rd.forward(req,resp);
    }

}
