package com.tests.ecommerce;

import org.testng.annotations.Test;

import com.genericlibrary.BaseTest;
import com.utils.ExtentReportManager;
import com.utils.ScreenshotUtil;


public class FlipkartTest extends BaseTest {

	@Test( groups = { "ecommerce", "regression"})
	public void flipkartAppOpen() {
		
		
		drivers.get().get("https://www.flipkart.com");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
