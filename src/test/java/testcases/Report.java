package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.Basetest;

public class Report extends Basetest  {
	@Test
	
	public void Dreports() throws Throwable {
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testparag1@gmail.com");
	    driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[2]/ul/li[6]")).click();
		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div[1]/div/div[2]/button")).click();
	}
	

}
 