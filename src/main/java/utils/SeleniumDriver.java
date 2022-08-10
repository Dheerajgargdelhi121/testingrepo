package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;

	private static WebDriver driver;

	private static WebDriverWait waitDriver;

	private final static int TIMEOUT = 30;
	private final static int PAGE_LOAD_TIMEOUT = 50;

	private SeleniumDriver() {

		// Updated comment just to trigger build automatically when i merge my changes
		// to github...
		// Proxy proxy = new Proxy();
		// proxy.setHttpProxy("198.59.191.234:8080");
		// String PROXY = "198.59.191.234:8080";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		// options.addArguments("--proxy-server=198.59.191.234:8080");
		// options.addArguments("--proxy-server=%s", PROXY);
		// options.setCapability("proxy", proxy);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		//driver = new ChromeDriver();

		Map<String, Object> coordinatesMap = new HashMap<String, Object>();
		coordinatesMap.put("latitude", 34.052235);
		coordinatesMap.put("longitude", -118.243683);
		coordinatesMap.put("accuracy", 1);

		((ChromeDriver) driver).executeCdpCommand("Emulation.setGeolocationOverride", coordinatesMap);
		// WebDriverManager.firefoxdriver().setup();
		// driver = new FirefoxDriver();

		driver.manage().window().maximize();

		waitDriver = new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		String window = driver.getWindowHandle();
		System.out.println("Window ->" + window);
	}

	public static void openPage(String url) {
		System.out.println(url);
		System.out.println(driver);
		driver.get(url);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUpDriver() {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}
	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}
}
