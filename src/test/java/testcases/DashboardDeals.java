package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Base.Basetest;

public class DashboardDeals extends Basetest {
	@Test
	public void Ddeals() throws Throwable {
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		driver.manage().window().maximize();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[2]/ul/li[2]")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[2]/input")).sendKeys("very new deal");//Name
		driver.findElement(By.id("react-select-3-input")).sendKeys("parag");//owner
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[4]/div[2]/div/input")).sendKeys("9111356778");//phoen number
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[5]/div[2]/div/input")).sendKeys("deal1@gmail.com");//email
		driver.findElement(By.id("react-select-4-input")).sendKeys("manis");//pipeline
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-5-input")).sendKeys("open");//pipeline stage
		driver.findElement(By.id("react-select-5-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-6-input")).sendKeys("vinit");//contact
		driver.findElement(By.id("react-select-6-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-7-input")).sendKeys("parag");//company
		driver.findElement(By.id("react-select-7-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("react-select-8-input")).sendKeys("vicky");//product
		driver.findElement(By.id("react-select-8-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[11]/div/button")).click();//estimated closure
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[3]/div/div[2]/button[28]")).click();//
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[12]/input")).sendKeys("50000");//estimated value
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[13]/input")).sendKeys("60000");//
		driver.findElement(By.id("react-select-9-input")).sendKeys("facebook");
		driver.findElement(By.id("react-select-9-input")).sendKeys(Keys.ENTER);
		
		
		
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/button[2]")).click();//save
//		driver.findElement(By.id("react-select-57-input")).sendKeys("");//owner
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");//company
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");//pipeline
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");//pipeline stage
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");//pipeline stage
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");//created by
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");//updated by
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");//pipeline stage reason
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");//Is new
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");//campaign
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");//source
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");//product
//		driver.findElement(By.id("react-select-59-input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[2]/input")).sendKeys("");//Name
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[5]/input")).sendKeys("");//estimated value
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[6]/input")).sendKeys("");//actual value
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[17]/input")).sendKeys("");//sf pipelinestage reason
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[23]/input")).sendKeys("");//quantity
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[24]/input")).sendKeys("");//price
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[25]/input")).sendKeys("");//discount
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[26]/input")).sendKeys("");//sf due amount
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[27]/input")).sendKeys("");//created via id
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[28]/input")).sendKeys("");//created via name
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[29]/input")).sendKeys("");//creadted via type
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[30]/input")).sendKeys("");//updated via id
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[31]/input")).sendKeys("");//updated via name
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[32]/input")).sendKeys("");//updated via type
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[2]/div[2]/div[2]/div/input")).sendKeys("");//sf phone number
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[2]/div[3]/div[2]/div/input")).sendKeys("");//sf email
	
		
		
		
		
		
		
	}

}
