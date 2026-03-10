package test;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I execute when test cases fails..!");
		//write code to take screenshot
		System.out.println(result.getName());//this method gives the name of testcase failed
	}
	
	
	
}
