package procesos_pi_scripts;




import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;



public class email {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{    
		      
			propiedades Archivopropiedades1 = new propiedades();
			
			String host = Archivopropiedades1.host();
			String from = Archivopropiedades1.from();
			String to = Archivopropiedades1.to();
			String cc = Archivopropiedades1.cc();

		      // Get system properties
		      Properties properties = System.getProperties();

		      // Setup mail server
		      //properties.setProperty("mail.smtp.host", host);
		      properties.setProperty("mail.smtp.host", host);

		      // Get the default Session object.
		      Session session = Session.getDefaultInstance(properties);

		      try{
		         // Create a default MimeMessage object.
		         MimeMessage message = new MimeMessage(session);

		         // Set From: header field of the header.
		         message.setFrom(new InternetAddress(from));

		         // Set To: header field of the header.
		         message.addRecipient(Message.RecipientType.TO,
		                                  new InternetAddress(to));
		         
		         message.addRecipients(Message.RecipientType.CC, InternetAddress.parse(cc));
		         
		        

		         // Set Subject: header field
		         message.setSubject("Fallo en PI !!!!");

		         // Now set the actual message
		         message.setText("Se ha producido un fallo en PI, se ha reiniciado");

		         // Send message
		         Transport.send(message);
		         System.out.println("Sent message successfully....");
		      }catch (MessagingException mex) {
		         mex.printStackTrace();
		      }
		      //return email;
		   }
	}
}
		
		