package pages.actions;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;

import org.openqa.selenium.support.PageFactory;

import pages.locators.GmailEmailID;
import pages.locators.GmailPassword;
import utils.SeleniumDriver;

public class GmailPasswordActions {

	GmailPassword gmailPassword = null;

	public GmailPasswordActions() {
		this.gmailPassword = new GmailPassword();
		PageFactory.initElements(SeleniumDriver.getDriver(), gmailPassword);
	}

	public void enter_password() {
		gmailPassword.password.sendKeys("qq11WW@@");

	}

	public void click_on_submit() {
		gmailPassword.submit.click();
	}

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
	
	public void downloadfile() throws InterruptedException, IOException {
		
		SeleniumDriver.getDriver().
		get("http://autopract.com/selenium/download.html");
	    //driver.findElement(By.cssSelector("#download")).click();
	   //Assert.assertTrue(FileUtil.isFileDownloaded("sample", "csv", 5000));
		
	}

}
