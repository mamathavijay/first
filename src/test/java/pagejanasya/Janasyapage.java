package pagejanasya;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Janasyapage {
	
	WebDriver driver;
	By new_arrival=By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a");
	By logo=By.xpath("//*[@id=\"shopify-section-sections--16349892411562__0551e2c3-4916-467e-a6e9-b0d8594a3ff3\"]/header/div/div/div[2]/div/div/div/a/img");
	By itembox=By.xpath("//*[@id=\"CollectionProductGrid\"]/div/toolbar-item/div[2]/div[3]/div[1]/div/div");
	By itemno=By.xpath("//*[@id=\"CollectionProductGrid\"]/div/toolbar-item/div[2]/div[3]/div[1]/div/ul/li[2]/span");
	By categories=By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3");
	By kurtha=By.xpath("/html/body/div[2]/main/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[1]/div[2]/div/ul/li[1]/a/span");
	By links=By.tagName("a");
	By menu=By.tagName("nav");
	By cart=By.xpath("//*[@id=\"44199301382314\"]");
	By view_cart=By.xpath("//*[@id=\"halo-cart-sidebar\"]/div[2]/cart-coupon-discount/div/div[3]/div/div/a");
	By continue_shop=By.xpath("//*[@id=\"main-cart-items\"]/div/div[2]/form/div/div/a");
	By ethnic=By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/a/span[1]");
	By kurset=By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/ul/li[2]/a/span");
	
	By wishlist=By.xpath("//*[@id=\"main-collection-product-grid\"]/li[1]/div/div/div[1]/div/div[3]/div[1]/button");
	
	
	public Janasyapage(WebDriver driver2) {
		// TODO Auto-generated constructor stub

		this.driver=driver;
	}
	public void actions()
	{
		driver.findElement(new_arrival).click();
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
		driver.findElement(itembox).click();
		driver.findElement(itemno).click();
		driver.navigate().refresh();
	}
	
	public void action2()
	{
		driver.findElement(categories).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(kurtha).click();
		//driver.navigate().to("https://janasya.com/collections/kurti-kurta");
	}
	public void action3()
	{
		// to print all links
		List<WebElement> list=driver.findElements(links);
		for(WebElement w:list)
		{
			String s=w.getAttribute("href");
			String s1=w.getText();
			System.out.println("link: "+s+" text: "+s1);			
		}
	
	}
	public void action4()
	{
		List<WebElement> m=driver.findElements(menu);
		for(WebElement men:m)
		{
			String menustr=men.getText();
			System.out.println("Menus");
			System.out.println("--------------");
			System.out.println(menustr );
			
		}
	}
	public void action5()
	{
		driver.findElement(wishlist).click();
		driver.findElement(cart).click();
		driver.findElement(view_cart).click();
		driver.findElement(continue_shop).click();
	}
	public void action6()
	{
		Actions act=new Actions(driver);
		WebElement w=driver.findElement(ethnic);
		act.moveToElement(w).build().perform();
		WebElement qw=driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/ul/li[2]/a/span"));
		qw.click();
	}
}
	
	

