<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Editar Usuario</title>
</head>
<body>
<h2>Editar Usuario</h2>
<form action="actualizarUsuario" method="post">
    <input type="hidden" name="id" value="${user.id}" />

    <div>
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" value="${user.nombre}" required />
    </div>
    <div>
        <label for="apellidos">Apellidos:</label>
        <input type="text" id="apellidos" name="apellidos" value="${user.apellido}" required />
    </div>
    <div>
        <label for="correo">Correo:</label>
        <input type="email" id="correo" name="correo" value="${user.correo}" required />
    </div>
    <div>
        <label for="curp">CURP:</label>
        <input type="text" id="curp" name="curp" value="${user.curp}" required />
    </div>
    <div>
        <label for="fechaNacimiento">Fecha de Nacimiento:</label>
        <input type="date" id="fechaNacimiento" name="fechaNacimiento" value="${user.fechaNacimiento}" required />
    </div>
    <div>
        <label for="pass">Contraseña:</label>
        <input type="password" id="pass" name="pass" value="${user.pass}" required />
    </div>
    <div>
        <label for="nombreUsuario">Nombre de Usuario:</label>
        <input type="text" id="nombreUsuario" name="nombreUsuario" value="${user.nombreUsuario}" required />
    </div>
    <div>
        <label for="idtipo_usuario">Tipo de Usuario:</label>
        <input type="number" id="idtipo_usuario" name="idtipo_usuario" value="${user.tipoUsuario}" required />
    </div>
    <div>
        <label for="id_division">División:</label>
        <input type="number" id="id_division" name="id_division" value="${user.idDIvision}" required />
    </div>
    <div>
        <button type="submit">Actualizar</button>
    </div>
</form>

<c:if test="${not empty mensajeError}">
    <div style="color: red;">
            ${mensajeError}
    </div>
</c:if>
</body>
</html>

