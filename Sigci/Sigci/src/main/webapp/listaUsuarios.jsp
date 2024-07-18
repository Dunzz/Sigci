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
        <th>ID</th>
        <th>Nombre</th>
        <th>Apellido</th>
        <th>Correo</th>
        <th>CURP</th>
        <th>Fecha de Nacimiento</th>
        <th>Contraseña</th>
        <th>Estado de Contraseña</th>
        <th>Estado de Usuario</th>
        <th>Nombre de Usuario</th>
        <th>Fecha de Creación</th>
        <th>Tipo de Usuario</th>
        <th>ID de División</th>
        <th>ID de Grupo</th>
        <th>Actualizar</th>
        <th>Eliminar</th>
    </tr>
    </thead>
    <tbody>
    <%
        UserDao dao = new UserDao();
        ArrayList<User> lista = dao.getAll(); // Obtenemos la lista de usuarios
        for(User u : lista){ %>
    <tr>
        <td><%=u.getId()%></td>
        <td><%=u.getNombre()%></td>
        <td><%=u.getApellido()%></td>
        <td><%=u.getCorreo()%></td>
        <td><%=u.getCurp()%></td>
        <td><%=u.getFechaNacimiento()%></td>
        <td><%=u.getPass()%></td>
        <td><%=u.getEstadoPass()%></td>
        <td><%=u.getEstadoUsuario()%></td>
        <td><%=u.getNombreUsuario()%></td>
        <td><%=u.getFechaCreacion()%></td>
        <td><%=u.getTipoUsuario()%></td>
        <td><%=u.getIdDIvision()%></td>
        <td><%=u.getIdGrupo()%></td>
        <td><a href="editarUsuario.jsp">Actualizar</a></td> <!-- Funcionalidad de actualizar -->
        <td><a href="borrarUsuario?id=<%=u.getId()%>">Borrar</a></td> <!-- Funcionalidad de borrar -->
    </tr>
    <% } %>
    </tbody>
</table>
</body>
</html>
