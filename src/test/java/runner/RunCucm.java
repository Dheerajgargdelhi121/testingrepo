package runner;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.io.File;
import java.text.SimpleDateFormat;

import org.testng.annotations.BeforeClass;
import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/*@CucumberOptions(plugin = { "json:target/Runcuke/cucumber.json", "pretty", "html:target/Runcuke/cucumber.html",
		"com.cucumber.listener.ExtentCucumberFormatter" }, tags = {
				"@auto" }, features = "src/test/resources/features", glue = "steps")
*/

@CucumberOptions(plugin = { "json:target/Runcuke/cucumber.json", "pretty", "html:target/Runcuke/cucumber.html",
		"com.cucumber.listener.ExtentCucumberFormatter" }, tags = {
				"@autopack" }, features = "src/test/resources/features", glue = "steps")

public class RunCucm extends AbstractTestNGCucumberTests {

	@BeforeClass

	public static void setup() throws Exception {

		/*
		 * Properties prop=new Properties();
		 * prop.load(RunCucm.class.getClassLoader().getResourceAsStream(
		 * "MyProject.properties"));
		 * 
		 * String tag_na = prop.getProperty("tag_n");
		 */
		// Initiates the extent report and generates the output in the
		// output/Run_<unique timestamp>/report.html file by default.
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String fileName = System.getProperty("user.dir") + "\\target\\Extent_Reports\\" + strDate + ".html";
		File newFile = new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile, false);
		// static report name
		// ExtentCucumberFormatter.initiateExtentCucumberFormatter(new
		// File("F:\\cucumber-testing-master\\ExtenReports\\extentreports.html"),false);
		// Loads the extent config xml to customize on the report.
		ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));

		// User can add the system information as follows
		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Firefox");
		ExtentCucumberFormatter.addSystemInfo("Browser version", "v31.0");
		ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");

		// Also you can add system information using a hash map
		Map systemInfo = new HashMap();
		systemInfo.put("Cucumber version", "v1.2.3");
		systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
		ExtentCucumberFormatter.addSystemInfo(systemInfo);

		/*
		 * ExtentCucumberFormatter.initiateExtentCucumberFormatter();
		 * 
		 * ExtentCucumberFormatter.loadConfig(new
		 * File("src/test/resources/extent-config.xml"));
		 * ExtentCucumberFormatter.addSystemInfo("Browser name", "Firefox");
		 * ExtentCucumberFormatter.addSystemInfo("Browser version", "v88.0");
		 * ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");
		 * 
		 */
		// comment updated test

	}

}
