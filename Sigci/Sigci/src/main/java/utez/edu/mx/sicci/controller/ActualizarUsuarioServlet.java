package utez.edu.mx.sicci.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import utez.edu.mx.sicci.dao.UserDao;
import utez.edu.mx.sicci.model.User;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ActualizarUsuarioServlet", value = "/actualizarUsuario")
public class ActualizarUsuarioServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        //Para buscar la info del usuario
        UserDao dao = new UserDao();
        User u = dao.findById(id);
        HttpSession sesion = req.getSession();
        sesion.setAttribute("usuario", u);
        //despues mandarla a un formulario para su edición
        resp.sendRedirect("editarUsuario.jsp");

        }
}
