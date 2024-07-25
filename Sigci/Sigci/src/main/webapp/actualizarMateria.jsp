<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<center><h2>Actualizar Materia</h2></center>
<br>
<form action="actualizarMateria" method="post" >
    <input type="hidden" name="id" value="${materia.id_materia}">
    <label>Ingrese la nueva descripcion: </label>
    <input type="text" id="nombre_materia" name="nombre_materia" value="${materia.nombre_materia}" required>

    <input type="hidden" value="${materia.id_materia}" name="id_materia" />
    <input type="submit" value="Aceptar">
</form>
<a href="getListaMaterias">Volver a la lista</a>

</body>
</html>
