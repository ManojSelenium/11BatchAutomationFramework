package com.automation.objrepo;

import org.openqa.selenium.By;

public interface CreateAccountPageProperties {

	
	By FIRSTNAME=By.id("customer_firstname");
	By LASTNAME=By.id("customer_lastname");
	By PASSWORD=By.id("passwd");
	By ADDRESS=By.id("address1");
	By CITY=By.id("city");
	By STATE=By.id("id_state");
	By ZIPCODE=By.id("postcode");
	By COUNTRY=By.id("id_country");
	By PHONENUMBER=By.id("phone_mobile");
	By ALIAS=By.id("alias");
	By REGISTERBUTTOn=By.id("submitAccount");
	
	By ERRORMESSAGE=By.xpath("//*[@class='alert alert-danger']");
}
