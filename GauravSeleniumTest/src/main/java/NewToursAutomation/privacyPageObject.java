package main.java.NewToursAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class privacyPageObject {
	
	static WebDriver driver;
	
static WebElement introduction, data;
	
	//identify userID Text Box
		public static void introductionLink(String str)
		{
			introduction = driver.findElement(By.xpath(str));
		}
		
		
		//entering text in userid text box
		public void introduction_Click(String locator)
		{
			introductionLink(locator);
			introduction.click();
		}
		
		
		//identify userID Text Box
		public static void dataLink(String str)
		{
			data = driver.findElement(By.xpath(str));
		}
		
		
		//entering text in userid text box
		public void data_Click(String locator)
		{
			dataLink(locator);
			data.click();
		}
		
		
		public privacyPageObject(WebDriver d)
		{
			driver = d;
		}

}
