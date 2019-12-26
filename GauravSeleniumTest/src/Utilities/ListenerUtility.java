package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerUtility implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		//add screencapture code
		//log the information here
		// open database connection
		System.out.println("triggers when a test is started " + result.getMethod());		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("triggers when a test is Success " + result.getMethod());		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("triggers when a test is Failed " + result.getMethod());		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		System.out.println("triggers when a test is skipped " + result.getMethod());		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}

	
	//executed before the TestNG class and after the executipon Test NG class
	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("triggers when a class start " + context.getCurrentXmlTest());		
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("triggers when a class Finish " + context.getCurrentXmlTest());	
		
	}

}