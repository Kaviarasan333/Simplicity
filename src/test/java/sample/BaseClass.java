package sample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	
	
		public static WebDriver driver;
	public static void Browserlaunch() 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roger\\eclipse-workspace\\Simplicity\\Driver\\chromedrivers.exe");
	 driver=new ChromeDriver();
	}

	public static void website(String url) 
	{
		
	driver.get(url);
	}

	public static void UserName(WebElement loc, String value) 
	{
		loc.sendKeys(value);

	}
	public static void cli(WebElement loc)
	{
		loc.click();

	}
	public static void BrowserClose() {
		driver.quit();

	}
	public static void move(WebElement e) 
	{
		Actions act=new Actions(driver);
		act.moveToElement(e);

	}
	public static void Attr(WebElement e)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Object atr = js.executeScript("return arguments[0].getAttribute('value')", e);
		String st=(String)atr;
		System.out.println(st);
	}
	}



