package com.automation.dao;

import org.apache.commons.lang3.RandomStringUtils;

public class BeanFactory {

	
	public void creatNewUser(CreateUserBean bean) {
		
		bean.setFirstName(RandomStringUtils.randomAlphabetic(5));
		bean.setLastName(RandomStringUtils.randomAlphabetic(5));
		bean.setEmailAddress(RandomStringUtils.randomAlphabetic(5)+"@mailinator.com");
		bean.setCity(RandomStringUtils.randomAlphabetic(5));
		bean.setState("5");
		bean.setPassword("Password");
		bean.setPhoneNumber("2343242323");
		bean.setAddress(RandomStringUtils.randomAlphabetic(5));
		bean.setCountry("21");
		bean.setAlias(RandomStringUtils.randomAlphabetic(5));
		bean.setZipcode("12345");
	}
}
