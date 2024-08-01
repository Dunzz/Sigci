<%--
  Created by IntelliJ IDEA.
  User: jerss
  Date: 31/07/2024
  Time: 10:26 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center><h2>Actualizar Carreras</h2></center>
<br>
<form action="actualizarCarrera" method="post" >
    <input type="hidden" name="idcarrrera" value="${carrrera.idcarrrera}">
    <label>Ingrese la nueva descripcion: </label>
    <input type="text" id="descripcion" name="descripcion" value="${carrrera.descripcion}" required>

    <input type="hidden" value="${carrrera.idcarrrera}" name="idcarrrera" />
    <input type="submit" value="Aceptar">
</form>
<a href="getListaCarrera">Volver a la lista</a>

</body>
</html>
