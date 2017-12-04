package org.riv.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.riv.qa.base.CommonUtil;


public class HomePage extends CommonUtil{
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		
		this.driver = driver;
	}
	
	public HomePage navigage_to_HomePage()
	{
		driver.get("https://www.amazon.in/");
		wait_expectedConditions(driver, ".//*[@id='nav-search']/form/div[2]/div/input", 10);	
		
		return this;
	}
	
	public HomePage enter_searchTerm(String searchTerm)
	{
		wait_expectedConditions(driver, ".//*[@id='twotabsearchtextbox']", 10);	
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchTerm);
		
		return this;
	}
	
	public SearchResultPage submit_search(){
		
		wait_expectedConditions(driver, ".//*[@id='nav-search']/form/div[2]/div/input", 10);	
		
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		
		return new SearchResultPage(driver);
	}

	
}
