package com.automation.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.LandingPage;
import com.automation.pages.LoginPage;
import com.automation.util.TestBase;

public class S234_Edit_Accout_Test extends TestBase{


	LandingPage landingpage;
	LoginPage loginPage;
	CreateAccountPage createAccountPage;
	@BeforeMethod
	public void setUp() {

		driver=intilizeBrowser("chrome");
		System.out.println("Driver From Test Case "+driver);
		enterURL(AUTOMATION_URL);
		landingpage=new LandingPage(driver);
		loginPage=new LoginPage(driver);
		createAccountPage=new CreateAccountPage(driver);
	}

	@Test
	public void editAccountTest() {
		landingpage.clickSignIn();

		//loginPage.enterEmailAddress("selenium7667@mailinator.com");
		loginPage.clickCreateAccountButton();
	//	createAccountPage.enterFirstName();
	}
}
