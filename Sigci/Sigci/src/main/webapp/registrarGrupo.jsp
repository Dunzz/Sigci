<%--
  Created by IntelliJ IDEA.
  User: avile
  Date: 22/07/2024
  Time: 03:06 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registrar Grupo</title>
    <link href="<%= request.getContextPath() %>/css/bootstrap.css" rel="stylesheet">
    <link href="<%= request.getContextPath() %>/css/registrar.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="login-box">
        <center><h2>Registrar Grupos</h2></center>
        <br>
        <form id="FormLogin" action="registrarGrupo" name="registroGrupo" method="post">
            <div class="user-box">
                <input type="text" id="descricion" name="descripcion" required>
                <label> Descripcion</label>
            </div>
            <center><input type="submit" class="registrar" value="registrar"></center>
        </form>
    </div>
</div>
</body>
<script src="<%= request.getContextPath() %>/js/bootstrap.js"></script>
</html>
