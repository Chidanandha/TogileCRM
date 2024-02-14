package testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Base.Basetest;

public class CustomisationCompany extends Basetest {
	
	@Test
	public void companyaddlayout() throws Throwable{


		System.out.println("Click is successfull");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testshivaji1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testshivaji1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[4]/button")).click();// profile button
		driver.findElement(By.xpath("/html/body/div/div[3]/div/ul/a[2]/li/div/div[2]/span")).click();//settings button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div/ul/a[6]/li/div")).click();//customisation
		Thread.sleep(3000);	
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div[1]/div/div[2]/div/button[4]")).click();//company
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div[2]/div[2]/div/button")).click();
		driver.findElement(By.id("react-select-3-input")).sendKeys("Add");
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/form/div[3]/div/div[2]/div/button[2]")).click();

		//addgroup
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div[1]/button/div")).click(); 
		driver.findElement(By.id("fieldLabel")).sendKeys("develope");
		driver.findElement(By.id("internalName")).sendKeys("code");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/button[2]")).click();

		//create field  
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div[1]/div[2]/button[1]/div")).click();
		driver.findElement(By.id("react-select-4-input")).sendKeys("text");
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER); 
		driver.findElement(By.id("label")).sendKeys("stockmarket");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[3]/button[2]")).click();

		//add field

		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div[1]/div[2]/button[2]/div")).click();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/div/div[1]/div[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/button[2]")).click();//save

		//assign profile permissions
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[3]/div/div[2]/div/button[2]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/div/div[2]/div[2]/div/div/div[1]/input")).click();
		driver.findElement(By.id("react-select-5-input")).sendKeys("m");
		Thread.sleep(2000);
		driver.findElement(By.id("react-select-5-input")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/form/div[3]/div/div[2]/div/button[2]")).click();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        
       //File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    //  FileUtils.copyFile(screenshotFile, new File(".//screenshot/customisationcompany.png"));

	}

}
