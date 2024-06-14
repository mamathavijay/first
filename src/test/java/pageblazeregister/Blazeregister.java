package pageblazeregister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazeregister {
	
WebDriver driver;
	
	By blazename=By.id("name");
	By blazecompany=By.id("company");
	By blazeemail=By.name("email");
	By blazepassword=By.name("password");
	By blazeconfirmpassword=By.name("password_confirmation");
	By blazeregister=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");

	
	public Blazeregister(WebDriver driver)
	
	{
		this.driver=driver;
		
	}
	
	public void setvalues(String name,String company,String email,String password,String confirmpassword )
	{
		
		driver.findElement(blazename).sendKeys(name);
		driver.findElement(blazecompany).sendKeys(company);
		driver.findElement(blazeemail).sendKeys(email);
		driver.findElement(blazepassword).sendKeys(password);
		driver.findElement(blazeconfirmpassword).sendKeys(confirmpassword);
		

	}
	
	public void register() {
		driver.findElement(blazeregister).click();
	}
	}



