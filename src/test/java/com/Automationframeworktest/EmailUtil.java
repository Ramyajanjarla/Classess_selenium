package com.Automationframeworktest;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class EmailUtil {

    public static void sendEmail(String toEmail, String subject, String bodyContent) {
        String fromEmail = "ramyaautomationtest@gmail.com ";  // Replace with your email
        String password = "YTPWork@123";      // Replace with your app password or email password

        // SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");  // SSL Trust for Gmail
        properties.put("mail.smtp.connectiontimeout", "10000");  // Connection timeout in ms
        properties.put("mail.smtp.timeout", "10000");  // Timeout for sending email in ms
        properties.put("mail.smtp.writetimeout", "10000");  // Timeout for writing email data

        // Create a session with the SMTP server
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        session.setDebug(true);  // Enable debugging for detailed log output

        try {
            // Create the email message
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(subject);
            message.setText(bodyContent);

            // Send the email
            Transport.send(message);
            System.out.println("Test results sent successfully to " + toEmail);
        } catch (MessagingException e) {
            e.printStackTrace();  // Print the stack trace for any exceptions
        }
    }

    public static void main(String[] args) {
        sendEmail("ramyaautomationtest@gmail.com ", "Test Subject", "This is a test email.");
    }
}
