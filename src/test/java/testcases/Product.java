 package testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Base.Basetest;

public class Product extends Basetest  {
	@Test
	public void addproduct() throws Throwable {

		System.out.println("Click is successfull");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[4]")).click();// profile button 
		driver.findElement(By.xpath("/html/body/div/div[3]/div/ul/a[2]/li/div/div[2]")).click();//settings button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div/ul/a[4]/li/div/div[2]")).click();//product
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/button")).click();		//addproduct 
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/input")).sendKeys("product active");
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[2]/input")).sendKeys("1000");
		Thread.sleep(2000);
		driver.findElement(By.id("react-select-3-input")).sendKeys("service");
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);		
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[4]/input")).sendKeys("46");
		driver.findElement(By.id("desc")).sendKeys("this is testing i'm very tired");
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[7]/div/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/div/button[2]")).click();

//		driver.manage().window().maximize();
//        Thread.sleep(3000);
//		File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	      FileUtils.copyFile(screenshotFile, new File(".//screenshot/product.png"));
//		
		//serach button working
		// driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div[1]")).click();
		//driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div[1]/div/input")).click();
		//	driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div[1]/div/input")).sendKeys("pro");
		//search ends

		//driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/button")).click();

//		//filter
//		driver.findElement(By.cssSelector(".css-sv9f3i > path")).click();
//		driver.findElement(By.id("react-select-2-input")).sendKeys("name");
//		driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
//		//OR
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[2]/div[1]")).click();
//		//AND
//		//driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[2]/div[2]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("react-select-3-input")).sendKeys("contains");
//		Thread.sleep(3000);
//		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/div/div/div[3]/input")).sendKeys("ais");
//		Thread.sleep(3000);

	}

}
