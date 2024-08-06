package utez.edu.mx.sicci.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.dao.UserDao;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "UpdatePasswordRecoveryCodeServlet", value = "/update-password-recovery")
public class UpdatePasswordRecoveryCodeServlet extends HttpServlet {
    private UserDao userDao;

    @Override
    public void init() throws ServletException {
        userDao = new UserDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String correo = request.getParameter("correo");
        String newPass = request.getParameter("newPass");
        String code = request.getParameter("code");

        try {
            boolean actualizada = userDao.updatePassword(code, correo, newPass);
            if (actualizada) {
                response.sendRedirect("index.jsp");
            } else {
                // mandar un error de que no se actualizó la contraseña
                response.sendRedirect("error.jsp");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

