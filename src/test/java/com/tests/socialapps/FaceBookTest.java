package com.tests.socialapps;

import org.testng.annotations.Test;

import com.genericlibrary.BaseTest;

public class FaceBookTest extends BaseTest
{
	@Test( groups = { "socialapps","regression"})
	public void facebookAppOpen() 
	{
		drivers.get().get("https://www.facebook.com");
		
		try {
			Thread.sleep(1000) ;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
