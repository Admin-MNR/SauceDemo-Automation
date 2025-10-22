package TestClasses;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass {

	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	public void setUp(String brwsr)
	{
		
		switch(brwsr.toLowerCase())
		{
			case "chrome":
				driver=new ChromeDriver();
				break;
				
			case "edge":
				driver=new EdgeDriver();
				break;
				
			case "firefox":
				driver=new FirefoxDriver();
				break;
			default:
				System.out.println("Invalid Browser");
			return;
		}
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	


	

}
