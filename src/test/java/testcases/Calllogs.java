package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.Basetest;

public class Calllogs extends Basetest{
@Test
public void callslogs() throws Throwable{
	
	System.out.println("Click is successfull");
	Thread.sleep(3000);
	driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testparag1@gmail.com");
	driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testparag1@gmail.com");
	driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
	System.out.println("login is successfully done");
	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[4]/button")).click();// profile button
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[2]/ul/div/button")).click();
	driver.findElement(By.xpath("/html/body/div/div[3]/div/div[7]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/div[2]/div/button")).click();
	driver.findElement(By.id("react-select-3-input")).sendKeys("lead");
	driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.id("react-select-6-input")).sendKeys("parag");
	driver.findElement(By.id("react-select-6-input")).sendKeys(Keys.ENTER);
	driver.findElement(By.id("react-select-4-input")).sendKeys("connected");
	driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
	driver.findElement(By.id("react-select-5-input")).sendKeys("incoming");
	driver.findElement(By.id("react-select-5-input")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[6]/div[1]/div/div/button")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[3]/div/div[2]/button[31]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[6]/div[2]/div/input")).sendKeys("1245pm");
	Thread.sleep(1000);
	WebElement uploadfile=driver.findElement(By.id("recordingFile"));
	uploadfile.sendKeys("C:\\Users\\HP\\Downloads\\audio1.mp3");
	driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[10]/div/div/textarea")).sendKeys("This is a testing audio");

	driver.findElement(By.xpath("/html/body/div/div[3]/form/div[3]/button[2]")).click();
}
}
