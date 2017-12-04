package org.riv.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.internal.NewProfileExtensionConnection;
import org.riv.qa.base.CommonUtil;
import org.riv.qa.models.Product;

public class SearchResultPage extends CommonUtil{
	
	WebDriver driver;
	
	public SearchResultPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	public void addSearchResultsToCache(){
		
		
	}
	
	public SearchResultPage navigateToNextPage(){
		
		driver.findElement(By.xpath(""));
		
		return this;	
	}
	
	public String getResultCount(){
		
		
		// driver.switchTo().frame(0);
		
		//driver.switchTo().defaultContent();
		
		String[] out = driver.findElement(By.xpath("(.//*[@id='atfResults']//li[@id='result_1'])[1]")).getText().split("\n");
		
		
		 System.out.println(out[1]);
	     System.out.println(out[3]);
	     
	     
		wait_expectedConditions(driver, ".//*[@id='result_3']", 10);
		
		for(int i=0;i< 30;i++){
			
			Product objProd = new Product();
			
			objProd.setName(driver.findElement(By.xpath(".//*[@id='atfResults']//li[@id='result_"+i+"']")).getText());
		 //   objProd.setPrice( Double.parseDouble(driver.findElement(By.xpath(".//*[@id='atfResults']//li[@id='result_"+i+"']//span")).getText()));
		    objProd.setLinkToProduct(driver.findElement(By.xpath(".//*[@id='atfResults']//li[@id='result_"+i+"']")).getText());
		
		    System.out.println(objProd.getName());
		}
		
		return driver.findElement(By.xpath(".//*[@id='result_0']/div/div[3]/div[1]")).getText();	
	}
	
	
	

}
