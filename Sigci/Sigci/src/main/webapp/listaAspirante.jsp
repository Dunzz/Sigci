<%@ page import="utez.edu.mx.sicci.dao.UserDao" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="utez.edu.mx.sicci.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Gestionar Aspirantes</title>
</head>
<body>
<h5>Gestionar Aspirantes</h5>
<table>
    <thead>
    <tr>
        <th>Nombre Completo</th>
        <th>Correo</th>
        <th>Fecha de Creación</th>
        <th>ID de División</th>
        <th>Estado Usuario</th>
        <th>Actualizar</th>
        <th>Borrar</th>
    </tr>
    </thead>
    <tbody>
    <%
        // Obtenemos la lista de usuarios
        ArrayList<User> lista_admin_aspirantes = (ArrayList <User>) request.getAttribute("lista_admin_aspirantes");
        if (lista_admin_aspirantes != null){
            for(User u : lista_admin_aspirantes){ %>
    <tr>
        <td><%=u.getNombre()%> <%=u.getApellidos()%></td>
        <td><%=u.getEmail()%></td>
        <td><%=u.getFecha_creacion()%></td>
        <td><%=u.getId_division()%></td>
        <td><%=u.getEstado_usuario()%></td>
        <td><a href="updateAspirante?id_usuario=<%=u.getId_usuario()%>">Actualizar</a></td> <!-- Funcionalidad de actualizar -->
        <td><a href="borrarAspirante?id_usuario=<%=u.getId_usuario()%>">Borrar</a></td> <!-- Funcionalidad de borrar -->
    </tr>
    <% }} %>
    </tbody>
</table>
</body>
</html>
