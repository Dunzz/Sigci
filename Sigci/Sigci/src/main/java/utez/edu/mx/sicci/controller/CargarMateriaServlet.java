package utez.edu.mx.sicci.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utez.edu.mx.sicci.dao.CarreraDao;
import utez.edu.mx.sicci.dao.DivisionDao;
import utez.edu.mx.sicci.dao.GrupoDao;
import utez.edu.mx.sicci.dao.MateriaDao;
import utez.edu.mx.sicci.model.Carrera;
import utez.edu.mx.sicci.model.Division;
import utez.edu.mx.sicci.model.Grupo;
import utez.edu.mx.sicci.model.Materia;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "CargarMateriaServlet", value = "/cargarMateria")
public class CargarMateriaServlet extends HttpServlet {

    private MateriaDao materiaDao;
    private GrupoDao grupoDao;
    private CarreraDao carreraDao;
    private DivisionDao divisionDao;

    @Override
    public void init() throws ServletException {
        materiaDao = new MateriaDao();
        grupoDao = new GrupoDao();
        carreraDao = new CarreraDao();
        divisionDao = new DivisionDao();
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
        RequestDispatcher rd = req.getRequestDispatcher("actualizarDoc.jsp");
        rd.forward(req,resp);

    }
}
