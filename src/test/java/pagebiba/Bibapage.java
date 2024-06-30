package pagebiba;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Bibapage {
	
	WebDriver driver;
	
	//By login=By.xpath("/html/body/div[1]/header/nav/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/a[2]/i");
	//By email=By.xpath("//*[@id=\"login-form-otp\"]/div[2]/label") ;
	//By remember=By.xpath("//*[@id=\"login-form-otp\"]/div[3]/div/label");
	//By cont=By.xpath("//*[@id=\"login-form-otp\"]/button");
	//By first=By.xpath("//*[@id=\"registration-form-fname\"]");
	//By mobile=By.xpath("//*[@id=\"registration-form-phone\"]");
	//By passwd=By.xpath("//*[@id=\"registration-form-password\"]");
	//By otp=By.xpath("//*[@id=\"signup-login-popup\"]/div/div/div/div/div/div[2]/div/div/div/div/div[4]/form/button");
	By newarr=By.xpath("/html/body/div[1]/header/nav/div[2]/div/div/nav/div[2]/ul/li[2]/a");
	By logo=By.xpath("/html/body/div[1]/header/nav/div[1]/div/div/div[1]/a/div/i");
	//By disc=By.xpath("/html/body/div[1]/div/div[5]/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/b");
	//By popular=By.xpath("//*[@id=\"product-search-results\"]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]");
	By pic=By.xpath("/html/body/div[1]/div/div[5]/div/div[2]/div[2]/div[1]/div[3]/div[1]/div/div/div[1]/div/a[1]/div/div[5]/img");
	By wishlist=By.xpath("//*[@id=\"plpCarousel-JAMAWAR20167SS24BLU\"]/div/a[1]/div/div[4]/img");
	By size=By.xpath("//*[@id=\"size_selector\"]/div[2]/div/div/a[1]");
	By cart=By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div[2]/div[4]/div/div[2]/div/div/div/button");
	By addcart=By.xpath("/html/body/div[1]/header/nav/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/a/i");	

	public Bibapage(WebDriver driver2, WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver=driver;
	}
	public void actions()
	{
		driver.findElement(newarr).click();
		boolean s=driver.findElement(logo).isDisplayed();
		if(s)
		{
			
			System.out.println("Logo Present");
		}
		else
		{
			System.out.println("Logo not present");
		}
	}
	//public void action1()
	//{
		//driver.findElement(disc).click();
		//driver.findElement(popular).click();
		//driver.navigate().refresh();
	//}
	
	public void action1()
	{
		driver.findElement(pic).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		
	}

		
	
	public void action2()
	{
		driver.findElement(wishlist).click();
		driver.findElement(size).click();
		driver.findElement(cart).click();
		driver.findElement(addcart).click();
	}

}
	
	



