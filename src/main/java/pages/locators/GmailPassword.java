package pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailPassword {

	@FindBy(how = How.NAME, using = "password")
	public WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id=\"passwordNext\"]/div/button/div[2]")
	public WebElement submit;

}


