package com.tests.food;

import org.testng.annotations.Test;

import com.genericlibrary.BaseTest;

public class BBQNationTest extends BaseTest {

	@Test( groups = { "food","regression"})
	public void bbqAppOpen() {
		
		drivers.get().get("https://www.barbequenation.com/");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
