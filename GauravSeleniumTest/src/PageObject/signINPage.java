package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signINPage
{

	static WebDriver driver;
	
	static WebElement userName, password, signIN;
	
	public signINPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
//username object
	
	public static void username( String LocatorValue)
	{
		userName = driver.findElement(By.name(LocatorValue));
	}
	
	public static void password(String LocatorValue)
	{
		password = driver.findElement(By.name(LocatorValue));
	}
	
	public static void signIN(String LocatorType)
	{
		signIN = driver.findElement(By.name(LocatorType));
	}
	
	
	public void userName_enterText(String text)
	{
		username("userName");
		userName.sendKeys(text);
	}
	
	public void password_enterText(String text)
	{
		password("password");
		password.sendKeys(text);
	}
	
	public void sign_Click()
	{
		signIN("login");
		signIN.click();
	}
}
