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

@WebServlet(name = "CargarUsuarioServlet", value = "/cargarUsuario")
public class CargarUsuarioServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        ArrayList<User> lista = new ArrayList<>();

        UserDao dao = new UserDao();
        lista = dao.getAll();

        session.setAttribute("usuarios",lista);
        resp.sendRedirect("editarUsuario.jsp");
    }
}
