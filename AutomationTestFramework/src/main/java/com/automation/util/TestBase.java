package com.automation.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase implements SetUp{

	public WebDriver driver;
	
	public WebDriver intilizeBrowser(String sBrowser) {
		if(sBrowser.equalsIgnoreCase("chrome")) {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver=new ChromeDriver();
		}else if(sBrowser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\tmp\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	
	public void enterURL(String sURL){
		driver.get(sURL);
	}
}
