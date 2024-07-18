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

@WebServlet (name = "UserServlet", value = "/signIn")
public class UserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String correo = request.getParameter("correo");
        String pass = request.getParameter("pass");
        UserDao dao = new UserDao();
        User u = dao.getOne(correo, pass);

        String ruta = "login.jsp";

        if(u.getCorreo() != null) {
            // Que el usuario SI existe en la base de datos
            ruta = "menuAdminppal.jsp";//puse el menu admin aqui pero debe de midentificar si es docente o admind
        } else {
            //Que el usuario No existe
            HttpSession sesion = request.getSession();
            sesion.setAttribute("mensaje", "El usuario no existe en la BD");
        }

         response.sendRedirect(ruta);
    }

    public void destroy() {

    }

    public void init() throws ServletException {

    }

}
