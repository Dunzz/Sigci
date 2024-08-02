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
import java.util.List;

@WebServlet (name = "UserServlet", value = "/signIn")
public class UserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("correo");
        String pass =request.getParameter("pass");
        UserDao dao = new UserDao();
        User u = dao.getOne(email, pass);
        HttpSession session = request.getSession(false);

        String ruta = "login.jsp";

        if(u.getEmail() != null) {
            session = request.getSession();
            session.setAttribute("user", u); // manda la sesion con el valor user al jsp
            request.setAttribute("user", u); // manda la sesion con el valor user al jsp
            // Que el usuario SI existe en la base de datos
           if (u.getIdtipo_usuario()==1){
               ruta="menuAdminppal.jsp";
           } else if(u.getIdtipo_usuario()==2){
               ruta="menuDocppal.jsp";
           } else {
               ruta = "Alerta.jsp" ;
           }
        } else {
            //Que el usuario No existe
            session = request.getSession();
            ruta = "Alerta.jsp" ;
        }

         response.sendRedirect(ruta);
    }

    public void destroy() {

    }

    public void init() throws ServletException {

    }

}
