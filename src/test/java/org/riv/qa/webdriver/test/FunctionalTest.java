package org.riv.qa.webdriver.test;

import org.openqa.selenium.WebDriver;
import org.riv.qa.base.WebDriverBase;
import org.riv.qa.pages.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FunctionalTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		WebDriverBase base = new WebDriverBase();
		this.driver = base.getDriver("chrome");
	}
	
   @Test
   public void test1(){
	   
	  String total = new HomePage(driver)
	   .navigage_to_HomePage()
	   .enter_searchTerm("iphone x")
	   .submit_search().getResultCount();
	  
	  System.out.println("KK"+total);
	   
   }
   
   @AfterTest
   public void tearDown(){
	   
	   driver.close();
	   driver.quit();
   }

}
