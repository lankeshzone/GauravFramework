package main.java.NewToursAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePageObject {
	
static WebDriver driver;
	
	static WebElement userAgreement, Privacy;
	
	//identify userAgreement Link
	public static void uerAgreementLink(String str)
	{
		userAgreement = driver.findElement(By.linkText(str));
	}
	
	
	//entering text in userid link
	public void userAgreement_click(String locator)
	{
		uerAgreementLink(locator); // calling method for identifying element
		userAgreement.click(); // performing the action
	}
	
	
	//identify Privacy Text Box
		public static void privacyLink(String str)
		{
			Privacy = driver.findElement(By.linkText(str));
		}
		
		
		//entering text in privacy link
		public void privacy_click(String locator)
		{
			privacyLink(locator); // calling method for identifying element
			Privacy.click(); // performing the action
		}
	
	public BasePageObject(WebDriver d)
	{
		driver = d;
	}

}
