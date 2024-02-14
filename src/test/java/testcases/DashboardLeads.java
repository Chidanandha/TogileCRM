package testcases;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Base.Basetest;

public class DashboardLeads extends Basetest{
	@Test
	public void leadsadd() throws Throwable {
    	System.out.println("Click is successfull");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[2]/ul/li[1]")).click();//leads  
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div[1]/button[1]")).click();//addleads
		driver.findElement(By.id("react-select-3-input")).sendKeys("mr");//salutaion
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[3]/input")).sendKeys("Rahul new lead");//name
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[4]/div[2]/div/input")).sendKeys("rahul1@gmai.com");//email
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[5]/div[2]/div/input")).sendKeys("75757578877866");//phone
		driver.findElement(By.id("react-select-5-input")).sendKeys("pipeline");
		driver.findElement(By.id("react-select-5-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-6-input")).sendKeys("open");
		driver.findElement(By.id("react-select-6-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-7-input")).sendKeys("parag");
		driver.findElement(By.id("react-select-7-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-8-input")).sendKeys("facebook");
		driver.findElement(By.id("react-select-8-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[10]/input")).sendKeys("web1@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/button[2]")).click();
		
		
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[1]/div/div[1]/div[2]/div/div/input")).sendKeys("Mr");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[1]/div/div[1]/div[3]/div/div/input")).sendKeys("Harsha");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[1]/div/div[1]/div[4]/div/div/input")).sendKeys("Kannur");
//		driver.findElement(By.id("react-select-3-input")).sendKeys("a");
//		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
//		driver.findElement(By.id("react-select-4-input")).sendKeys("mani");
//		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[1]/div/div[2]/div[2]/div/div/input")).sendKeys("9876543210");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[1]/div/div[2]/div[3]/div/div/input")).sendKeys("anaghbhaskar99@gmail.com");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[1]/div/div[2]/div[4]/div/div/input")).sendKeys("12hours");
		
		//driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[2]/button[2]")).click();//save and continue button
		//driver.manage().window().maximize();
//        Thread.sleep(3000);
//		File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	      FileUtils.copyFile(screenshotFile, new File(".//screenshot/dashleads.png"));
	}}
