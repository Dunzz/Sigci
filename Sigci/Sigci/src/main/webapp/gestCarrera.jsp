<%@ page import="utez.edu.mx.sicci.model.User" %>
<%
    // Estas lineas lo que hacen es borrar la caché, si el usuario cierra la sesión, y quiere regresar a la página de atras no lo dejaría
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
    response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
    response.setDateHeader("Expires", 0); // Proxies.
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu carreras</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/css/bootstrap.css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/css/gestionarMat.css">
</head>
<body>
<%
    User u = (User) session.getAttribute("user");
    if(u != null){
%>
<header>
    <div class="user"> <svg version="1.0" xmlns="http://www.w3.org/2000/svg"
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
    </svg> Administrador</div>



    <a class="logout-button" href="logout">Salir</a>
</header>


<br>

<div class="container">
    <div class="row">
        <div class="col-md-6 col-lg-4">
            <a href="asignarCarrera">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">
                            <svg version="1.0" xmlns="http://www.w3.org/2000/svg"
                                 width="200.000000pt" height="75.000000pt" viewBox="0 0 512.000000 512.000000"
                                 preserveAspectRatio="xMidYMid meet">

                                <g transform="translate(0.000000,512.000000) scale(0.100000,-0.100000)"
                                   fill="#002DA0" stroke="none">
                                    <path d="M1323 3722 c-678 -284 -1233 -519 -1233 -522 0 -3 556 -238 1235
-523 l1236 -517 793 332 c483 203 788 335 777 339 -9 3 -374 71 -811 150 -871
157 -840 149 -840 219 0 37 39 80 72 80 19 0 1553 -278 1716 -311 l52 -10 0
-807 0 -807 -36 -29 c-50 -39 -69 -89 -93 -241 -12 -71 -23 -145 -26 -162 l-6
-33 241 0 242 0 -6 27 c-3 16 -13 74 -21 131 -29 195 -42 233 -100 279 l-35
28 0 810 0 810 275 115 c151 63 275 117 275 120 0 4 -2417 1021 -2460 1034 -8
3 -570 -228 -1247 -512z"/>
                                    <path d="M1120 2082 c0 -576 -3 -553 81 -664 224 -300 826 -538 1359 -538 533
0 1134 238 1360 538 83 111 81 89 78 664 l-3 506 -615 -259 c-670 -283 -786
-329 -826 -329 -14 0 -333 129 -708 286 -374 157 -691 290 -703 295 l-23 9 0
-508z"/>
                                </g>
                            </svg>

                            <br> <center>Registrar Carreras</center></h5>
                    </div>
                </div>
            </a>
        </div>
        <div class="col-md-6 col-lg-4">
            <a href="">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title"> <svg version="1.0" xmlns="http://www.w3.org/2000/svg"
                                                     width="200.000000pt" height="75.000000pt" viewBox="0 0 512.000000 512.000000"
                                                     preserveAspectRatio="xMidYMid meet">

                            <g transform="translate(0.000000,512.000000) scale(0.100000,-0.100000)"
                               fill="#002DA0" stroke="none">
                                <path d="M2380 5114 c-19 -2 -78 -9 -130 -15 -461 -51 -923 -247 -1295 -546
-543 -438 -877 -1061 -946 -1763 -14 -151 -6 -450 16 -600 168 -1118 1045
-1996 2158 -2161 254 -37 555 -35 789 6 98 17 149 48 193 120 26 42 30 58 30
120 0 62 -4 78 -30 121 -19 30 -49 60 -79 79 -44 27 -58 30 -130 30 -45 0
-135 -6 -201 -14 -413 -48 -888 60 -1265 287 -193 116 -442 337 -571 507 -285
374 -439 820 -439 1275 0 546 227 1093 610 1471 694 683 1745 805 2567 296
607 -377 983 -1052 983 -1767 0 -584 -252 -1148 -687 -1543 l-108 -97 -5 161
c-7 213 10 199 -242 199 -187 0 -189 0 -213 -25 l-25 -24 0 -509 c0 -487 1
-511 19 -533 l19 -24 601 0 c563 0 601 1 618 18 16 16 18 39 18 218 0 257 16
239 -212 239 l-166 0 134 138 c210 216 335 393 464 657 89 182 136 308 180
480 113 443 113 847 0 1291 -45 175 -91 298 -180 479 -130 265 -255 443 -460
654 -410 421 -881 663 -1471 756 -94 15 -467 28 -544 19z"/>
                                <path d="M1823 3661 c-75 -26 -130 -65 -164 -119 -61 -96 -59 -63 -58 -1016 0
-725 2 -864 13 -830 34 107 134 196 245 217 l61 12 0 877 0 878 -22 0 c-13 -1
-46 -9 -75 -19z"/>
                                <path d="M2080 2800 l0 -880 720 0 720 0 -2 861 -3 861 -24 19 c-22 18 -49 19
-717 19 l-694 0 0 -880z m1175 615 l25 -24 0 -231 0 -231 -25 -24 -24 -25
-431 0 -431 0 -24 25 -25 24 0 231 0 231 25 24 24 25 431 0 431 0 24 -25z"/>
                                <path d="M2480 3160 l0 -120 320 0 320 0 0 120 0 120 -320 0 -320 0 0 -120z"/>
                                <path d="M1852 1743 c-18 -9 -45 -32 -60 -51 -39 -51 -38 -134 0 -184 55 -72
6 -69 892 -66 748 3 796 4 813 21 15 15 19 39 21 157 l4 140 -819 0 c-737 0
-821 -2 -851 -17z"/>
                            </g>
                        </svg>
                            <br><center>Actualizar Carrera</center></h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-6 col-lg-4">
            <a href="asignarMatDoc.jsp">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">
                            <svg version="1.0" xmlns="http://www.w3.org/2000/svg"
                                 width="200.000000pt" height="75.000000pt" viewBox="0 0 512.000000 512.000000"
                                 preserveAspectRatio="xMidYMid meet">

                                <g transform="translate(0.000000,512.000000) scale(0.100000,-0.100000)"
                                   fill="#002DA0" stroke="none">
                                    <path d="M1323 3722 c-678 -284 -1233 -519 -1233 -522 0 -3 556 -238 1235
-523 l1236 -517 793 332 c483 203 788 335 777 339 -9 3 -374 71 -811 150 -871
157 -840 149 -840 219 0 37 39 80 72 80 19 0 1553 -278 1716 -311 l52 -10 0
-807 0 -807 -36 -29 c-50 -39 -69 -89 -93 -241 -12 -71 -23 -145 -26 -162 l-6
-33 241 0 242 0 -6 27 c-3 16 -13 74 -21 131 -29 195 -42 233 -100 279 l-35
28 0 810 0 810 275 115 c151 63 275 117 275 120 0 4 -2417 1021 -2460 1034 -8
3 -570 -228 -1247 -512z"/>
                                    <path d="M1120 2082 c0 -576 -3 -553 81 -664 224 -300 826 -538 1359 -538 533
0 1134 238 1360 538 83 111 81 89 78 664 l-3 506 -615 -259 c-670 -283 -786
-329 -826 -329 -14 0 -333 129 -708 286 -374 157 -691 290 -703 295 l-23 9 0
-508z"/>
                                </g>
                            </svg><br><center>Asignar docente a materias</center></h5>
                    </div>
                </div>
            </a>
        </div>
    </div>
</div>

<footer class="footer"><svg version="1.0" xmlns="http://www.w3.org/2000/svg"
                            width="70.000000pt" height="60.000000pt" viewBox="0 0 277.000000 317.000000"
                            preserveAspectRatio="xMidYMid meet">

    <g transform="translate(0.000000,317.000000) scale(0.100000,-0.100000)"
       fill="#000000" stroke="none">
        <path d="M1287 3086 c-57 -21 -112 -61 -136 -99 -18 -30 -28 -35 -70 -40 -102
   -12 -197 -91 -225 -188 -9 -29 -16 -57 -16 -63 0 -7 -25 -11 -62 -11 -105 -1
   -192 -55 -239 -148 -25 -49 -36 -143 -21 -186 10 -29 8 -34 -37 -79 -156 -156
   -157 -399 -2 -566 40 -43 47 -55 40 -76 -23 -80 0 -182 58 -249 49 -58 103
   -83 190 -89 l71 -5 7 -35 c22 -118 132 -221 236 -222 31 0 42 -7 79 -51 90
   -107 244 -132 353 -57 15 11 27 15 27 9 0 -7 46 -11 134 -11 120 0 136 2 160
   21 24 19 26 27 26 89 l0 68 45 17 45 18 40 -37 c64 -58 80 -62 133 -36 102 51
   286 235 337 337 26 53 22 69 -36 133 l-37 40 18 45 17 45 67 0 c83 0 98 13
   117 102 17 82 17 314 0 396 -19 88 -34 102 -112 102 -55 0 -65 3 -78 23 -31
   50 -29 63 19 123 38 46 45 62 40 83 -16 67 -162 237 -273 319 -119 87 -133 89
   -207 21 l-44 -41 -46 17 -45 18 0 68 c0 61 -3 70 -26 88 -23 18 -41 21 -139
   21 l-112 0 -44 35 c-74 59 -173 79 -252 51z m148 -95 c46 -21 79 -54 94 -94 7
   -18 11 -160 11 -398 l0 -369 -51 0 c-77 0 -129 40 -129 100 0 24 -36 49 -61
   43 -43 -12 -36 -97 12 -156 44 -54 96 -77 169 -77 l60 0 -2 -162 -3 -163 -47
   1 c-58 0 -88 24 -88 68 0 45 -41 126 -82 162 -51 45 -112 66 -183 62 -58 -3
   -60 -4 -63 -32 -5 -39 8 -48 79 -57 95 -11 144 -57 158 -147 15 -93 68 -140
   171 -149 l60 -6 0 -261 c0 -252 -1 -262 -23 -301 -52 -92 -188 -114 -264 -43
   -13 12 -23 24 -23 28 0 3 20 20 44 37 98 69 151 241 81 259 -34 8 -51 -8 -59
   -57 -15 -93 -73 -150 -161 -157 -69 -6 -117 11 -154 53 -41 47 -57 104 -44
   158 11 50 8 64 -17 77 -13 7 -31 4 -66 -11 -149 -67 -301 78 -239 228 23 54
   19 68 -28 105 -58 45 -74 65 -102 122 -67 139 -18 317 110 396 39 24 44 47 20
   103 -21 50 -19 93 6 145 39 80 128 117 209 87 76 -28 86 -29 103 -5 12 17 13
   29 5 57 -21 78 20 166 97 203 38 18 55 21 100 15 92 -11 146 -66 163 -169 9
   -50 42 -66 73 -35 17 17 19 28 14 62 -11 67 -39 119 -87 163 -24 23 -51 43
   -59 46 -39 15 66 88 125 88 17 0 49 -9 71 -19z m253 -127 c20 -6 22 -13 22
   -64 0 -41 5 -64 18 -78 21 -24 182 -92 235 -99 35 -5 43 -1 82 37 42 41 44 42
   67 26 33 -23 136 -125 166 -164 l25 -33 -42 -43 c-48 -49 -54 -82 -26 -136 10
   -19 30 -66 45 -105 30 -80 49 -95 126 -95 63 0 64 -2 64 -150 0 -150 0 -150
   -69 -150 -68 0 -95 -16 -112 -68 -6 -20 -25 -66 -41 -102 -41 -89 -39 -113 13
   -166 37 -38 41 -45 29 -61 -26 -34 -145 -154 -173 -175 l-29 -21 -42 42 c-53
   52 -78 54 -166 13 -36 -16 -82 -35 -102 -41 -52 -17 -68 -44 -68 -112 0 -50
   -3 -57 -22 -63 -50 -13 -48 -22 -48 262 l0 267 60 23 c83 33 161 106 202 190
   30 61 33 75 33 162 0 82 -4 103 -27 152 -36 77 -107 151 -181 188 -33 16 -66
   30 -74 30 -10 0 -13 51 -13 270 0 286 -2 277 48 264z m4 -719 c92 -62 122
   -200 66 -296 -23 -39 -90 -99 -111 -99 -4 0 -7 95 -7 210 0 116 3 210 8 210 4
   0 24 -11 44 -25z"/>
        <path d="M1202 2527 c-6 -6 -13 -24 -17 -39 -8 -32 -31 -53 -67 -62 -64 -15
   -56 -86 10 -86 73 0 142 68 142 141 0 52 -40 80 -68 46z"/>
        <path d="M758 2380 c-21 -13 -24 -50 -6 -68 7 -7 23 -12 35 -12 59 0 102 -48
   94 -105 -4 -29 -41 -65 -66 -65 -35 0 -57 -23 -53 -55 3 -26 8 -30 37 -33 47
   -5 74 4 111 34 117 99 62 291 -90 309 -25 3 -53 1 -62 -5z"/>
        <path d="M906 1850 c-22 -11 -48 -28 -59 -37 -30 -28 -64 -94 -72 -140 -9 -55
   7 -83 45 -83 24 0 31 5 36 28 3 15 10 43 15 63 13 52 70 99 122 99 26 0 57 28
   57 51 0 42 -77 52 -144 19z"/>
        <path d="M1086 1641 c-23 -25 -12 -87 24 -145 60 -93 220 -131 220 -51 0 28
   -19 45 -50 45 -57 0 -120 67 -120 129 0 19 -26 41 -48 41 -5 0 -16 -8 -26 -19z"/>
        <path d="M914 641 c-71 -44 -86 -120 -36 -171 27 -26 85 -50 123 -50 9 0 27
   -8 40 -19 20 -16 21 -21 10 -35 -26 -31 -111 -12 -111 25 0 5 -22 9 -50 9 -44
   0 -50 -3 -50 -20 0 -88 121 -143 241 -110 78 22 111 105 67 170 -23 34 -52 49
   -136 70 -49 13 -64 36 -37 56 26 19 52 17 75 -6 14 -14 33 -20 65 -20 38 0 45
   3 45 20 0 11 -15 37 -34 57 -33 36 -37 38 -108 41 -59 2 -79 -1 -104 -17z"/>
        <path d="M1210 459 l0 -200 53 3 52 3 3 198 2 197 -55 0 -55 0 0 -201z"/>
        <path d="M1475 646 c-43 -18 -93 -79 -101 -121 -3 -20 -4 -62 -2 -95 7 -101
   70 -160 178 -168 43 -2 65 2 100 20 54 28 77 66 86 141 l7 57 -92 0 -91 0 0
   -35 c0 -33 2 -35 35 -35 42 0 47 -22 10 -46 -32 -21 -89 -11 -110 19 -9 13
   -15 44 -15 80 0 48 4 62 25 82 30 31 77 33 105 5 24 -24 120 -29 120 -6 0 24
   -44 79 -80 97 -41 22 -130 25 -175 5z"/>
        <path d="M1878 640 c-58 -31 -88 -91 -88 -177 0 -92 28 -147 90 -180 104 -55
   246 -4 266 95 l7 32 -48 0 c-39 0 -52 -5 -75 -30 -48 -52 -111 -32 -130 40
   -30 111 71 202 132 120 19 -26 28 -30 70 -30 44 0 48 2 48 24 0 33 -39 86 -80
   107 -47 26 -142 25 -192 -1z"/>
        <path d="M2202 463 l3 -198 53 -3 52 -3 0 200 0 201 -55 0 -55 0 2 -197z"/>
    </g>
</svg>
</footer>
<script src="<%= request.getContextPath() %>/js/enlaces.js"></script>
<script src="<%= request.getContextPath() %>/js/bootstrap.js"></script>
<%
}else{
%>
<a href="${pageContext.request.contextPath}/login.jsp">Iniciar Sesión</a>
<%
    }
%>
</body>
</html>
