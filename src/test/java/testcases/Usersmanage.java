package testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Base.Basetest;

public class Usersmanage extends Basetest{
	@Test(priority = 1)

	public void manageteam() throws Throwable {

		System.out.println("Click is successfull");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testchidhu1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testchidhu1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[4]/button")).click();// profile button
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/ul/a[2]/li/div/div[2]/span")).click();//settings button
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div/ul/a[2]/li/div/div[2]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/div[1]/div/button")).click();  
		driver.findElement(By.id("name")).sendKeys("team1");
		driver.findElement(By.id("react-select-2-input")).sendKeys("manish");
		driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("description")).sendKeys("This team is very good enjoy");
		
		driver.findElement(By.xpath("/html/body/section/div[3]/form/div[3]/div/button[2]")).click();
		Thread.sleep(1000);
		//		driver.manage().window().maximize();
		//		Thread.sleep(3000);
		//		File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//		FileUtils.copyFile(screenshotFile, new File(".//screenshot/manageteam.png"));
	}

	//filter 

	//	    driver.findElement(By.cssSelector("body > section > div.style_defaultPageContainer__OIjPd > div.main-tab-content > div.filter-area.mt-1 > div > svg > path")).click();
	//		driver.findElement(By.xpath("//*[contains(@id, 'react-select-') and contains(@id, '-input')]")).sendKeys("name");
	//		driver.findElement(By.xpath("//*[contains(@id, 'react-select-') and contains(@id, '-input')]")).sendKeys(Keys.ENTER);
	//		driver.findElement(By.xpath("//*[contains(@id, 'react-select-') and contains(@id, '-input')]")).sendKeys("contains");
	//		driver.findElement(By.xpath("//*[contains(@id, 'react-select-') and contains(@id, '-input')]")).sendKeys(Keys.ENTER);
	//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/div/div/div[3]/input")).sendKeys("a");
	//		
	//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[4]/button[2]")).click();	
	//filter ends

//
	@Test(priority = 2)
	public void managerole() throws Throwable {
		//manage roles 

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div/div/button[3]")).click();
		driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/div[1]/div/button")).click();
		driver.findElement(By.id("roleName")).sendKeys("role1");
		driver.findElement(By.id("description")).sendKeys("Testing all the basic and critical features with a positive credentials of the software is smoke testing");
		driver.findElement(By.xpath("/html/body/section/div[3]/div[3]/div/button[2]")).click();
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		//		File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		//		FileUtils.copyFile(screenshotFile, new File(".//screenshot/managerole.png"));
}
//
	@Test(priority = 3)
public void userlog() throws Throwable{
		//user logs
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div/div/button[4]")).click();
		//driver.manage().window().maximize();
		Thread.sleep(3000);
//		//		File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		//		FileUtils.copyFile(screenshotFile, new File(".//screenshot/userlog.png"));
	}
	}

