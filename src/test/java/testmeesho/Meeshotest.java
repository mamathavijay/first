package testmeesho;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagemeesho.Meeshopage;

public class Meeshotest {
	
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void get()
	{
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws Exception
	{
		//Thread.sleep(5000);
		Meeshopage obj1=new Meeshopage(driver, driver);
		obj1.actions();
		obj1.action1();
		obj1.action2();
	
	}
}


