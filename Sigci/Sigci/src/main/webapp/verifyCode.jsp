<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Verificar Código de Recuperación</title>
</head>
<body>
<h2>Verificar Código de Recuperación</h2>
<form action="update-password-recovery" method="post">
    <label for="correo">Código de Recuperación:</label>
    <input type="email" id="correo" name="correo" required>
    <br>
    <label for="newPass">Código de Recuperación:</label>
    <input type="text" id="newPass" name="newPass" required>
    <br>
    <label for="code">Código de Recuperación:</label>
    <input type="text" id="code" name="code" required>
    <br>
    <button type="submit">Verificar Código</button>
</form>
</body>
</html>
