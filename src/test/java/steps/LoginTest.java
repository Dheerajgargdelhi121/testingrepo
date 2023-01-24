package steps;

import org.testng.Assert;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
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

	@Given("^user navigates to snackmagic staging$")
	public void user_navigates_to_snackmagic_staging() throws Throwable {
		// SeleniumDriver.openPage("https://oldnavy.gap.com/stores/");
		SeleniumDriver.openPage("https://admin:admin@staging-frontend.snackmagic.com");
		Thread.sleep(5000);
		gmailEmailIDActions.get_country_name();
		// Thread.sleep(50000);
	}

	@Given("^user navigates to automation snackmagic$")
	public void user_navigates_to_snackmagic_automation() throws Throwable {
		SeleniumDriver.openPage("https://admin:admin@automation-frontend.snackmagic.com");
		Thread.sleep(5000);
		gmailEmailIDActions.get_country_name();
		// Thread.sleep(50000);
	}

	@Given("^user navigates to production snackmagic$")
	public void user_navigates_to_snackmagic_production() throws Throwable {
		SeleniumDriver.openPage("https://www.snackmagic.com/");
		Thread.sleep(5000);
		gmailEmailIDActions.get_country_name();
		// Thread.sleep(50000);
	}

	@Given("^user navigates to gmail$")
	public void user_navigates_to_gmail() throws Throwable {
		SeleniumDriver.openPage("https://www.minuteinbox.com/");
		//SeleniumDriver.openPage("https://mail.google.com/");
		Thread.sleep(5000);
		gmailEmailIDActions.read_email();
		Thread.sleep(5000);
		//SeleniumDriver.openPage("https://mail.google.com/");
		//Thread.sleep(5000);
		//gmailEmailIDActions.read_email_content();
		//Thread.sleep(5000);

	}

	@When("^user clicks on the Sign in google$")
	public void user_clicks_on_the_Sign_in_google() throws Throwable {

		SeleniumDriver.getDriver().manage().deleteCookieNamed("_si2_session");

		// socialImprintsLoginActions.click_on_sign_in_with_google();
	}

	@Then("^user entered username \"([^\"]*)\"$")
	public void user_entered_username(String arg1) throws Throwable {

		SeleniumDriver.getDriver().manage().addCookie(new Cookie("_si2_session",
				"WjFKWGdoenJQTFh2RUpWdjZYTSt1c09UOHRMYkRpamJRZVNmNkF5a3JkOEJhbHpqcmsycjdXMkdQRkRidm5sWmpzU2FoM1RzY2UwTHBLZU9Nc25GRW1DeGZQR04ycXRET09WSENCdDc4S2cvT1lwMTVBTlorS3R3bWY4YkxVL2EzcnBYakc0Z1JPNFY0eXVEeHNwWkYvYTdGKzgyLzh1TjB3b0JGakJYK0hQMFRQSk50ckdESE1SUXg2TEZpaE9yTHJkWnFtNWxHN3FkWmNJNFlJQWVWdz09LS1SV05kZWNsWnI1Z2hIYUwxdkdNKzBnPT0%3D--37f6368ebb1a19e2663121a8c3cbccaf55014524"));

		/*
		 * gmailEmailIDActions.enter_email_id(); gmailEmailIDActions.click_on_next();
		 */

	}

	@Then("^user entered password \"([^\"]*)\"$")
	public void user_entered_password(String arg1) throws Throwable {

		SeleniumDriver.openPage("https://vinsol:v1ns0l@staging.dev.socialimprints.com/admin/sign_in");
		/*
		 * gmailPasswordActions.enter_password(); Thread.sleep(10000);
		 * gmailPasswordActions.click_on_submit(); Thread.sleep(100000);
		 */

	}

	@Then("^user logged successfully$")
	public void user_logged_successfully() throws Throwable {
		// Thread.sleep(10000);
		String actualtitle = SeleniumDriver.getDriver().getTitle();
		// String actualtitle =
		// SeleniumDriver.getDriver().findElement(By.xpath("/html/body/div[7]/div[20]/div/article/div/div/span[1]")).getText();
		Assert.assertEquals("Social Imprints", actualtitle);

		// Test cases will executed when i pushed my code to github. Through Github
		// actions.

	}

}
