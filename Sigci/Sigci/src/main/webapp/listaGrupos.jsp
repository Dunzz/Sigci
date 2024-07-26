<%@ page import="utez.edu.mx.sicci.model.Grupo" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: jerss
  Date: 26/07/2024
  Time: 12:07 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Grupos</title>
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
        List<Grupo> lista_grupo = (List <Grupo>) request.getAttribute("lista_grupo");
        if (lista_grupo != null){
            for(Grupo g : lista_grupo){ %>
    <tr>
        <td><%=g.getDescripcion()%> </td>
        <td><a href="updateGrupo?id_grupo=<%=g.getId_grupo()%>">Actualizar</a></td> <!-- Funcionalidad de actualizar -->
        <td><a href="borrarGrupo?id_grupo=<%=g.getId_grupo()%>">Borrar</a></td> <!-- Funcionalidad de borrar -->
    </tr>
    <% }} %>
    </tbody>
</table>
</body>
</html>
