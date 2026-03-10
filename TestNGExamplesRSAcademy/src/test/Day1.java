package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	@Test
	public void demo() {
		System.out.println("hello");
	}
	
	@Test
	public void secondTest() {
		System.out.println("bye");
	}
	
	@AfterTest
	public void lastExecution() {
		System.out.println("I will execute last");
	}
	
	@AfterSuite
	public void aFSuite() {
		System.out.println("im number 1 from last");
	}
}
