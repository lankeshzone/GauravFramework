package main.java.NewToursAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPageObject extends BasePageObject
{
	
	
public SignInPageObject(WebDriver d) 
{
		super(d);
		// TODO Auto-generated constructor stub
	}


static WebDriver driver;
static WebElement userID;
	
	//identify userID Text Box
	public static void userIDTextBox(String str)
	{
		userID = driver.findElement(By.id("username"));
	}
	
	
	//entering text in userid text box
	public void userID_EnterText(String value, String locator)
	{
		userIDTextBox(locator);
		userID.sendKeys(value);
	}
	
	
	
	
	/*
	public SignInPageObject(WebDriver d)
	{
		driver = d;
	}*/
	
}
