package org.riv.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtil {

	public WebDriverWait wait(WebDriver driver, int seconds)

	{
		WebDriverWait wait = new WebDriverWait(driver, seconds);

		return wait;
	}

	public WebDriverWait wait_expectedConditions(WebDriver driver,
			String xpath, int seconds)

	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(xpath)));
		return wait;
	}

}
