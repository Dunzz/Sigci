<%@ page import="utez.edu.mx.sicci.dao.MateriaDao" %>
<%@ page import="utez.edu.mx.sicci.model.Materia" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: avile
  Date: 24/07/2024
  Time: 02:10 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Materias</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Descripcion</th>
        <th>Actualizar</th>
        <th>Eliminar</th>
    </tr>
    </thead>
    <tbody>
    <%
        // Obtenemos la lista de usuarios
        ArrayList<Materia> lista_materia = (ArrayList <Materia>) request.getAttribute("lista_materia");
        if (lista_materia != null){
            for(Materia m : lista_materia){ %>
    <tr>
        <td><%=m.getNombre_materia()%> </td>
        <td><a href="updateMateria?id_materia=<%=m.getId_materia()%>">Actualizar</a></td> <!-- Funcionalidad de actualizar -->
        <td><a href="borrarMateria?id_materia=<%=m.getId_materia()%>">Borrar</a></td> <!-- Funcionalidad de borrar -->
    </tr>
    <% }} %>
    </tbody>
</table>
</body>
</html>
