package pageblazelogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazelogin {
	
WebDriver driver;
	
	By blzemail=By.id("email");
	By blzpasssword=By.name("password");
	By blzcheck=By.name("remember");
	By blzlogin=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");    
	
	public Blazelogin(WebDriver driver)
	
	{
		this.driver=driver;
		
	}
	
	public void setvalues(String email,String password)
	{
		
		driver.findElement(blzemail).sendKeys(email);
		driver.findElement(blzpasssword).sendKeys(password);
	}
	
	public void login() {
		driver.findElement(blzcheck).click();
		driver.findElement(blzlogin).click();
	}
	}



