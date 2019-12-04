package main.java.NewToursAutomation;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class RegistrationModule 
{
  
	static WebDriver driver;
	RegisterPage rp;
	
  @Test
  public void registerUser() 
  {
	  rp.firstname_enterText("Lankesh");
	  rp.lastname_enterText("Gowda");
	  rp.phone_enterText("9999999999");
	  rp.email_enterText("Test123@Test.com");
	  rp.Address1_enterText("Block-4");
	  rp.Address2_enterText("Malleswaram");
	  rp.city_enterText("Bangalore");
	  rp.state_enterText("Karnataka");
	  rp.postal_enterText("560022");
	  rp.username_enterText("Test1234567");
	  rp.password_enterText("Test1234");
	  rp.confirmPassword_enterText("Test1234");
	  rp.register_click();
  }
  
 @Test
 public void testTwo()
 {
	 driver.get("https://www.linkedin.com/uas/login?session_redirect=&trk=hb_signin");
		
		
		SignInPageObject spo = new SignInPageObject(driver);
		
		spo.userID_EnterText("lankeshzone@gmail.com", "username");
		
			
		spo.userAgreement_click("User Agreement");
		
		driver.get("https://www.linkedin.com/uas/login?session_redirect=&trk=hb_signin");
		
		spo.privacy_click("Privacy Policy");
		
		
		
		privacyPageObject ppo = new privacyPageObject(driver);
		
		ppo.introduction_Click("//a[contains(text(),'Introduction')]");
		
	
		//driver.get("https://www.linkedin.com/legal/privacy-policy?trk=d_checkpoint_lg_consumerLogin_ft_privacy_policy");
		
		
		ppo.data_Click("//a[contains(text(),'Data We Collect')]");
 }
  
  
  @BeforeClass
  public void beforeClass() 
  {
	  driver = globalVariables.driver;
	  driver = new FirefoxDriver();
	  driver.get(globalVariables.url);
	  driver.findElement(By.linkText("REGISTER")).click();
	  rp = new RegisterPage(driver);
		
  }

  
  @AfterMethod
  public void afterMethod() 
  {
  
  }



}
