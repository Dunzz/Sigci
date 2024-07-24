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

@WebServlet(name="RegistrarUsuarioServlet", value = "/registrarUsuario")
public class RegistrarUsuarioServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User u = new User();
        u.setNombre(req.getParameter("nombre"));
        u.setApellidos(req.getParameter("apellidos"));
        u.setEmail(req.getParameter("correo"));
        u.setCurp(req.getParameter("curp"));
        u.setFecha_nacimiento(req.getParameter("fecha_nacimiento"));
        u.setPassword(req.getParameter("password"));
        u.setNombre_usuario(req.getParameter("nombre_usuario"));
        u.setIdtipo_usuario(Integer.parseInt(req.getParameter("idtipo_usuario")));
        u.setId_division(Integer.parseInt(req.getParameter("id_division")));

        //Se debe mandar a llamar un DAO que permita insertar
        UserDao dao = new UserDao();
        if (dao.insert(u)){
            //respuesta hacia un jsp
            resp.sendRedirect("getListaDocentes");

        }else {
            //la info no se insertó y regresa al formulario
            HttpSession session = req.getSession();
            session.setAttribute("mensajeError","Puede que el usuario ya esté registrado");
            resp.sendRedirect("registrar.jsp");
        }
    }
}
