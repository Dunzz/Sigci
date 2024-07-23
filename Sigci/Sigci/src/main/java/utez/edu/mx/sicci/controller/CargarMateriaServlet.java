package utez.edu.mx.sicci.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.dao.*;
import utez.edu.mx.sicci.model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CargarMateriaServlet", value = "/cargarMateria")
public class CargarMateriaServlet extends HttpServlet {

    private MateriaDao materiaDao;
    private GrupoDao grupoDao;
    private CarreraDao carreraDao;
    private DivisionDao divisionDao;
    private UserDao userDao;

    @Override
    public void init() throws ServletException {
        materiaDao = new MateriaDao();
        grupoDao = new GrupoDao();
        carreraDao = new CarreraDao();
        divisionDao = new DivisionDao();
        userDao = new UserDao();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Materia> materiaList = materiaDao.getAllMateria();
        req.setAttribute("materiaList", materiaList);
        List<Grupo> grupoList = grupoDao.getAllGrupo();
        req.setAttribute("grupoList", grupoList);
        List<Carrera> carreraList = carreraDao.getAllCarrera();
        req.setAttribute("carreraList",carreraList);
        List<Division> divisionList = divisionDao.getAllDivision();
        req.setAttribute("divisionList",divisionList);
        ArrayList<User> userArrayList = userDao.getAll();
        req.setAttribute("userArrayList", userArrayList);
        RequestDispatcher rd = req.getRequestDispatcher("actualizarDoc.jsp");
        rd.forward(req,resp);

    }
}
