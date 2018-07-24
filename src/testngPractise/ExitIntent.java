package testngPractise;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import java.awt.*;




public class ExitIntent {

   
    @Test
	public void EI() throws AWTException, InterruptedException
   {
    	 System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://10.0.31.161:9292/");
	 driver.findElement(By.linkText("Exit Intent")).click();
	 Thread.sleep(3000);
	 Actions action = new Actions(driver);
	 action.moveByOffset(600,-1).build().perform();
	 Robot robot = new Robot();
	 robot.mouseMove(1,-1);
	 Thread.sleep(1000);


	 //Alert alert = driver.switchTo().alert();
	 //String msg= alert.getText();
	 //System.out.println(msg);
     
	 String myWindowHandle = driver.getWindowHandle();
	 driver.switchTo().window(myWindowHandle);
	 String str = driver.findElement(By.xpath("//div[@class=modal]")).getText();
	 
	 System.out.println(myWindowHandle);
	 System.out.println(str); 
	 
	 
	  
   
   }
   
	
	
	
	
	
	
}
