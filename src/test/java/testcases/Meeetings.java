package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Base.Basetest;

public class Meeetings extends Basetest {
	@Test
	public void meeting() throws Throwable {
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
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[8]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/div[2]/div/button")).click();
		driver.findElement(By.id("meeting_name")).sendKeys("CRM meeting");//meeting name
		driver.findElement(By.id("react-select-4-input")).sendKeys("lead");//entity type
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-5-input")).sendKeys("google");//meeting location
		driver.findElement(By.id("react-select-5-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("meeting_url")).sendKeys("www.googlemeet.com");
		driver.findElement(By.id("react-select-6-input")).sendKeys("decision");//meeting type
		driver.findElement(By.id("react-select-6-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-7-input")).sendKeys("test1@gmail.com");//invites
		driver.findElement(By.id("react-select-7-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[1]/div[7]/div[1]/div/div/button")).click();//calendar
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[3]/div/div[2]/button[30]")).click();//pic date
		driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[1]/div[7]/div[2]/div/input")).click();//click clock
		driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[1]/div[7]/div[2]/div/input")).sendKeys("1245pm");
		driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[1]/div[7]/div[3]/div/input")).click();//click clock
		driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[1]/div[7]/div[3]/div/input")).sendKeys("235pm");
		Thread.sleep(1000);
		driver.findElement(By.id("react-select-8-input")).sendKeys("kolkata");//time zone
		driver.findElement(By.id("react-select-8-input")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id("react-select-9-input")).sendKeys("scheduled");//status
		driver.findElement(By.id("react-select-9-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-10-input")).sendKeys("aaron");//associated lead
		Thread.sleep(3000);
		driver.findElement(By.id("react-select-10-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.name("meeting_description")).sendKeys("This is for testing the crm");
		driver.findElement(By.xpath("/html/body/div/div[3]/div/form/div[2]/button[2]")).click();
	}

}
