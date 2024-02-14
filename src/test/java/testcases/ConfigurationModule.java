package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Base.Basetest;

public class ConfigurationModule extends Basetest {
	@Test
	public void configmodule() throws Throwable {
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testshivaji1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testshivaji1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[4]/button")).click();// profile button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/ul/a[2]/li/div/div[2]/span")).click();//settings button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div/ul/a[7]/li/div/div[2]")).click();//configuration
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div/button[1]")).click();//module
		driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/div/div[2]/div/button[1]")).click();//leads
		driver.findElement(By.xpath("/html/body/section/div[3]/div[3]/div/div[1]/div/div/button")).click();//edit
		driver.findElement(By.id("displayName")).clear();
		driver.findElement(By.id("displayName")).sendKeys("parag bokde");
		driver.findElement(By.id("displayPluralName")).clear();
		driver.findElement(By.id("displayPluralName")).sendKeys("Hero");
		driver.findElement(By.id("react-select-3-input")).sendKeys("email & phone");
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("masked")).click();
		driver.findElement(By.id("react-select-4-input")).sendKeys("super");
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[3]/div/form/div[7]/div/div/button[2]")).click();
		
		Thread.sleep(2000);
		//contacts
		driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/div/div[2]/div/button[2]")).click();//contacts
		driver.findElement(By.xpath("/html/body/section/div[3]/div[4]/div/div[1]/div/div/button")).click();//edit
		driver.findElement(By.id("displayName")).clear();
		driver.findElement(By.id("displayName")).sendKeys("manish");
		driver.findElement(By.id("displayPluralName")).clear();
		driver.findElement(By.id("displayPluralName")).sendKeys("pandey");
		driver.findElement(By.id("react-select-3-input")).sendKeys("email");
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("masked")).click();
		driver.findElement(By.id("react-select-2-input")).sendKeys("super");
		driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[4]/div/form/div[7]/div/div/button[2]")).click();
	}

}
