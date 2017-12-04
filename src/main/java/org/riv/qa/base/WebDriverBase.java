package org.riv.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBase {
	
WebDriver driver;

public WebDriver getDriver(String driverType)

{
	
	if(driverType.equals("chrome"))	
	{
		
	System.setProperty("webdriver.chrome.driver", "C://eagle//chrome2//chromedriver.exe");
	driver = new ChromeDriver();
	
	}
	
	else if(driverType.equals("firefox"))
	driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	return driver;
}

}
