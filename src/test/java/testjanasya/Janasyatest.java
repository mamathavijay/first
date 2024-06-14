package testjanasya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagejanasya.Janasyapage;



	
	public class Janasyatest
	{

		WebDriver driver;
		@BeforeTest
		public void set()
		{
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void get()
		{
			driver.get("https://janasya.com/");
			driver.manage().window().maximize();
		}
		@Test
		public void test1() throws Exception
		{
			//Thread.sleep(5000);
			Janasyapage obj1=new Janasyapage(driver);
			obj1.actions();
			obj1.action1();
			obj1.action2();
			obj1.action3();
			obj1.action4();
			obj1.action5();
		}
	}
