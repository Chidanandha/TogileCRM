package testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Base.Basetest;

public class CustomisationLeads extends Basetest{
	@Test(priority = 1)

	public void editleadsaddlayout() throws Throwable {


		System.out.println("Click is successfull");
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testshivaji1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testshivaji1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[4]/button")).click();// profile button
		driver.findElement(By.xpath("/html/body/div/div[3]/div/ul/a[2]/li/div/div[2]/span")).click();//settings button


		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/section/div[2]/div/ul/a[6]/li/div/div[2]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div[2]/div[2]/div/button")).click();//adds lau
		driver.findElement(By.id("react-select-3-input")).sendKeys("edit");
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/form/div[3]/div/div[2]/div/button[2]")).click();

		//add group  
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div[1]/button/div")).click();
		driver.findElement(By.id("fieldLabel")).sendKeys("editleadsgroup");
		driver.findElement(By.id("internalName")).sendKeys("1");
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/button[2]")).click();


		//create field
	
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div[1]/div[2]/button[1]/div")).click();
		driver.findElement(By.id("react-select-4-input")).sendKeys("text");
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("label")).sendKeys("anagh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[3]/button[2]")).click();

		//add field
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div[1]/div[2]/button[2]")).click();
		driver.findElement(By.id("fieldLabel")).sendKeys("anagh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[3]/div/div[2]/div/button[2]")).click();
		
		//assign profile permission

		
		driver.findElement(By.id("react-select-5-input")).sendKeys("m");
		Thread.sleep(2000);
		driver.findElement(By.id("react-select-5-input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/form/div[3]/div/div[2]/div/button[2]")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   //  FileUtils.copyFile(screenshotFile, new File(".//screenshot/customisationlead.png"));

	}
	@Test(priority = 2)
	
	public void addleadsaddlayout() throws Throwable {


		System.out.println("Click is successfull");
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[4]/button")).click();// profile button
		driver.findElement(By.xpath("/html/body/div/div[3]/div/ul/a[2]/li/div/div[2]/span")).click();//settings button


		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/section/div[2]/div/ul/a[6]/li/div/div[2]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div[2]/div[2]/div/button")).click();//adds layout
		driver.findElement(By.id("react-select-3-input")).sendKeys("add");
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/form/div[3]/div/div[2]/div/button[2]")).click();

		//add group  
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div[1]/button/div")).click();
		driver.findElement(By.id("fieldLabel")).sendKeys("addleadgroup");
		driver.findElement(By.id("internalName")).sendKeys("1");
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/button[2]")).click();


		//create field
	
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div[1]/div[2]/button[1]/div")).click();
		driver.findElement(By.id("react-select-4-input")).sendKeys("para");
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("label")).sendKeys("anagh2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[3]/button[2]")).click();

		//add field
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div[1]/div[2]/button[2]")).click();
		driver.findElement(By.id("fieldLabel")).sendKeys("anagh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[2]/div[2]/div/div[1]/div[11]/div/div[1]/div[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[3]/div/div[2]/div/button[2]")).click();
		
		//assign profile permission

		
		driver.findElement(By.id("react-select-5-input")).sendKeys("m");
		Thread.sleep(2000);
		driver.findElement(By.id("react-select-5-input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/form/div[3]/div/div[2]/div/button[2]")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   //  FileUtils.copyFile(screenshotFile, new File(".//screenshot/customisationlead.png"));

	}
	@Test(priority = 3)
	
	public void detailsleadsaddlayout() throws Throwable {


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

		driver.findElement(By.xpath("/html/body/section/div[2]/div/ul/a[6]/li/div/div[2]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div[2]/div[2]/div/button")).click();
		driver.findElement(By.id("react-select-3-input")).sendKeys("leads details");
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/form/div[3]/div/div[2]/div/button[2]")).click();

		//add group  
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div[1]/button/div")).click();
		driver.findElement(By.id("fieldLabel")).sendKeys("detailsleadgroup");
		driver.findElement(By.id("internalName")).sendKeys("1");
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/button[2]")).click();


		//create field
	
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div[1]/div[2]/button[1]/div")).click();
		driver.findElement(By.id("react-select-5-input")).sendKeys("integ");
		driver.findElement(By.id("react-select-5-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("label")).sendKeys("sample field1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[3]/button[2]")).click();

		//add field
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div[1]/div[2]/button[2]")).click();
		driver.findElement(By.id("fieldLabel")).sendKeys("sample");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[2]/div[2]/div/div[1]/div[11]/div/div[1]/div[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[3]/div/div[2]/div/button[2]")).click();
		
		//assign profile permission

		
		driver.findElement(By.id("react-select-6-input")).sendKeys("m");
		Thread.sleep(2000);
		driver.findElement(By.id("react-select-6-input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/form/div[3]/div/div[2]/div/button[2]")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   //  FileUtils.copyFile(screenshotFile, new File(".//screenshot/customisationlead.png"));

	}

}
