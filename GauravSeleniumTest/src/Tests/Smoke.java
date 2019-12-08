package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Smoke 
{
	
	 @Test(groups = { "Smoke"}, priority = 3)
	  public void Tc004()
	  {
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://www.timesofindia.com");
		  System.out.println("Iam in tc-4 in smoke");
	  }
	  
	  @Test(groups = { "Smoke"}, priority=1)
	  public void Tc005()
	  {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.com");
		  System.out.println("Iam in tc-5 in smoke");
	  }
	  
	  @Test(groups = { "Smoke","Sanity"},priority=2, enabled=false)
	  public void Tc006()
	  {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com");
		  System.out.println("Iam in tc-6 in smoke and sanity");
	  }
	  
	  @Test(groups = { "Smoke"},priority=4)
	  public void Tc007()
	  {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.snapdeal.com");
		  System.out.println("Iam in tc-7 in smoke");
	  }

}
