<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registrar Materia</title>
    <link href="<%= request.getContextPath() %>/css/bootstrap.css" rel="stylesheet">
    <link href="<%= request.getContextPath() %>/css/registrar.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="login-box">
        <center><h2>Registrar Materia</h2></center>
        <br>
        <form id="FormLogin" action="registrarMateria" name="registroMateria" method="post">
            <div class="user-box">
                <input type="text" id="nombre_materia" name="nombre_materia" required>
                <label>Nombre materia:</label>
            </div>
            <center><input type="submit" class="registrar" value="Registrar"></center>
        </form>
    </div>
</div>
</body>
<script src="<%= request.getContextPath() %>/js/bootstrap.js"></script>
</html>