package pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GmailEmailID {

	@FindBy(how = How.ID, using = "identifierId")
	public WebElement email_id;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")
	public WebElement next;

	@FindBy(how = How.XPATH, using = "//*//div[@class='country-details d-inline-block align-middle lh-1-point-5']")
	public WebElement country_name;

}
