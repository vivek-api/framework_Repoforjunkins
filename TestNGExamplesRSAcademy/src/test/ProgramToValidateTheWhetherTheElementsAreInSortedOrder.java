package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProgramToValidateTheWhetherTheElementsAreInSortedOrder {
	
	@Test() 
	public void validateVeg() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@class='lNPl8b']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='kV1UjG']")).click();
		
	}

}
