package testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Base.Basetest;

public class Goals extends Basetest {
	
	@Test

	public void addgoals() throws Throwable {

		System.out.println("Click is successfull");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[4]/button")).click();// profile button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/ul/a[2]/li/div/div[2]/span")).click();//settings button
Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div/ul/a[9]/li/div/div[2]")).click();//goals
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div/div[1]/div/div/button")).click();//add goals
		driver.findElement(By.id("goal-name")).sendKeys("sales");
		driver.findElement(By.id("react-select-2-input")).sendKeys("d");
		driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-3-input")).sendKeys("user");
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		//driver.findElement(By.id("react-select-16-input")).sendKeys("");
		//driver.findElement(By.id("react-select-16-input")).sendKeys("human");
		driver.findElement(By.id("react-select-5-input")).sendKeys("daily");
		driver.findElement(By.id("react-select-5-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-6-input")).sendKeys("Number");
		driver.findElement(By.id("react-select-6-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-7-input")).sendKeys("estimated");
		driver.findElement(By.id("react-select-7-input")).sendKeys(Keys.ENTER);
		//next step1
		driver.findElement(By.xpath("/html/body/section/div[3]/div/div[2]/div[2]/button[2]")).click();
		//activate and deactivate button
		driver.findElement(By.xpath("/html/body/section/div[3]/div/div[1]/div[1]/div/button")).click();
		//next step2
		driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/div[2]/button[3]")).click();
		//create goal
		driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/div[2]/button[3]")).click();
		Thread.sleep(3000);
		//search
		driver.findElement(By.xpath("/html/body/section/div[3]/div/div[1]/div/div[2]/div[1]")).click();
		driver.findElement(By.xpath("/html/body/section/div[3]/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("sales");
		driver.manage().window().maximize();
        Thread.sleep(2000);
		File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screenshotFile, new File(".//screenshot/goals.png"));
	}
	
}
