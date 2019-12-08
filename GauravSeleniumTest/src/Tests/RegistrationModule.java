package Tests;

import org.testng.annotations.Test;

import PageObject.RegisterPage;
import PageObject.TopMenu;
import Utilities.globalVariables;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class RegistrationModule 
{
  
	@Test
	public void register_User()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		//creating object of top menu to click on register link
		TopMenu tpo = new TopMenu(driver);
	
		tpo.register_click();
		
		//create object of Register page to perform inputs for different values
		RegisterPage rpo = new RegisterPage(driver);
		
		rpo.firstname_enterText("Gaurav");
		rpo.lastname_enterText("J");
		rpo.phone_enterText("9999999999");
		rpo.email_enterText("gauravj100@gmail.com");
		
		
		rpo.Address1_enterText("Block-1");
		rpo.Address2_enterText("sector-45");
		rpo.city_enterText("Noida");
		rpo.state_enterText("U P");
		rpo.postal_enterText("562308");
		rpo.country_value("INDIA");
		
		rpo.username_enterText("Gaurav123");
		rpo.password_enterText("Gaurav123");
		rpo.confirmPassword_enterText("Gaurav123");
		
		rpo.register_click();
	
	}


}
