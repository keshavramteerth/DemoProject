package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngLoggingDemo {
	@Test
    public void testReport()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\BrowserDrivers\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        
        
        
        Reporter.log("Browser Opened",true);
        
        driver.manage().window().maximize();
        
        Reporter.log("Browser Maximized",true);
        
        driver.get("http://www.google.com");
        
        Reporter.log("Application started",true);
        
        driver.quit();
        
        Reporter.log("Application closed",true);
        
    }

}
