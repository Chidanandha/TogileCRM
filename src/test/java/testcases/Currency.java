package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Base.Basetest;

public class Currency extends Basetest{
	@Test
	public void currencies() throws Throwable {
		
		System.out.println("Click is successfull");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[4]/button")).click();// profile button
		driver.findElement(By.xpath("/html/body/div/div[3]/div/ul/a[2]/li/div/div[2]/span")).click();//settings button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div/ul/a[1]/li/div/div[2]")).click();//currency
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/div/div[3]/div/button")).click();
		driver.findElement(By.id("react-select-4-input")).sendKeys("south afric");
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);//currency value
		//driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[2]/div[1]/div/input")).click();
		driver.findElement(By.id("flexRadioDefault2")).click();
		driver.findElement(By.id("manual-value")).sendKeys("112233");
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/div/button[2]")).click();
		
	}

}
