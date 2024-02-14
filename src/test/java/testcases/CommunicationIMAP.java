package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Base.Basetest;

public class CommunicationIMAP extends Basetest{
	@Test(priority = 1)
	public void smtp() throws Throwable {
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testshivaji1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testshivaji1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[4]/button")).click();// profile button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/ul/a[2]/li/div/div[2]/span")).click();//settings button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div/ul/a[11]/li/div/div[2]/span")).click();//communication
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div/div[1]/div/div[2]/div/button[1]")).click();//smtp
		driver.findElement(By.id("smtpserver")).sendKeys("zoho");
		driver.findElement(By.id("port")).sendKeys("1234");
		driver.findElement(By.id("host")).sendKeys("smtp.zoho.com");
		driver.findElement(By.id("react-select-3-input")).sendKeys("ssl");
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("username")).sendKeys("Techisor CRM");
		driver.findElement(By.id("fromEmail")).sendKeys("anagh.bhasker@techisor.com");
		driver.findElement(By.id("password")).sendKeys("Anagh@32");
		driver.findElement(By.xpath("/html/body/section/div[3]/div/div[2]/div/form/div[2]/button[2]")).click();
		Thread.sleep(3000);
	}
//	@Test(priority = 2)
//	public void imap() throws Throwable {
//		driver.findElement(By.xpath("/html/body/section/div[3]/div/div[1]/div/div[2]/div/button[2]")).click();//imap
//		driver.findElement(By.id("smtpserver")).sendKeys("Zoho");
//		driver.findElement(By.id("port")).sendKeys("1234");
//		driver.findElement(By.id("host")).sendKeys("smtp.zoho.com");
//		driver.findElement(By.id("react-select-3-input")).sendKeys("ssl");
//		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
//		driver.findElement(By.id("username")).sendKeys("Techisor CRM");
//		driver.findElement(By.id("fromEmail")).sendKeys("anagh.bhasker@techisor.com");
//		driver.findElement(By.id("password")).sendKeys("Anagh@321");
//		driver.findElement(By.xpath("/html/body/section/div[3]/div/div[2]/div/form/div[2]/button[2]")).click();
//		Thread.sleep(3000);
//	}
//	@Test(priority = 3)
//	public void pop() {
//		driver.findElement(By.xpath("/html/body/section/div[3]/div/div[1]/div/div[2]/div/button[3]")).click();//imap
//		driver.findElement(By.id("smtpserver")).sendKeys("Zoho");
//		driver.findElement(By.id("port")).sendKeys("1234");
//		driver.findElement(By.id("host")).sendKeys("smtp.zoho.com");
//		driver.findElement(By.id("react-select-3-input")).sendKeys("ssl");
//		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
//		driver.findElement(By.id("username")).sendKeys("Techisor CRM");
//		driver.findElement(By.id("fromEmail")).sendKeys("anagh.bhasker@techisor.com");
//		driver.findElement(By.id("password")).sendKeys("Anagh@321");
//		driver.findElement(By.xpath("/html/body/section/div[3]/div/div[2]/div/form/div[2]/button[2]")).click();
//	}

}
