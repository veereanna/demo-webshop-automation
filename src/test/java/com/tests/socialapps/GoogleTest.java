package com.tests.socialapps;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericlibrary.BaseTest;


public class GoogleTest extends BaseTest{

	@Test( groups = { "socialapps","smoke" , "regression"})
	public void googleOpen() {
		
		drivers.get().get("https://www.google.com");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Assert.assertTrue(false, "Failed intentionally");
		
	}

}
