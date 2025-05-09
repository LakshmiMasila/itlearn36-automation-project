package com.masila.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.masila.pages.BaseTest;
import com.masila.utility.BrowserFactory;
import com.masila.utility.ConfigDataProvider;

public class TestCaseDemo extends BaseTest {

    @Test
    public void Testcheck() throws InterruptedException {
        
        Assert.assertNotNull(driver, "Driver was not initialized. Check browser name and driver setup.");
        // Print title for visual confirmation
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);

        // Wait 5 seconds so you can see the browser before it closes
        Thread.sleep(5000);

        Assert.assertTrue(pageTitle.contains("ITLearn360")); // adjust for your app title
        BrowserFactory.quitBrowser(driver);
    }
}




//package com.masila.testcases;
/*
import org.testng.annotations.Test;

import com.masila.pages.BaseTest;

  public class TestCaseDemo extends BaseTest {
	@Test
	void Testcheck()
	{
		BaseTest obj= new BaseTest();
		
	}*/
		 

 