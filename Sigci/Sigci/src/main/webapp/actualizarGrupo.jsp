<%--
  Created by IntelliJ IDEA.
  User: jerss
  Date: 26/07/2024
  Time: 12:54 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center><h2>Actualizar Grupo</h2></center>
<br>
<form action="actualizarGrupo" method="post" >
    <input type="hidden" name="id" value="${grupo.id_grupo}">
    <label>Ingrese la nueva descripcion: </label>
    <input type="text" id="descripcion" name="descripcion" value="${grupo.descripcion}" required>

    <input type="hidden" value="${grupo.id_grupo}" name="id_grupo" />
    <input type="submit" value="Aceptar">
</form>
<a href="getListaGrupos">Volver a la lista</a>
</body>
</html>
