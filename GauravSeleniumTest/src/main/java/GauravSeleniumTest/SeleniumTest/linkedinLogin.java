package GauravSeleniumTest.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class linkedinLogin 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new FirefoxDriver();
		
		//Step-1 launch the linkedin URL
		String ExpectedTitle = "LinkedIn Login, Sign in | LinkedIn";
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		String ActualTitle = driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		//Step-2 Enter the USerID
		By userID = By.id("username");
		WebElement userIDText = driver.findElement(userID);
		
		userIDText.sendKeys("Lankeshzone@gmail.com");
		
		
		//Step-3 Enter the Password
		By pwd = By.id("password");
		WebElement pwdText = driver.findElement(pwd);
		
		pwdText.sendKeys("lankesh123");
		
		//Step-4 Click on Sign in Button
		By sign = By.className("btn__primary--large");
		WebElement signInButton = driver.findElement(sign);
		
		signInButton.click();
		
		String ExpectedMessage = "Hmm, that's not the right password. Please try again or request a new one.";
		
		//Identify error message element and then get display text
		By error = By.id("error-for-password");
		WebElement errorMessage = driver.findElement(error);
		String ActualMessage = errorMessage.getText();
		
		Assert.assertEquals(ActualMessage, ExpectedMessage);
				
		
	}

}
