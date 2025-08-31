package com.genericlibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	public static  ThreadLocal<WebDriver> drivers = new ThreadLocal<WebDriver>();
	
	@Parameters({"browser"})
	@BeforeMethod( alwaysRun = true)
	public void launchBrowser(@Optional("Edge") String browser) {
		
		WebDriver driver = null ;
		if( browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if( browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver() ;
		}
		else if( browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver() ;
		}
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.manage().window().maximize();
		drivers.set(driver);
		
	}
	
	@AfterMethod( alwaysRun = true)
	public void closeBrowser() {
		if (drivers.get() != null) {
            drivers.get().quit();
            drivers.remove();
        }
	}

}

