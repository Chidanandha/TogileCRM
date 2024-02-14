package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Base.Basetest;                                                                               //driver.findElement(By.id("")).click();

public class DashboardContacts extends Basetest {
	@Test
	public void Dcontacts() throws Throwable {
		
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testparag1@gmail.com");
	    driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[2]/ul/li[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div[1]/button[1]")).click();
		driver.findElement(By.id("react-select-2-input")).sendKeys("mr");//salutation
		driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[3]/input")).sendKeys("Manish");//first name
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[4]/input")).sendKeys("pandey");//last name
		driver.findElement(By.id("react-select-3-input")).sendKeys("kolka");//time zone
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[6]/input")).sendKeys("silkboard");//address
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[7]/input")).sendKeys("bangalore");//city
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[8]/input")).sendKeys("karnataka");//state
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[9]/input")).sendKeys("560068");//zipcode
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[10]/input")).sendKeys("facebook.com");//facebook
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[11]/input")).sendKeys("twitter.com");//twitter
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[12]/input")).sendKeys("linkedin.com");//linkedin
		driver.findElement(By.id("react-select-69-input")).sendKeys("");//company
		driver.findElement(By.id("react-select-69-input")).sendKeys("");
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[14]/input")).sendKeys("");//department
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[15]/input")).sendKeys("");//decision maker
		driver.findElement(By.xpath("react-select-70-input")).sendKeys("");//owner
		driver.findElement(By.xpath("react-select-70-input")).sendKeys("");
		driver.findElement(By.xpath("react-select-71-input")).sendKeys("");//created by
		driver.findElement(By.xpath("react-select-71-input")).sendKeys("");
		driver.findElement(By.xpath("react-select-71-input")).sendKeys("");//updated by
		driver.findElement(By.xpath("react-select-71-input")).sendKeys("");
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[21]/input")).sendKeys("");//created via type
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[22]/input")).sendKeys("");//created via name
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[23]/input")).sendKeys("");//created via type
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[24]/input")).sendKeys("");//updated via id
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[25]/input")).sendKeys("");//updated via name
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[26]/input")).sendKeys("");//updated via type
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[30]/input")).sendKeys("");//ad id
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[31]/input")).sendKeys("");//campaign id
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[32]/input")).sendKeys("");//campaign name
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[33]/input")).sendKeys("");//form id
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[34]/input")).sendKeys("");//ad set name
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[35]/input")).sendKeys("");//ad name
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[2]/div[2]/div[2]/div/input")).sendKeys("");//phone number
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[2]/div[3]/div[2]/div/input")).sendKeys("");//email
		driver.findElement(By.id("react-select-73-input")).sendKeys("");//imported by
		driver.findElement(By.id("react-select-73-input")).sendKeys("");
		driver.findElement(By.id("react-select-74-input")).sendKeys("");//campaign
		driver.findElement(By.id("react-select-74-input")).sendKeys("");
		driver.findElement(By.id("react-select-75-input")).sendKeys("");//source
		driver.findElement(By.id("react-select-75-input")).sendKeys("");
		driver.findElement(By.id("react-select-75-input")).sendKeys("");//time zone
		driver.findElement(By.id("react-select-75-input")).sendKeys("");
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/button[3]")).click();
		
		
	}

	
	
	
}
