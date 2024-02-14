package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Base.Basetest;

public class Taxes extends Basetest{
	@Test
	public void Dtaxes() throws Throwable {
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[4]")).click();// profile button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/ul/a[2]/li/div/div[2]/span")).click();//settings button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div/button[3]")).click();//taxes
		driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/div[1]/div/button")).click();
		driver.findElement(By.id("name")).sendKeys("super");
		driver.findElement(By.id("price")).sendKeys("987");
		driver.findElement(By.id("react-select-2-input")).sendKeys("iceland");
		driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/div/button[2]")).click();
		
	}

}
