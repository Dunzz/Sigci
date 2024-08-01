package utez.edu.mx.sicci.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.dao.CarreraDao;
import utez.edu.mx.sicci.model.Carrrera;
import utez.edu.mx.sicci.model.User;

import java.io.IOException;

@WebServlet(name = "CarreraUpdateServlet", value = "/updateCarrera")
public class CarreraUpdateServlet extends HttpServlet {

    private CarreraDao carreraDao;

    @Override
    public void init() throws ServletException {
        carreraDao = new CarreraDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idcarrrera = Integer.parseInt(request.getParameter("idcarrrera"));
        Carrrera existingCarrrera = carreraDao.selectCarrera(idcarrrera);
        RequestDispatcher dispatcher = request.getRequestDispatcher("actualizarCarrera.jsp");
        request.setAttribute("carrrera", existingCarrrera);
        dispatcher.forward(request, response);
    }
}
