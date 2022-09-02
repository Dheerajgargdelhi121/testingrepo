package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.locators.GmailEmailID;
import utils.SeleniumDriver;

public class GmailEmailIDActions {

	GmailEmailID gmailEmailID = null;
	private static WebDriverWait wait;
	private final static int TIMEOUT = 30;
	JavascriptExecutor j;

	public GmailEmailIDActions() {
		this.gmailEmailID = new GmailEmailID();
		PageFactory.initElements(SeleniumDriver.getDriver(), gmailEmailID);
		wait = new WebDriverWait(SeleniumDriver.getDriver(), TIMEOUT);
		j = (JavascriptExecutor) SeleniumDriver.getDriver();
	}

	public void enter_email_id() {
		gmailEmailID.email_id.sendKeys("demouser1@socialimprints.com");
	}

	public void click_on_next() {
		gmailEmailID.next.click();
	}

	public void get_country_name() {
		wait.until(ExpectedConditions.elementToBeClickable(gmailEmailID.country_name));
		System.out.println("Country name is " + gmailEmailID.country_name.getText());
	}
}
