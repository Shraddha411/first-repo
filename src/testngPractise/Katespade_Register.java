package testngPractise;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
//import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;
//import org.testng.annotations;
//import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Katespade_Register
 {
	
	
	@Test
	public void register() throws IOException
	
	{
		System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		wd.get("https://www.katespade.com/");
		Properties prop = new Properties();
		
			
		FileInputStream objFile= new FileInputStream("C:/Users/shraddhasingh/Desktop/Selenium Practise/objectRepo.properties");
		prop.load(objFile);
		
	     wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	        try {
	        	
	        WebElement closePop = wd.findElement(By.xpath(prop.getProperty("PopUp_Close")));
			if (closePop.isDisplayed())
				closePop.click();
			
	        }
	        
	        catch (NoSuchElementException e)
	        {			
			    System.out.println("Object Not found");			
				
	        }			
		wd.findElement(By.xpath(prop.getProperty("Register/SignIn"))).click();
		wd.findElement(By.xpath(prop.getProperty("CreateAccount")));
		
		
	}	
}
	
	
	


