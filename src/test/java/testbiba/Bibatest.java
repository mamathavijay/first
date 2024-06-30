package testbiba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagebiba.Bibapage;



public class Bibatest {



		WebDriver driver;
		@BeforeTest
		public void set()
		{
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void get()
		{
			driver.get("https://www.biba.in/new-arrival/?mf_campaignname_click=648728301&gclickId_identifier=CjwKCAjwvvmzBhA2EiwAtHVrb-TLnep20ZkTztvaTkzoWXOv72wDheM6ka0cNmY-hXQgYk-kqL4DDRoC5QQQAvD_BwE&placement_id_identifier=&key_word_identifier=biba&ad_group_id_identifier=33775105677&utm_source=Google&gad_source=1&gclid=CjwKCAjwvvmzBhA2EiwAtHVrb-TLnep20ZkTztvaTkzoWXOv72wDheM6ka0cNmY-hXQgYk-kqL4DDRoC5QQQAvD_BwE");
			driver.manage().window().maximize();
		}
		@Test
		public void test1() throws Exception
		{
			//Thread.sleep(5000);
			Bibapage obj1=new Bibapage(driver, driver);
			obj1.actions();
			obj1.action1();
			obj1.action2();
			
		
		}
	}

	

