package testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Base.Basetest;

public class Companydetails extends Basetest{

	@Test
	public void companyprofile() throws Throwable {


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
		driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/div[1]/div/div[2]/button")).click();

		driver.findElement(By.id("CompanyName")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("CompanyName")).sendKeys("Techisor");
		Thread.sleep(2000);

		driver.findElement(By.className("react-international-phone-input")).clear();

		driver.findElement(By.className("react-international-phone-input")).sendKeys("+91 9874563210");
		Thread.sleep(2000);
		driver.findElement(By.id("phone")).clear();

		driver.findElement(By.id("phone")).sendKeys("8884014014");
		driver.findElement(By.id("state")).clear();
		driver.findElement(By.id("state")).sendKeys("Karnataka");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("Bangalore");
		driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/form/div[1]/div[3]/div/div[5]/div/input")).clear();
		driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/form/div[1]/div[3]/div/div[5]/div/input")).sendKeys("560068");

		Thread.sleep(2000);
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("No. 576/B, 4th Floor, Santhosapuram, 6th Sector, HSR Layout, Bengaluru, Karnataka 560068");
		Thread.sleep(2000);
		driver.findElement(By.id("description")).sendKeys("We’re Niveshartha\r\n"
				+ "We make our client step up into their financial journey by taking informed decisions in this wide world of Finance.\r\n"
				+ "\r\n"
				+ "Indians deserve to grow exponentially in terms of financial status by making a fair, transparent, and simple path.");



		driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/form/div[2]/div/button[2]")).click();
		
		driver.manage().window().maximize();
        Thread.sleep(3000);
		File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screenshotFile, new File(".//screenshot/companyprofile.png"));

	}
}
