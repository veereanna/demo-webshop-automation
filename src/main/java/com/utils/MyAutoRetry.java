package com.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class MyAutoRetry  implements IRetryAnalyzer , ITestNGListener
{
	private static int maxRetryCount = 3 ;
	private int retryCount = 0 ;
	@Override
	public boolean retry(ITestResult result) 
	{
		if( retryCount < maxRetryCount )
		{
			retryCount++ ;
			return true;
		}
		return false;
	}
}




