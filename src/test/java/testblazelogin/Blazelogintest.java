package testblazelogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageblazelogin.Blazelogin;


public class Blazelogintest {
	
WebDriver driver;
	
	@BeforeTest
	
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	
	public void url()
	{
		driver.get("https://blazedemo.com/login");
	}

	@Test
	
	public void testlogin1() {
		Blazelogin ob=new Blazelogin(driver);
		ob.setvalues("abc@gmail.com", "abcef");
		ob.login();
	}
}

	




