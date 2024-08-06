package utez.edu.mx.sicci.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.security.SecureRandom;
import java.sql.SQLException;
import java.util.Properties;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import utez.edu.mx.sicci.dao.UserDao;
import utez.edu.mx.sicci.model.User;

@WebServlet(name ="SendRecoveryCodeServlet", value = "/recovery-code")
public class SendRecoveryCodeServlet extends HttpServlet {
    private UserDao userDao;

    @Override
    public void init() throws ServletException {
        userDao = new UserDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String recoveryCode = generateRandomCode();

        User user = userDao.selectUserByEmail(email);

        if (user != null) {
            // Se encontro el usuario
            try {
                boolean actualizado = userDao.updateCode(email, recoveryCode);
                if (actualizado) {
                    sendEmail(email, recoveryCode);
                    response.sendRedirect("verifyCode.jsp");
                } else {
                    // Mandar a una pantalla de error o al index
                    response.sendRedirect("index.jsp");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            // No se encontro usuario
        }
    }


    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz0123456789";
    private static final int CODE_LENGTH = 6;
    private static final SecureRandom random = new SecureRandom();

    public static String generateRandomCode() {
        StringBuilder code = new StringBuilder(CODE_LENGTH);
        for (int i = 0; i < CODE_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            code.append(CHARACTERS.charAt(index));
        }
        return code.toString();
    }


    private void sendEmail(String to, String recoveryCode) {
        // Configuración del correo
        String from = "tu_correo@example.com";
        String host = "smtp.example.com";
        String username = "tu_correo@example.com";
        String password = "tu_contraseña";

        // Propiedades del correo
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.port", "587");

        // Obtener la sesión de correo
        Session session = Session.getInstance(properties, new jakarta.mail.Authenticator() {
            protected jakarta.mail.PasswordAuthentication getPasswordAuthentication() {
                return new jakarta.mail.PasswordAuthentication(username, password);
            }
        });

        try {
            // Crear el mensaje
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Código de Recuperación de Cuenta");
            message.setText("Tu código de recuperación es: " + recoveryCode);

            // Enviar el mensaje
            Transport.send(message);
            System.out.println("Correo enviado exitosamente...");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
