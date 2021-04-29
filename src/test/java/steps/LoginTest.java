package steps;

import org.testng.Assert;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.actions.GmailEmailIDActions;
import pages.actions.GmailPasswordActions;
import pages.actions.SocialImprintsLoginActions;
import utils.SeleniumDriver;

public class LoginTest {

	GmailEmailIDActions gmailEmailIDActions = new GmailEmailIDActions();
	SocialImprintsLoginActions socialImprintsLoginActions = new SocialImprintsLoginActions();
	GmailPasswordActions gmailPasswordActions = new GmailPasswordActions();

	@Given("^user navigates to marin https://staging\\.dev\\.socialimprints\\.com/admin/sign_in$")
	public void user_navigates_to_marin_https_staging_dev_socialimprints_com_admin_sign_in() throws Throwable {
		SeleniumDriver.openPage("https://vinsol:v1ns0l@staging.dev.socialimprints.com/admin/sign_in");
	}

	@When("^user clicks on the Sign in google$")
	public void user_clicks_on_the_Sign_in_google() throws Throwable {
		socialImprintsLoginActions.click_on_sign_in_with_google();
	}

	@Then("^user entered username \"([^\"]*)\"$")
	public void user_entered_username(String arg1) throws Throwable {
		gmailEmailIDActions.enter_email_id();
		gmailEmailIDActions.click_on_next();
	}

	@Then("^user entered password \"([^\"]*)\"$")
	public void user_entered_password(String arg1) throws Throwable {
		gmailPasswordActions.enter_password();
		gmailPasswordActions.click_on_submit();
		Thread.sleep(5000);
	}

	@Then("^user logged successfully$")
	public void user_logged_successfully() throws Throwable {
		Thread.sleep(1000);
		String actualtitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals("Social Imprints", actualtitle);
		
		//just added comment, test cases will executed when i pushed my code to github. Through Jenkins.

	}
	
		 
	}
	
	

