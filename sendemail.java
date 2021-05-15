import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class sendemail {

	public static void main(String[] args) throws EmailException
	{
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("tanmayaktripathy@gmail.com", "lovednature"));
		email.setSSLOnConnect(true);
		email.setFrom("tanmayaktripathy@gmail.com");
		email.setSubject("mail by Automation");
		email.setMsg("Sidhi is a very nice girl.");
		email.addTo("karishmatripathy2012@gmail.com");
		email.addTo("chinmayaktripathy@gmail.com");
		email.addTo("gntripathy1959@gmail.com");
		email.send();
	}

}
