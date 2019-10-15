package GauravSeleniumTest.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class signINPageObject 
{
	//constructor for initializing the browser
	static WebDriver driver;
	
	signINPageObject(WebDriver d)
	{
		driver = d;
	}
	
	//Write methods for identifying webelements on signIN page
	
	static WebElement emailID, password, enter;
	
	//emailID  text box
	//driver ==> which is provided by the person who calls this method
	// locator type ==> get from excel sheet
	// locator value ==> get from excel sheet
	
	public void emailId_textbox()
	{
		emailID = driver.findElement(By.xpath("//input[@placeholder='E mail']"));
	}
	
	
	//password text box
	public void password_textBox()
	{
		password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	}
	
	//enter Button
	public void enter_button()
	{
		enter=driver.findElement(By.xpath("//img[@id='enterbtn']"));
		System.out.println("hello " + enter.getTagName());
	}
	
	
	
	//write methods for reusable actions for each element on signIN Page
	//data is provided by person who is calling 
	public void email_sendKeys(String str)
	{
		emailId_textbox();
		emailID.sendKeys(str);
	}

	public void password_sendkeys(String str)
	{
		password_textBox();
		password.sendKeys(str);
	}

	public void enter_click()
	{
		enter_button();
		Actions act = new Actions(driver);
		
		act.contextClick(enter).build().perform();
	//	enter.click();
		System.out.print("hello after");
	}

}
