package Base;

import java.io.FileReader;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {

	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static Properties loc=new Properties();
    public static FileReader fr;
    public static FileReader fr1;

	@BeforeTest
	public void setUp() throws IOException {
		
		if(driver==null) {
			 fr=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			 fr1=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");
			prop.load(fr);
			loc.load(fr1);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
		}

	}

	@AfterTest
	public void teardown() {
		//driver.close();
		System.out.println("tear down successfull");


	}
}
