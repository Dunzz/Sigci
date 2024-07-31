package utez.edu.mx.sicci.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.HelloServlet;
import utez.edu.mx.sicci.dao.MateriaDao;
import utez.edu.mx.sicci.dao.UserDao;
import utez.edu.mx.sicci.model.Materia;
import utez.edu.mx.sicci.model.User;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "GetListasDocenteMateriaServlet", value = "/listasDocenteMateria")
public class GetListasDocenteMateriaServlet extends HttpServlet {

    private UserDao userDao;
    private MateriaDao materiaDao;

    @Override
    public void init() throws ServletException {
        userDao = new UserDao();
        materiaDao = new MateriaDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> lista_user = userDao.getAll();
        req.setAttribute("lista_user", lista_user);
        List<Materia> lista_materia = materiaDao.getAllMateria();
        req.setAttribute("lista_materia", lista_materia);
        RequestDispatcher rd = req.getRequestDispatcher("asignarMatDoc.jsp");
        rd.forward(req,resp);

    }
}
