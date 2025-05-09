package com.masila.utility;

			
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.edge.EdgeDriver;

	public class BrowserFactory {
		public static WebDriver startApplication(WebDriver driver,String browserName,String appUrl)
		{
			 
			System.out.println("Browser from config: " + browserName); 
			if(browserName.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				ChromeOptions op = new ChromeOptions();
				op.addArguments("--remote-allow-origins=*");
		         driver = new ChromeDriver(op);
			}
			else if (browserName.equalsIgnoreCase("Edge"))
			{
			    System.setProperty("webdriver.edge.driver", "./Drivers/edgedriver.exe");
			    driver = new EdgeDriver();
			}
			/*else if(browserName.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		         driver = new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
		         driver = new InternetExplorerDriver();
			}*/
			
			else  
			{
				System.out.println("We do not support this browser ");
				return null;
			}

			
			driver.manage().window().maximize();
			driver.get(appUrl);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 
			return driver;
			
		}
		
		public static void quitBrowser(WebDriver driver)
		{
			driver.quit();
		}
	
}
