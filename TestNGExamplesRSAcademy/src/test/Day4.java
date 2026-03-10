package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day4 {
	
	
	@Test(groups={"Smoke"})
	public void webLoginHomeLoan() {
		//selenium
		System.out.println("From webLoginHomeLoan");
	}
	
	@Test
	public void mobileLoginHomeLoan() {
		//appium
		System.out.println("From mobileLoginHomeLoan");
	}
	
	@Test
	public void apiLoginHomeLoan() {
		//rest api
		System.out.println("apiLoginHomeLoan");
	}

}
