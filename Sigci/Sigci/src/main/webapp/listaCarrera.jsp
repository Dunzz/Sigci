<%@ page import="utez.edu.mx.sicci.model.Carrrera" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Angel
  Date: 27/07/2024
  Time: 12:27 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
        List<Carrrera> lista_carrera= (List <Carrrera>) request.getAttribute("lista_carrera");
        if (lista_carrera != null){
            for(Carrrera c : lista_carrera){ %>
    <tr>
        <td><%=c.getDescripcion()%> </td>
        <td><a href="updateGrupo?id_grupo=<%=c.getIdcarrrera()%>">Actualizar</a></td> <!-- Funcionalidad de actualizar -->
        <td><a href="borrarGrupo?id_grupo=<%=c.getIdcarrrera()%>">Borrar</a></td> <!-- Funcionalidad de borrar -->
    </tr>
    <% }} %>
    </tbody>
</table>

</body>
</html>
