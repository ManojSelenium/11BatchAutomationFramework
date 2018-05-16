package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.dao.CreateUserBean;
import com.automation.objrepo.LoginPageProperties;
import com.automation.util.WebDriverUtils;

public class LoginPage extends WebDriverUtils implements LoginPageProperties{

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void clickCreateAccountButton() {
		click(CREATEACCOUNTBUTTOn);
	}
	public void clickForgotPasswordButton() {
		System.out.println("Forgot Password Button Clicked");
	}
	
	public void enterEmailAddress(CreateUserBean bean){
	enterText(EMAIlADDRESSLOCATOR,bean.getEmailAddress());
	}
}
