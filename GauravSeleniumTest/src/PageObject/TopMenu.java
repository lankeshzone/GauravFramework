package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopMenu 
{
	static WebDriver driver; // is at TopMenu class level
	
	static WebElement signOn, register, support, contact; 
	
	public TopMenu(WebDriver driver)//is at test case
	{
		this.driver = driver;
	}
	
	//elements
	public static void signON(String LocatorValue)
	{
		signOn = driver.findElement(By.linkText(LocatorValue));
	}
	
	public static void register(String LocatorValue)
	{
		register = driver.findElement(By.linkText(LocatorValue));
	}
	
	public static void support(String LocatorValue)
	{
		support = driver.findElement(By.linkText(LocatorValue));
	}
	
	public static void contact(String LocatorValue)
	{
		contact = driver.findElement(By.linkText(LocatorValue));
	}
	
	public void signON_click()
	{
		signON("SIGN-ON");
		signOn.click();
	}
	
	public void register_click()
	{
		register("REGISTER");
		register.click();
	}
	
	public void support_click()
	{
		support("SUPPORT");
		support.click();
	}
	
	public void contact_click()
	{
		contact("CONTACT);
		contact.click();
	}
}
