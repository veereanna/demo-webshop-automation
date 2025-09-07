package com.tests.food;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericlibrary.BaseTest;


public class ZomatoTest extends BaseTest {
	
	@Test( groups = {"food", "regression"})
	public void zomatoAppOpen() {
		
		
		drivers.get().get("https://www.zomato.com");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
