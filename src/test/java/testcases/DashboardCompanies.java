package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Base.Basetest;

public class DashboardCompanies extends Basetest{
	@Test
	public void Dcompany() throws Throwable {
		driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testparag1@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testparag1@gmail.com");
	    driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
		System.out.println("login is successfully done");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[2]/ul/li[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[2]/input")).sendKeys("Rahul");//name
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[3]/input")).sendKeys("BTM");//address
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[4]/input")).sendKeys("Bangalore");//city
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[5]/input")).sendKeys("Karnataka");//state
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[6]/input")).sendKeys("23456");//zipcode
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[7]/input")).sendKeys("facebook.com");//facebook
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[8]/input")).sendKeys("twitter.com");//twitter
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[9]/input")).sendKeys("linkedin.com");//linkedin
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[10]/input")).sendKeys("340000");//annual revenueThread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[11]/input")).sendKeys("9113902467");//phonenumber  /html/body/div/div[3]/div/div[2]/div[1]/div[11]/input
		driver.findElement(By.id("react-select-3-input")).sendKeys("Truthy");//do not disturb
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);//
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[13]/div[2]/div/input")).sendKeys("rahul1@gmail.com");//email
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[14]/input")).sendKeys("10");//number of employees
		driver.findElement(By.id("react-select-4-input")).sendKeys("falkland");//currency
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);//
		driver.findElement(By.id("react-select-5-input")).sendKeys("Automotive");//industry
		driver.findElement(By.id("react-select-5-input")).sendKeys(Keys.ENTER);//
		driver.findElement(By.id("react-select-6-input")).sendKeys("india");//country
		driver.findElement(By.id("react-select-6-input")).sendKeys(Keys.ENTER);//
		driver.findElement(By.id("react-select-7-input")).sendKeys("partner");//business type
		driver.findElement(By.id("react-select-7-input")).sendKeys(Keys.ENTER);//
		driver.findElement(By.id("react-select-8-input")).sendKeys("midway");//time zone
		driver.findElement(By.id("react-select-8-input")).sendKeys(Keys.ENTER);//
        driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[1]/div[20]/input")).sendKeys("Techisor");//website
		driver.findElement(By.id("react-select-9-input")).sendKeys("parag bokade");//created by
		driver.findElement(By.id("react-select-9-input")).sendKeys(Keys.ENTER);//
		driver.findElement(By.id("react-select-10-input")).sendKeys("vinit");//updated by
		driver.findElement(By.id("react-select-10-input")).sendKeys(Keys.ENTER);//
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[2]/div[2]/div[2]/div/input")).sendKeys("9113460865");//phonenumber
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[2]/div[3]/div[2]/div/input")).sendKeys("rahul1@gmail.com");//email
		driver.findElement(By.id("react-select-11-input")).sendKeys("kolkata");//timezone
		driver.findElement(By.id("react-select-11-input")).sendKeys(Keys.ENTER);//
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[3]/button[3]")).click();//
		
	
		
	}
	

}
