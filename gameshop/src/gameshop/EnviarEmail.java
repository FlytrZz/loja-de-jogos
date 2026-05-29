package gameshop;
import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;

public class EnviarEmail {

    public void enviar(String email,String assunto,String menssagem){
        
        final String usuario = "henriquefechine12@gmail.com";
        final String senha = "acah gblw werq wqdn";
       
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(usuario, senha);
            }
        });

        try {
  
            Message mensagem = new MimeMessage(session);
            mensagem.setFrom(new InternetAddress(usuario));
            mensagem.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email));
            mensagem.setSubject(assunto);
            mensagem.setText(menssagem);

            
            Transport.send(mensagem);
            System.out.println("E-mail enviado com sucesso!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}


	

