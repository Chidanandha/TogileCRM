package testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Base.Basetest;

public class Mails extends Basetest {
	@Test
	public void mail() throws Throwable{
		System.out.println("Click is successfull");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[4]/button")).click();// profile button
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[2]/ul/div/button")).click();//dots
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[9]/a")).click();//mail
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/section/div[1]/div/ul/a/li/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("react-select-2-input")).sendKeys("chida");
		driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-3-input")).sendKeys("anagh");
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("input")).sendKeys("Testing");
		driver.findElement(By.xpath("/html/body/section/section/div[2]/form/div[2]/div[4]/div/div[2]/div[1]/p")).sendKeys("This is for testing purpose");
		driver.findElement(By.xpath("/html/body/section/section/div[2]/form/div[1]/div[2]/button")).click();
		 Thread.sleep(3000);
			File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		      FileUtils.copyFile(screenshotFile, new File(".//screenshot/mails.png"));
		
	}

}
