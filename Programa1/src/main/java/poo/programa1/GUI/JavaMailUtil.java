/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1.GUI;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.AddressException;

/**
 *
 * @author dandi
 */
public class JavaMailUtil {

    /**
     * Método para mandar correos
     * @param recipient
     * @param texto
     * @param atleta
     * @throws MessagingException
     */
    public static void sendMail(String recipient, String texto, String atleta) throws MessagingException{
          Properties properties = new Properties();
          properties.put("mail.smtp.auth", true);
          properties.put("mail.smtp.starttls.enable", true);
          properties.put("mail.smtp.host", "smtp.gmail.com");
          properties.put("mail.smtp.port", 587);
          
          String myAccountEmail = "sistemacajero2022@gmail.com";
          String password = "tvjbbvmczjeadpia";
          
          Session session = Session.getInstance(properties, new Authenticator() {
               @Override
               protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(myAccountEmail, password);
               }
          } );
          
          Message message = prepareMessage(session, myAccountEmail, recipient, atleta, texto);
          Transport.send(message);
          System.out.println("Message sent successfully");
     }
     
    /**
     * Hace el texto del correo
     * @param session
     * @param myAccountEmail
     * @param recipient
     * @param atleta
     * @param texto
     * @return Mensaje
     */
     private static Message prepareMessage(Session session, String myAccountEmail, String recipient, String atleta, String texto){
          try {
               Message message = new MimeMessage(session);
               message.setFrom(new InternetAddress(myAccountEmail));
               message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
               message.setSubject("Resultados de atleta: " + atleta);
               message.setText(texto);
               return message;
          } catch (MessagingException ex) {
               Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
          }
          return null;
     }
    
    /**
     * Método que valida sin un correo es válido
     * @param email
     * @return verdadero si el correo es válido, falso si no
     */
    public static boolean validateEmail(String email) {
        boolean isValid = false;
        try {
            // Crea objeto InternetAddress y valida el correo dado.
            InternetAddress internetAddress = new InternetAddress(email);
            internetAddress.validate();
            isValid = true;
        } catch (AddressException e) {
            e.printStackTrace();
        }
        return isValid;
    }
}
