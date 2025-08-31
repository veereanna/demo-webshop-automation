package com.utils;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener, ISuiteListener 
{

	@Override
	public void onStart(ISuite suite) 
	{
		ExtentReportManager.createExtentReport();
	}
	
	@Override
	public void onTestStart(ITestResult result)
	{
		ExtentReportManager.createTest( result.getName() );
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		ExtentReportManager.pass(result.getName() + " Test Passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		ExtentReportManager.fail( result.getThrowable().toString() );
		String path = ScreenshotUtil.takeScreenshot("flipkartAppOpen");
		ExtentReportManager.addScreenshot(path);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		ExtentReportManager.skip( result.getName()+ " Test Skipped");
	}
	
	@Override
	public void onFinish(ISuite suite)
	{
		ExtentReportManager.publishReport();
	}

}






