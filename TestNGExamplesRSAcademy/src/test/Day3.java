package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeMethod
	public void forEvery() {
		System.out.println("I will execute before every method for onlu Day3 since @BeforeTest"
				+ "scope is only for class 3 not like @Test which depends on testng.xml scope");
	}
	
	@AfterMethod
	public void afterEvery() {
		System.out.println("I will execute after every method");
	}
	@Test
	public void webLoginCarLoan() {
		//selenium
		System.out.println("From webLoginCarLoan");
	}
	
	@Parameters({"URL"})
	@Test
	public void mobileLoginCarLoan(String uRLName) {
		//appium
		System.out.println("from mobileLoginCarLoan");
		System.out.println("Value pulled from XML parameter : "+uRLName);
	}
	
	@Test(groups={"Smoke"})
	public void mobileSignupCarLoan() {
		//appium
		System.out.println("from mobileSignupCarLoan");
	}
	
	@Test
	public void mobilesignoutCarLoan() {
		//appium
		System.out.println("from mobileSignoutCarLoan");
	}
	
	@Test
	public void apiLoginCarLoan() {
		//rest api
		System.out.println("apiLoginCarLoan");
	}
	
	@BeforeSuite
	public void bFSuite() {
		System.out.println("Im number 1");
	}

}
