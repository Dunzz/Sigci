package utez.edu.mx.sicci.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import utez.edu.mx.sicci.dao.GrupoDao;
import utez.edu.mx.sicci.model.Grupo;

import java.io.IOException;

@WebServlet(name="RegistrarGrupoServlet", value = "/registrarGrupo")

public class RegistrarGrupoServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Grupo grupo = new Grupo();
        grupo.setDescripcion(req.getParameter("descripcion"));

        // Se llama al DAO para insertar

        GrupoDao dao = new GrupoDao();
        if (dao.insert(grupo)){
            resp.sendRedirect("gestionarDoc.jsp");
        }else {
            // La info no a sido insertada y regresa al formulario
            HttpSession session = req.getSession();
            session.setAttribute("mensajaeError", "Puede que el grupo ya haya sido registrado");
            resp.sendRedirect("registrarGrupo");
        }
    }
}
