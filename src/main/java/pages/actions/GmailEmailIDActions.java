package pages.actions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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

	public void read_email() throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
		js.executeScript("arguments[0].click();", SeleniumDriver.getDriver().findElement(By.xpath("//*//a[@data-target='#emailForm']")));
		//SeleniumDriver.getDriver().findElement(By.xpath("//*//a[@data-target='#emailForm']")).click();
		Thread.sleep(5000);

		js.executeScript("document.getElementById('emailInputModal').setAttribute('value','snackmagictest')");
		SeleniumDriver.getDriver().findElement(By.id("emailInputModal")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		SeleniumDriver.getDriver().findElement(By.id("emailFormBtn")).click();
		Thread.sleep(5000);

		String email_id = SeleniumDriver.getDriver().findElement(By.id("email")).getText();
		System.out.println(email_id);
		Thread.sleep(5000);

		// JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();

		// js.executeScript("window.open()");

		// ArrayList<String> tabs = new
		// ArrayList<String>(SeleniumDriver.getDriver().getWindowHandles());
		// SeleniumDriver.getDriver().switchTo().window(tabs.get(1));
		// SeleniumDriver.getDriver().get("https://www.snackmagic.com/");
		// Thread.sleep(5000);
		// SeleniumDriver.getDriver().findElement(By.xpath("//*//button[text()='Log
		// In']")).click();
		// Thread.sleep(5000);
		// SeleniumDriver.getDriver().findElement(By.xpath("//*//a[text()='Reset
		// Password']")).click();
		// Thread.sleep(5000);
		// SeleniumDriver.getDriver().findElement(By.name("email")).sendKeys("snackmagictest@moabuild.com");
		// Thread.sleep(5000);
		// SeleniumDriver.getDriver().findElement(By.xpath("//*//button[contains(text(),'Reset
		// Password')]")).click();
		// Thread.sleep(5000);
		// SeleniumDriver.getDriver().switchTo().window(tabs.get(0));
		//Thread.sleep(5000);
		
		js.executeScript("arguments[0].click();", SeleniumDriver.getDriver().findElement(By.xpath("//*//div/a[text()='Delete']")));
		//SeleniumDriver.getDriver().findElement(By.xpath("//*//div/a[text()='Delete']")).click();
		Thread.sleep(10000);

		// SeleniumDriver.getDriver().findElement(By.xpath("//*//td[contains(text(),'Welcome
		// to MinuteInbox')]")).click();
		// Thread.sleep(5000);

		// WebElement iframe =
		// SeleniumDriver.getDriver().findElement(By.id("iframeMail"));
		// SeleniumDriver.getDriver().switchTo().frame(iframe);
		// Thread.sleep(5000);

		// String message =
		// SeleniumDriver.getDriver().findElement(By.xpath("//*//span[contains(text(),'MinuteInbox
		// provides 10-minute mail address to protect')]")).getText();
		// Thread.sleep(5000);

		// System.out.println(message);

		// SeleniumDriver.getDriver().findElement(By.xpath("//*//a[@alt='Sign
		// in']")).click();
		// Thread.sleep(5000);
		// SeleniumDriver.getDriver().findElement(By.name("username")).sendKeys("snackmagictest@yahoo.com");
		// Thread.sleep(5000);
		// SeleniumDriver.getDriver().findElement(By.id("login-signin")).click();
		// Thread.sleep(5000);

		// SeleniumDriver.getDriver().findElement(By.name("identifier")).sendKeys("snackmagictest@gmail.com");
		// Thread.sleep(5000);
		// SeleniumDriver.getDriver().findElement(By.id("identifierNext")).click();
		// Thread.sleep(5000);
		// SeleniumDriver.getDriver().findElement(By.name("password")).sendKeys("password");
		// Thread.sleep(5000);
		// SeleniumDriver.getDriver().findElement(By.id("passwordNext")).click();
		// Thread.sleep(5000);

	}

	public void read_email_content() throws Exception {
		String sender = SeleniumDriver.getDriver().findElement(By.cssSelector("#sender")).getText();
		Thread.sleep(5000);
		String subject = SeleniumDriver.getDriver().findElement(By.cssSelector("#subject")).getText();
		Thread.sleep(5000);
		String body = SeleniumDriver.getDriver().findElement(By.cssSelector("#body")).getText();
		Thread.sleep(5000);

		System.out.println("Sender: " + sender);
		System.out.println("Subject: " + subject);
		System.out.println("Body: " + body);
	}

}
