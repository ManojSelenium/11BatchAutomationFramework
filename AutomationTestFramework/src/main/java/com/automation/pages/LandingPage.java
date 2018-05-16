package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.objrepo.LandingPageProperties;
import com.automation.util.WebDriverUtils;

public class LandingPage extends WebDriverUtils implements LandingPageProperties{

	
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		System.out.println("*** "+this.driver);
		this.driver=driver;
		System.out.println("*** "+this.driver);
	}

	public void clickSignIn() {
		System.out.println("Landing Page Driver "+driver);
		click(SIGNINLOCATOR);
	}

	public void clickContactUS() {
		click(CONTACTUSLOCATOR);
	}
}
