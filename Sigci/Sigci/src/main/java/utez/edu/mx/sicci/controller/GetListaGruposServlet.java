package utez.edu.mx.sicci.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.dao.GrupoDao;
import utez.edu.mx.sicci.model.Grupo;
import utez.edu.mx.sicci.model.Materia;

import java.io.IOException;
import java.util.List;

@WebServlet(name="GetListaGruposServlet", value = "/getListaGrupos")

public class GetListaGruposServlet extends HttpServlet {

    private GrupoDao grupoDao;

    @Override
    public void init() throws ServletException {
        grupoDao = new GrupoDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Grupo> lista_grupo = grupoDao.getAllGrupo();
        req.setAttribute("lista_grupo", lista_grupo);
        RequestDispatcher rd = req.getRequestDispatcher("listaGrupos.jsp");
        rd.forward(req,resp);
    }
}
