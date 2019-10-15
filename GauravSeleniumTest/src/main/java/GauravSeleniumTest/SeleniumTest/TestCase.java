package GauravSeleniumTest.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/SignIn.html");

		signINPageObject spo = new signINPageObject(driver);
		
		spo.email_sendKeys("lankesh");
		spo.password_sendkeys("lankesh");
		driver.findElement(By.id("logo")).click();
		spo.enter_button();
		
	}

}
