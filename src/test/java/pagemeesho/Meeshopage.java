package pagemeesho;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Meeshopage {
	
	
	WebDriver driver;
	By search=By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/input");
	By men=By.xpath("/html/body/div/div[2]/div[4]/div/div[5]");
	By jewellery=By.xpath("/html/body/div/div[2]/div[4]/div/div[6]/div/div[3]/a[5]/p");
	By logo=By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/a/img");
	By care=By.xpath("//*[@id=\"__next\"]/div[2]/div[4]/div/div[11]/span");
	
	public Meeshopage(WebDriver driver2, WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver=driver;
	}
	public void actions()
	{
		driver.findElement(search).sendKeys("men",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
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
	
	public void action1()
	{

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(jewellery));
		

		driver.findElement(jewellery).click();
		driver.navigate().refresh();
	}
	
	public void action2()
	{
		driver.findElement(care).click();
		driver.navigate().refresh();
	}
	
}
