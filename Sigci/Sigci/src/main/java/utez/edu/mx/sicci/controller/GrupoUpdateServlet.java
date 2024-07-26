package utez.edu.mx.sicci.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.dao.GrupoDao;
import utez.edu.mx.sicci.model.Grupo;
import utez.edu.mx.sicci.model.User;

import java.io.IOException;

@WebServlet(name = "GrupoUpdateServlet", value = "/updateGrupo")

public class GrupoUpdateServlet extends HttpServlet {

    private GrupoDao grupoDao;

    @Override
    public void init() throws ServletException {
        grupoDao = new GrupoDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id_grupo = Integer.parseInt(request.getParameter("id_grupo"));
        Grupo existingGrupo = grupoDao.selectGrupo(id_grupo);
        RequestDispatcher dispatcher = request.getRequestDispatcher("actualizarGrupo.jsp");
        request.setAttribute("grupo", existingGrupo);
        dispatcher.forward(request, response);
    }
}
