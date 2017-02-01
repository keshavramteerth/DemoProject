package pack1;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4jLoggingDemo {

	public static void main(String[] args) 
	{
		WebDriver driver;
		// Provide Log4j configuration settings

		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("TestCaseName");
		System.setProperty("webdriver.gecko.driver", "F:\\BrowserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		Log.info("Browser Launched");
		
		driver.get("http://www.google.com");
		Log.info("URL Launched in Browser");
		Log.endTestCase("TestCaseName");

	}

}
