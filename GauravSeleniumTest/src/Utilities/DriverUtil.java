package Utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverUtil 
{
	static WebDriver driver;
	
	public DriverUtil(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//pick particular browser
	public WebDriver setupBrowser(String browser) throws MalformedURLException
	{
		switch(browser)
		{
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			break;
		case "RWD":
			URL url=new URL("https://localhost:4444");
			DesiredCapabilities cap = new DesiredCapabilities();
			driver = new RemoteWebDriver(url,cap);
			break;
		default:
			driver = new FirefoxDriver();
			break;
		}
		return driver;
	}
	
	//closing the browser
	public void shutBrowser()
	{
		driver.quit();
	}
	
	
	//attributes
	public String getValues(String s)
	{
		String str = null;
		if(s=="title")
			str= driver.getTitle();
		if(s=="url")
			str=driver.getCurrentUrl();
		if(s=="source")
			str= driver.getPageSource();
		if(str=="handleid")
			str=driver.getWindowHandle();
		return str;
	
	
	}
	
	//navigations
	public void navigation(String str)
	{
		if(str=="back")
			driver.navigate().back();
		if(str=="fwd")
			driver.navigate().forward();
		if(str=="refresh")
			driver.navigate().refresh();
	}

	//get position
	public Point getpos()
	{
		return (driver.manage().window().getPosition());
	}
	
	//get size
	public Dimension getSize()
	{
		return(driver.manage().window().getSize());
	}
}
