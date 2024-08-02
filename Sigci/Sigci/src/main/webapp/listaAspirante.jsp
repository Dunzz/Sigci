<%
    // Estas lineas lo que hacen es borrar la caché, si el usuario cierra la sesión, y quiere regresar a la página de atras no lo dejaría
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
    response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
    response.setDateHeader("Expires", 0); // Proxies.
%>
<%@ page import="utez.edu.mx.sicci.dao.UserDao" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="utez.edu.mx.sicci.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Gestionar Aspirantes</title>
    <link href="<%= request.getContextPath() %>/css/bootstrap.css" rel="stylesheet">
    <link href="<%= request.getContextPath() %>/css/listaAspirante.css" rel="stylesheet">

</head>
<body>
<%
    User user = (User) session.getAttribute("user");
    if(user != null){
        String nombre = user.getNombre() + " " + user.getApellidos();
        request.setAttribute("nombre", nombre);
%>
<header>
    <div class="user">
        <svg version="1.0" xmlns="http://www.w3.org/2000/svg"
             width="40.000000pt" height="30.000000pt" viewBox="0 0 512.000000 512.000000"
             preserveAspectRatio="xMidYMid meet">
            <g transform="translate(0.000000,512.000000) scale(0.100000,-0.100000)"
               fill="#FFF" stroke="none">
                <path d="M2370 5114 c-19 -2 -78 -9 -130 -15 -791 -90 -1522 -586 -1924 -1305
           -146 -262 -252 -588 -297 -914 -18 -125 -18 -515 0 -640 105 -762 511 -1409
           1146 -1826 609 -400 1377 -517 2090 -317 929 260 1646 1043 1819 1987 156 845
           -103 1682 -705 2285 -399 398 -879 639 -1449 726 -100 15 -472 28 -550 19z
           m395 -304 c785 -72 1480 -554 1825 -1264 38 -78 83 -181 100 -231 251 -720
           129 -1508 -326 -2110 -46 -60 -105 -134 -132 -164 l-48 -54 -38 78 c-328 693
           -1082 1095 -1841 984 -574 -84 -1083 -460 -1331 -984 l-38 -78 -48 54 c-327
           364 -534 834 -578 1314 -67 727 233 1459 790 1928 464 390 1069 582 1665 527z
           m50 -3066 c315 -55 627 -230 838 -470 84 -97 189 -259 235 -367 61 -141 62
           -128 -15 -184 -278 -202 -627 -344 -983 -399 -144 -22 -491 -25 -625 -5 -254
           38 -472 104 -691 211 -123 60 -373 214 -389 240 -8 12 46 146 92 230 237 436
           659 711 1168 764 71 7 278 -4 370 -20z"/>
                <path d="M2449 4310 c-382 -47 -694 -314 -805 -687 -32 -108 -43 -293 -24
           -409 36 -224 158 -439 332 -583 89 -74 260 -162 378 -193 119 -32 346 -32 465
           0 113 31 286 119 373 192 174 146 296 360 332 584 19 116 8 301 -24 409 -81
           271 -273 495 -523 609 -143 64 -352 97 -504 78z m197 -301 c215 -30 401 -163
           494 -353 52 -106 70 -181 70 -291 0 -187 -56 -321 -190 -456 -69 -70 -101 -94
           -170 -128 -193 -94 -387 -94 -580 0 -68 34 -102 59 -171 128 -133 134 -189
           268 -189 456 0 110 18 185 69 290 104 211 320 350 568 364 12 0 56 -4 99 -10z"/>
            </g>
        </svg>
        <%= nombre %>
    </div>
    <a class="logout-button" href="logout">Salir</a>
</header>
<h5>Gestionar Aspirantes</h5>
<table>
    <thead>
    <tr>
        <th>Nombre Completo</th>
        <th>Correo</th>
        <th>Fecha de Creación</th>
        <th>ID de División</th>
        <th>Estado Usuario</th>
        <th>Actualizar</th>
        <th>Borrar</th>
    </tr>
    </thead>
    <tbody>
    <%
        // Obtenemos la lista de usuarios
        ArrayList<User> lista_admin_aspirantes = (ArrayList <User>) request.getAttribute("lista_admin_aspirantes");
        if (lista_admin_aspirantes != null){
            for(User u : lista_admin_aspirantes){ %>
    <tr>
        <td><%=u.getNombre()%> <%=u.getApellidos()%></td>
        <td><%=u.getEmail()%></td>
        <td><%=u.getFecha_creacion()%></td>
        <td><%=u.getId_division()%></td>
        <td><%= u.getEstado_usuario() == 1 ? "Aprobado" : "Desaprobado" %></td>
        <td><a href="updateAspirante?id_usuario=<%=u.getId_usuario()%>">Actualizar</a></td> <!-- Funcionalidad de actualizar -->
        <td><a href="borrarAspirante?id_usuario=<%=u.getId_usuario()%>">Borrar</a></td> <!-- Funcionalidad de borrar -->
    </tr>
    <% }} %>
    </tbody>
</table>
<%
}else{
%>
<style>
    .container-logout {
        text-align: center;
        background-color: white;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    .container-logout h1 {
        color: #333;
    }
    .container-logout p {
        color: #666;
    }
    .container-logout a {
        display: inline-block;
        margin-top: 10px;
        padding: 10px 20px;
        background-color: #007bff;
        color: white;
        text-decoration: none;
        border-radius: 5px;
    }
    .container-logout a:hover {
        background-color: #0056b3;
    }

</style>
<div class="container-logout">
    <h1>Sesión Expirada</h1>
    <br>
    <svg version="1.0" xmlns="http://www.w3.org/2000/svg"
         width="200.000000pt" height="100.000000pt" viewBox="0 0 512.000000 512.000000"
         preserveAspectRatio="xMidYMid meet">

        <g transform="translate(0.000000,512.000000) scale(0.100000,-0.100000)"
           fill="#FB0D1C" stroke="none">
            <path d="M2410 5114 c-565 -50 -978 -204 -1410 -528 -110 -82 -350 -317 -436
-426 -246 -312 -420 -677 -503 -1056 -76 -344 -74 -759 5 -1108 216 -958 976
-1717 1934 -1930 192 -43 347 -59 560 -59 354 0 670 62 987 194 496 207 930
585 1213 1059 328 548 434 1223 294 1860 -229 1037 -1102 1836 -2158 1975
-119 15 -401 26 -486 19z m340 -1794 l0 -760 -190 0 -190 0 0 760 0 760 190 0
190 0 0 -760z m-570 117 l0 -204 -62 -32 c-305 -159 -499 -478 -499 -826 -1
-203 46 -363 153 -526 54 -81 156 -191 228 -244 167 -124 411 -195 619 -180
418 29 753 303 863 706 20 72 23 106 22 244 -1 143 -3 169 -27 248 -80 260
-254 473 -479 583 l-58 28 0 204 0 203 23 -6 c388 -119 722 -445 851 -835 58
-175 69 -246 69 -430 0 -184 -16 -282 -73 -445 -112 -319 -359 -595 -675 -753
-22 -11 -80 -34 -130 -52 -439 -155 -913 -72 -1282 225 -242 195 -413 487
-468 799 -20 115 -20 337 0 452 70 398 333 760 685 944 76 39 213 98 233 99 4
1 7 -91 7 -202z"/>
        </g>
    </svg>
    <br>
    <p>Tu sesión ha expirado. Por favor, vuelve a iniciar sesión.</p>
    <a href="${pageContext.request.contextPath}/login.jsp">Regresar</a>
</div>
<br>
<%
    }
%>
</body>
</html>