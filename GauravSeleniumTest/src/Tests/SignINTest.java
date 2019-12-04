package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.RegisterPage;
import PageObject.TopMenu;
import PageObject.signINPage;
import Utilities.globalVariables;

public class SignINTest 
{
	static WebDriver driver;
	static signINPage sp;
	static TopMenu tp;
	
	 @BeforeClass
	  public void beforeClass() 
	  {
		  driver = globalVariables.driver;
		  driver = new FirefoxDriver();
		  driver.get(globalVariables.url);
		  driver.findElement(By.linkText("REGISTER")).click();
		  sp = new signINPage(driver);
		  tp = new TopMenu(driver);
	  }
	
	 @Test
	public void signInTest() 
	{
		 // test for login scenario
		tp.signON_click();
		sp.userName_enterText("Lankesh123@gmail.com");
		sp.password_enterText("Lankesh123");
		sp.sign_Click();
		
	}

}
