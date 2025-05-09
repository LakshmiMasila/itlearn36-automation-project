package com.masila.pages;

 
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.masila.utility.BrowserFactory;
import com.masila.utility.ConfigDataProvider;

public class BaseTest {
	
	
	public WebDriver driver;
	public ConfigDataProvider config = new ConfigDataProvider();  
	
	@BeforeClass
	public void setUp()
	{
		driver=BrowserFactory.startApplication(driver,config.getBrowser(),config.getStagingUrl());	 
	}
	
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
 

}
