<%@ page import="utez.edu.mx.sicci.dao.UserDao" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="utez.edu.mx.sicci.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usuarios</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Nombre Completo</th>
        <th>Correo</th>
        <th>Fecha de Creación</th>
        <th>ID de División</th>
        <th>Estado Usuario</th>
        <th>Actualizar</th>
        <th>Eliminar</th>
    </tr>
    </thead>
    <tbody>
    <%
         // Obtenemos la lista de usuarios
        ArrayList<User> lista_user = (ArrayList <User>) request.getAttribute("lista_user");
        if (lista_user != null){
        for(User u : lista_user){ %>
    <tr>
        <td><%=u.getNombre()%> <%=u.getApellido()%></td>
        <td><%=u.getCorreo()%></td>
        <td><%=u.getFechaCreacion()%></td>
        <td><%=u.getIdDIvision()%></td>
        <td><%=u.getEstadoUsuario()%></td>
        <td><a href="editarUsuario.jsp">Actualizar</a></td> <!-- Funcionalidad de actualizar -->
        <td><a href="borrarUsuario?id=<%=u.getId()%>">Borrar</a></td> <!-- Funcionalidad de borrar -->
    </tr>
    <% }} %>
    </tbody>
</table>
</body>
</html>
