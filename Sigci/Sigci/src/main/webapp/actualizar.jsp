<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<center><h2>Actualizar Docentes</h2></center>
<br>
<form action="actualizarUsuario" method="post" >
    <input type="hidden" name="id" value="${user.id_usuario}">
    <label>Ingrese su nombre: </label>
    <input type="text" id="nombre" name="nombre" value="${user.nombre}" required>
    <br>
    <label>Ingrese su apellido: </label>
    <input type="text" id="apellidos" name="apellidos" value="${user.apellidos}" required>
    <br>
    <label>Ingrese su correo: </label>
    <input type="email" id="email" name="email" value="${user.email}" required>
    <br>
    <label>Ingrese su curp: </label>
    <input type="text" id="curp" name="curp" value="${user.curp}" required>
    <br>
    <label>Ingrese su nombre de usuario: </label>
    <input type="text" id="nombre_usuario" name="nombre_usuario" value="${user.nombre_usuario}" required>
    <br>
    <label>Ingrese su estado: </label>
    <input type="text" id="estado_usuario" name="estado_usuario" value="${user.estado_usuario}" required>
    <br>
    <input type="hidden" value="${user.id_usuario}" name="id_usuario" />
    <input type="submit" value="Aceptar">
</form>
<a href="getListaDocentes">Volver a la lista</a>

</body>
</html>
