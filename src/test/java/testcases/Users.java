package testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Base.Basetest;

public class Users extends Basetest{
	
	@Test
	public void Adduser() throws Throwable {
		
		System.out.println("Click is successfull");
	    Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys(".com");
        driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys(".com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[4]/button")).click();// profile button
        driver.findElement(By.xpath("/html/body/div/div[3]/div/ul/a[2]/li/div/div[2]/span")).click();//settings button

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div/ul/a[2]/li/div/div[2]/span")).click();//user button
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/div[1]/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("react-select-3-input")).sendKeys("mr");
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("fullName")).sendKeys("user1");
		driver.findElement(By.id("email")).sendKeys("user12@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/form/div[2]/div[2]/div[4]/div/div/input")).sendKeys("656576765566655");
		driver.findElement(By.id("react-select-4-input")).sendKeys("");
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-5-input")).sendKeys("parag bokde");
		driver.findElement(By.id("react-select-5-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("address")).sendKeys("free to be anywhere in this world");
		driver.findElement(By.id("city")).sendKeys("");
		driver.findElement(By.id("state")).sendKeys("Karnataka");
		driver.findElement(By.id("react-select-6-input")).sendKeys("india");
		driver.findElement(By.id("react-select-6-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("zipCode")).sendKeys("560068");
		driver.findElement(By.id("react-select-7-input")).sendKeys("parag");
		driver.findElement(By.id("react-select-7-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-8-input")).sendKeys("human");
		driver.findElement(By.id("react-select-8-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("college")).sendKeys("IFIM COLLEGE");
		driver.findElement(By.id("language")).sendKeys("Kannada");
		driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/form/div[3]/div/button[2]")).click();
		System.out.println("user is added is successfull");
		
		driver.manage().window().maximize();
        Thread.sleep(1000);
		File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screenshotFile, new File(".//screenshot/user.png"));
		
		//filter
//		Thread.sleep(3000);
//		   driver.findElement(By.cssSelector("body > section > div.style_defaultPageContainer__OIjPd > div.main-tab-content > div.filter-area.mt-1 > div > div:nth-child(2) > svg > path")).click();
//	       driver.findElement(By.id("react-select-2-input")).sendKeys("mail");
//	       driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
//	       driver.findElement(By.id("react-select-3-input")).sendKeys("contains");
//	       driver.findElement(By.id("react-select-3-input")).sendKeys("r");
//	       driver.findElement(By.xpath("/html/body/div/div[3]/div/div[4]/button[2]")).click();
//	       Thread.sleep(3000);
//	        
	    //filter ends
		
		
	}
	
 

}
