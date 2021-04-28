package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.SocialImprintsLogin;
import utils.SeleniumDriver;

public class SocialImprintsLoginActions {

	SocialImprintsLogin socialImprintsLogin = null;

	public SocialImprintsLoginActions() {
		this.socialImprintsLogin = new SocialImprintsLogin();
		PageFactory.initElements(SeleniumDriver.getDriver(), socialImprintsLogin);
	}
	
	public void click_on_sign_in_with_google() {
		socialImprintsLogin.sign_in_with_google.click();
	}
}

