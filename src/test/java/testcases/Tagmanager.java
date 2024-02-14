package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.Basetest;

public class Tagmanager extends Basetest {
	@Test
	public void tag() throws Throwable {

		System.out.println("Click is successfull");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[4]/button")).click();// profile button
		driver.findElement(By.xpath("/html/body/div/div[3]/div/ul/a[2]/li/div/div[2]/span")).click();//settings button


		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div/ul/a[8]/li/div/div[2]/span")).click();

		Thread.sleep(2000);
	//	driver.findElement(By.xpath("/html/body/section/div[3]/div/div[2]/form/div/button")).click();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//td/button[@id='addTagBtn' and text()='Add']"))).click();
		driver.findElement(By.xpath("/html/body/section/div[3]/div/div[2]/form/div/button")).click();
		//JavascriptExecutor js = (JavascriptExecutor)webDriver;  
        //js.executeScript("document.getElementByxpath('/html/body/section/div[3]/div/div[2]/form/div/button').click();");

//		driver.findElement(By.id("react-select-2-input")).sendKeys("leads");
//		driver.findElement(By.id("react-select-2-input")).click();
//		driver.findElement(By.name("name")).sendKeys("pradeep");
//		driver.findElement(By.xpath("/html/body/section/div[3]/div/div[2]/form/div/div[2]/div/div")).click();
//		
	}

}
