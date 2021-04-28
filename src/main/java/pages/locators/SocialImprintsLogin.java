package pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SocialImprintsLogin {
	
	@FindBy(how=How.LINK_TEXT,using="Sign in with Google")
	public WebElement sign_in_with_google;
	
}

