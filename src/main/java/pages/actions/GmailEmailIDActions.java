package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.GmailEmailID;
import utils.SeleniumDriver;

public class GmailEmailIDActions {

	GmailEmailID gmailEmailID = null;
	
	public GmailEmailIDActions() {
		this.gmailEmailID = new GmailEmailID();
		PageFactory.initElements(SeleniumDriver.getDriver(), gmailEmailID);
	}
	
	public void enter_email_id() {
		gmailEmailID.email_id.sendKeys("demouser1@socialimprints.com");
	}
	
	public void click_on_next() {
		gmailEmailID.next.click();
	}
}
