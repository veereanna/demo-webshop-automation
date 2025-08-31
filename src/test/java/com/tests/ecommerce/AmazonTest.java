package com.tests.ecommerce;

import org.testng.annotations.Test;

import com.genericlibrary.BaseTest;
import com.utils.ExtentReportManager;

public class AmazonTest extends BaseTest {

	
	@Test( groups = { "ecommerce", "smoke" , "regression"}  )
	public void amazonAppOpen( ) 
	{	
		

		
//		Step-03 :: Log details in the Test
		ExtentReportManager.info("browser launched");
		
		drivers.get().get("https://www.Amazon.com");
		ExtentReportManager.info("Amazon app opened");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ExtentReportManager.info("Waited for 1 sec");
		
		
		
		

		
	}

}



