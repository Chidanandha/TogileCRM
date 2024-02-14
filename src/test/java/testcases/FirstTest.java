package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.Basetest;

public class FirstTest extends Basetest{
	
	@Test
	
	public static void Login() throws Throwable {
		
		    System.out.println("Click is successfull");
		    Thread.sleep(3000);
			driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys("testparag1@gmail.com");
	        driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Testparag1@gmail.com");
			driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
			System.out.println("login is successfully done");
		
	}

}







//
////package Testcases;
////
////import org.openqa.selenium.By;
////import org.testng.annotations.Test;
////
////import Base.Basetest;
////
////public class FirstTest extends Basetest{
////	
////	@Test(dataProvider="testdata")
////	
////	public static void Login(String username, String password) throws Throwable
//    {
////		
////		    System.out.println("Click is successfull");
////		    Thread.sleep(3000);
////			driver.findElement(By.xpath(loc.getProperty("mailid_field"))).sendKeys(username);
////	        driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys(password);
////			driver.findElement(By.xpath(loc.getProperty("login_button"))).click(); //login button
////			System.out.println("login is successfully done");
////		
////	}
//
//@DataProvider(name="testdata")
//public Object[][] tData()
//{
//	return new Object[][] {
//		{"testparag1@gmail.com","Testparag1@gmail.com"}
//		{"testparag1@gmail.com","Testparag1@gmail.com"}
//		{"testparag1@gmail.com","Testparag1@gmail.com"}
//		{"testparag1@gmail.com","Testparag1@gmail.com"}
//		
//	}
//			
////
////}



