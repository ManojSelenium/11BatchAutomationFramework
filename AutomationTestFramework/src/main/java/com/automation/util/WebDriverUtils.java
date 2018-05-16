package com.automation.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtils {

	WebDriver driver;
	
	public WebDriverUtils(WebDriver driver){
		this.driver=driver;
	}
	
	public void click(By prop) {
		
		driver.findElement(prop).click();
	}
	public void enterText(By prop,String testData) {
		driver.findElement(prop).clear();
		driver.findElement(prop).sendKeys(testData);
	}
	
	public String getText(By prop) {
		return driver.findElement(prop).getText();
	}
	public boolean isElementPresent(By prop) {
		return driver.findElement(prop).isDisplayed();
	}
	public void doMouseOver(By prop) {
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(prop)).perform();
	}
	
	public void selectValueFromDD(By prop,String value) {
		new Select(driver.findElement(prop)).selectByValue(value);
	}
}
