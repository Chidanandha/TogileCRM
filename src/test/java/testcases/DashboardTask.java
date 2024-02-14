package testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Base.Basetest;

public class DashboardTask extends Basetest{
	@Test
	public void taskadd() throws Throwable {
		
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[2]/ul/li[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/div[2]/div/button")).click();
		driver.findElement(By.id("task_name")).sendKeys("Dashboard testing");
		driver.findElement(By.id("react-select-4-input")).sendKeys("deal");
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id("react-select-10-input")).sendKeys("anagh");
		Thread.sleep(2000);
		driver.findElement(By.id("react-select-10-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-5-input")).sendKeys("call");
		driver.findElement(By.id("react-select-5-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-6-input")).sendKeys("parag");
		driver.findElement(By.id("react-select-6-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-7-input")).sendKeys("open");
		driver.findElement(By.id("react-select-7-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-8-input")).sendKeys("low");
		driver.findElement(By.id("react-select-8-input")).sendKeys(Keys.ENTER);	
		driver.findElement(By.id("react-select-9-input")).sendKeys("no");
	driver.findElement(By.id("react-select-9-input")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[1]/div[8]/div[2]/div/input")).sendKeys("1230pm");
	driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[1]/div[8]/div[1]/div/div/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[3]/div/div[2]/button[32]")).click();
		driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[1]/div[9]/div/div/textarea")).sendKeys("Please work on this date section");
		driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[2]/button[2]")).click();
		//driver.manage().window().maximize();
//       Thread.sleep(2000);
//	File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	      FileUtils.copyFile(screenshotFile, new File(".//screenshot/dashtask.png"));

	}

}
