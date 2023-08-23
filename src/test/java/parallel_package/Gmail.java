package parallel_package;

import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

public class Gmail {

	public void gmailIntegration() throws Exception {
		Properties props = new Properties();
		props.put("mail.store.protocol", "imaps");
		props.put("mail.imaps.host", "imap.gmail.com");
		props.put("mail.imaps.port", "993");

		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("dheerajmailerint@gmail.com", "hello@007");
			}
		});

		Store store = session.getStore("imaps");
		store.connect();
		Folder inbox = store.getFolder("inbox");
		inbox.open(Folder.READ_ONLY);
		Message[] messages = inbox.getMessages();

		for (Message message : messages) {
			String subject = message.getSubject();
			String content = message.getContent().toString();
			// Do something with the subject and content
			System.out.println("Subject is " + subject);
			System.out.println("Subject is " + content);
		}

	}

}
