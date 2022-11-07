
package model;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Mailhandler {
    
    public void mailToStudent(String to){
        // Get system properties
        Properties properties = System.getProperties();

        // Setup mailHandler server
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        
        String from="tutorainstitute@gmail.com";

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("tutorainstitute@gmail.com", "Tutora2001");

            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject(" Do Not Reply to this email (via system) ");

            // Now set the actual message
            message.setText("Tutora Institute moodle notification "
                    + "Your inquery has been sorted successfully");

            
            // Send message
            Transport.send(message);

           
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
    
    
    public void mailToEmployee(){
        // Get system properties
        Properties properties = System.getProperties();

        // Setup mailHandler server
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        
        String from="tutorainstitute@gmail.com";
        String to="nilangithnevindu@gmail.com";

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("tutorainstitute@gmail.com", "Tutora2001");

            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("New Inquery");

            // Now set the actual message
            message.setText( "Tutora Institute moodle notification "+"New Inquery has been recieved");

            
            // Send message
            Transport.send(message);

           
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
    
}
