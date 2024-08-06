<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Recuperar Cuenta</title>
</head>
<body>
<h2>Recuperar Cuenta</h2>
<form action="SendRecoveryCodeServlet" method="post">
    <label for="correo">Correo Electrónico:</label>
    <input type="email" id="correo" name="correo" required>
    <button type="submit">Enviar Código</button>
</form>
</body>
</html>
