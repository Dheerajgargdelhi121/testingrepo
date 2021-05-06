package pages.actions;

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

}
