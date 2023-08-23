package parallel_package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class load_multiple {

	@Test(invocationCount = 20, threadPoolSize = 20)

	public void setup() throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.bystadium.com/in/en/stores/recognition-store/S012512972?preview=true");
		Thread.sleep(8000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		System.out.println("Hello");
		driver.close();
		driver.quit();
	}

}
