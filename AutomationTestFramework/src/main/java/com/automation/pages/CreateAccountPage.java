package com.automation.pages;

import org.openqa.selenium.WebDriver;

import com.automation.dao.CreateUserBean;
import com.automation.objrepo.CreateAccountPageProperties;
import com.automation.util.WebDriverUtils;

public class CreateAccountPage extends WebDriverUtils implements CreateAccountPageProperties{

	WebDriver driver;
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterFirstName(CreateUserBean bean) {
		enterText(FIRSTNAME,bean.getFirstName());
	}
	
	public void enterLastName(CreateUserBean bean){
		enterText(LASTNAME, bean.getLastName());
	}
	public void enterPassword(CreateUserBean bean){
		enterText(PASSWORD, bean.getPassword());
	}
	public void enterAddress(CreateUserBean bean) {
		enterText(ADDRESS, bean.getAddress());
	}
	public void enterCity(CreateUserBean bean) {
		enterText(CITY, bean.getCity());
	}
	public void selectState(CreateUserBean bean) {
		selectValueFromDD(STATE, bean.getState());
	}
	
	public void enterZipCode(CreateUserBean bean) {
		enterText(ZIPCODE, bean.getZipcode());
	}
	public void selectCountry(CreateUserBean bean) {
		selectValueFromDD(COUNTRY, bean.getCountry());
	}
	public void enterMobile(CreateUserBean bean) {
		enterText(PHONENUMBER, bean.getPhoneNumber());
	}
	public void enterAlias(CreateUserBean bean) {
		enterText(ALIAS, bean.getAlias());
	}
	
	public void clickRegister() {
		click(REGISTERBUTTOn);
	}
	
	public String getWarningMessage() {
		return getText(ERRORMESSAGE);
	}
	
	public void createNewUser(CreateUserBean bean) {
		enterFirstName(bean);
		enterLastName(bean);
		enterPassword(bean);
		enterAddress(bean);
		enterCity(bean);
		selectState(bean);
		enterZipCode(bean);
		selectCountry(bean);
		enterMobile(bean);
		enterAlias(bean);
		
	}
}
