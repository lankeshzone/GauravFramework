package Tests;

import org.testng.annotations.Test;

import Utilities.DriverUtil;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Registration 
{
	static DriverUtil Driver;
	static WebDriver driver;
	
  @Test(groups = { "Regression","Sanity"})
  public void Tc001() throws MalformedURLException
  {
	  driver = Driver.setupBrowser("chrome");
	  driver.get("https://www.facebook.com");
	  System.out.println("Iam in TC001 in both sanity and Regression");
  }
  
  @Test(groups = { "Regression"})
  public void Tc002() throws MalformedURLException
  {
	  driver = Driver.setupBrowser("firefox");
	  driver.get("https://www.linkedin.com");
	  System.out.println("Iam in Test1 Regression");
  }
  
  @Test(groups = { "Regression"})
  public void Tc003() throws MalformedURLException
  {
	  driver = Driver.setupBrowser("chrome");
	  driver.get("https://www.google.com");
	  System.out.println("Iam in Test2 Regression");
  }
  
  @Test(groups = { "Regression"})
  public void Tc004() throws MalformedURLException
  {
	  driver = Driver.setupBrowser("Chrome");
	  driver.get("https://www.ndtv.com");
	  System.out.println("Iam in Test3 Regression");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Iam in before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Iam in after method");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  Driver = new DriverUtil(driver);
	  System.out.println("Iam in before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Iam in after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Iam in before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Iam in after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Iam in before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Iam in After Suite");
  }

}
