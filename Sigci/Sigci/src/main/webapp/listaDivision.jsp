<%@ page import="utez.edu.mx.sicci.model.Division" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: jerss
  Date: 27/07/2024
  Time: 12:25 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Divisiones</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Nombre</th>
        <th>Actualizar</th>
        <th>Eliminar</th>
    </tr>
    </thead>
    <tbody>
    <%
        // Obtenemos la lista de usuarios
            List<Division> lista_division = (List<Division>) request.getAttribute("lista_division");
        if (lista_division != null){
            for(Division d : lista_division){ %>
    <tr>
        <td><%=d.getNombre()%></td>
        <td><a href="updateGrupo?id_grupo=<%=d.getId_division()%>">Actualizar</a></td> <!-- Funcionalidad de actualizar -->
        <td><a href="borrarGrupo?id_grupo=<%=d.getId_division()%>">Borrar</a></td> <!-- Funcionalidad de borrar -->
    </tr>
    <% }} %>
    </tbody>
</table>
</body>
</html>
