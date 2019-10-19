package NewToursAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage
{
	static WebDriver driver;
	
	RegisterPage(WebDriver d)
	{
		driver = d;
	}
	
	
	static WebElement Firstname, Lastname, Phone, Email, Address1, Address2;
	static WebElement City, State, Postalcode, Country;
	static WebElement UserName, Password, ConfirmPassword, Register;
	
	
	public static void firstname_Text(String locatorValue)
	{
		Firstname = driver.findElement(By.name(locatorValue));
	}
	
	public static void lastname_Text(String locatorValue)
	{
		Lastname = driver.findElement(By.name(locatorValue));
	}
	
	public static void phone_Text(String locatorValue)
	{
		Phone = driver.findElement(By.name(locatorValue));
	}
	
	public static void email_Text(String locatorValue)
	{
		Email = driver.findElement(By.id(locatorValue));
	}
	
	public static void Address1_Text(String locatorValue)
	{
		Address1 = driver.findElement(By.name(locatorValue));
	}
	
	public static void Address2_Text(String locatorValue)
	{
		Address2 = driver.findElement(By.name(locatorValue));
	}
	
	public static void city_Text(String locatorValue)
	{
		City = driver.findElement(By.name(locatorValue));
	}
	
	public static void state_Text(String locatorValue)
	{
		State = driver.findElement(By.name(locatorValue));
	}
	
	public static void PostalCode_Text(String locatorValue)
	{
		Postalcode = driver.findElement(By.name(locatorValue));
	}
	
	public static void country_Text(String locatorValue)
	{
		Country = driver.findElement(By.name(locatorValue));
	}
	
	public static void username_Text(String locatorValue)
	{
		UserName = driver.findElement(By.id(locatorValue));
	}
	
	
	public static void password_Text(String locatorValue)
	{
		Password = driver.findElement(By.name(locatorValue));
	}
	
	
	public static void confirmPassword_Text(String locatorValue)
	{
		ConfirmPassword = driver.findElement(By.name(locatorValue));
	}
	
	public static void register_Button(String locatorValue)
	{
		Register = driver.findElement(By.name(locatorValue));
	}
	
	///actions section
	
	public void lastname_enterText(String value)
	{
		lastname_Text("lastName");
		Lastname.sendKeys(value);
		
	}
	
	public void firstname_enterText(String value)
	{
		firstname_Text("firstName");
		Firstname.sendKeys(value);
		
	}
	
	
	public void Address1_enterText(String value)
	{
		Address1_Text("address1");
		Address1.sendKeys(value);
		
	}

	public void Address2_enterText(String value)
	{
		Address2_Text("address2");
		Address2.sendKeys(value);
		
	}
	
	
	public void city_enterText(String value)
	{
		city_Text("city");
		City.sendKeys(value);
		
	}
	
	public void state_enterText(String value)
	{
		state_Text("state");
		State.sendKeys(value);
		
	}
	
	public void postal_enterText(String value)
	{
		PostalCode_Text("postalCode");
		Postalcode.sendKeys(value);
		
	}
	
	public void email_enterText(String value)
	{
		email_Text("userName");
		Email.sendKeys(value);
		
	}
	
	public void username_enterText(String value)
	{
		username_Text("email");
		UserName.sendKeys(value);
		
	}
	
	public void password_enterText(String value)
	{
		password_Text("password");
		Password.sendKeys(value);
		
	}
	
	
	public void confirmPassword_enterText(String value)
	{
		confirmPassword_Text("confirmPassword");
		ConfirmPassword.sendKeys(value);
		
	}
	
	public void phone_enterText(String value)
	{
		phone_Text("phone");
		Phone.sendKeys(value);
	}
	
	public void register_click()
	{
		register_Button("register");
		Register.click();
	}
}
