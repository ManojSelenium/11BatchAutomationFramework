package com.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.dao.BeanFactory;
import com.automation.dao.CreateUserBean;
import com.automation.pages.CreateAccountPage;
import com.automation.pages.LandingPage;
import com.automation.pages.LoginPage;
import com.automation.util.TestBase;

public class S123_Create_Account_Test extends TestBase{


	LandingPage landingpage;
	LoginPage loginPage;
	CreateAccountPage createAccountPage;
	//String sBrowser="firefox";
	
	@Parameters("sBrowser")
	@BeforeMethod
	public void setUp(String sBrowser) {

		driver=intilizeBrowser(sBrowser);
		System.out.println("Driver From Test Case "+driver);
		enterURL(AUTOMATION_URL);
		landingpage=new LandingPage(driver);
		loginPage=new LoginPage(driver);
		createAccountPage=new CreateAccountPage(driver);
	}


	@Test
	public void createAccountTest() {
		CreateUserBean bean=new CreateUserBean();
		BeanFactory factory=new BeanFactory();
		factory.creatNewUser(bean);
		landingpage.clickSignIn();
		loginPage.enterEmailAddress(bean);
		loginPage.clickCreateAccountButton();
		createAccountPage.createNewUser(bean);
		createAccountPage.clickRegister();
	}
	
	@Test(description="Verify Alias Warning Message")
	public void createAccountTest2() {
		CreateUserBean bean=new CreateUserBean();
		BeanFactory factory=new BeanFactory();
		factory.creatNewUser(bean);
		landingpage.clickSignIn();
		loginPage.enterEmailAddress(bean);
		loginPage.clickCreateAccountButton();
		bean.setAlias("");
		createAccountPage.createNewUser(bean);
		createAccountPage.clickRegister();
		String actualWarningMessage=createAccountPage.getWarningMessage();
		System.out.println("Actual Message "+actualWarningMessage);
		String expectedWarningMessage="There is 1 error:alias is required.";
		System.out.println("Expected  Message "+expectedWarningMessage);
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage.replace(":", "\n"));
	}
	@Test(description="Verify Alias Warning Message")
	public void createAccountTest3() {
		CreateUserBean bean=new CreateUserBean();
		BeanFactory factory=new BeanFactory();
		factory.creatNewUser(bean);
		landingpage.clickSignIn();
		loginPage.enterEmailAddress(bean);
		loginPage.clickCreateAccountButton();
		bean.setPhoneNumber("");
		createAccountPage.createNewUser(bean);
		createAccountPage.clickRegister();
		
		System.out.println(" *** "+createAccountPage.getWarningMessage());
	}


}
