package testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Base.Basetest;

public class Pipeline extends Basetest{
	
	@Test
	public void addpipeline() throws Throwable {
		
		
		System.out.println("Click is successfull");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[4]/button")).click();// profile button
		driver.findElement(By.xpath("/html/body/div/div[3]/div/ul/a[2]/li/div/div[2]/span")).click();//settings button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div/ul/a[10]/li/div/div[2]")).click();//pipeline
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div/div[1]/div/div[2]/button")).click();
		driver.findElement(By.id("name")).sendKeys(" Rahul Murthy");
		driver.findElement(By.id("react-select-3-input")).sendKeys("deal");
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/section/div[3]/div/div/div[4]/div[2]/div[2]/div[3]/span")).click();
		Thread.sleep(2000);
		
		//add stage
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/div[1]/input")).sendKeys("first");
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/div[2]/input")).sendKeys("60");
		driver.findElement(By.id("description")).sendKeys("this is a lucky win of the year ");
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[3]/div/button[2]")).click();
		
		//add reason
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div/div/div[4]/div[2]/div[3]/div[3]/span")).click();
		driver.findElement(By.xpath("/html/body/section/div[3]/div/div/div[4]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/input")).sendKeys("i don't know much about this stage well");
		driver.findElement(By.xpath("/html/body/section/div[3]/div/div/div[5]/div/button[2]")).click();
		///html/body/section/div[3]/div/div/div[5]/div/button[2]
		driver.manage().window().maximize();
        Thread.sleep(3000);
		File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screenshotFile, new File(".//screenshot/pipeline.png"));
	}
	
	
	
	

}
