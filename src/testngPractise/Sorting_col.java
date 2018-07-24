package testngPractise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.StringBuffer;


public class Sorting_col {
	
	@Test
	public void sortCheck() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		wd.get("https://flights.makemytrip.com/makemytrip/search/O/O/E/1/0/0/S/V0/DEL_LKO_11-11-2018");
		//String loc= "//p/span[@class="num ng-binding"]";
		//List<WebElement> obtainedList= new List<WebElement>(); 
		List<WebElement> obtainedList=wd.findElements(By.xpath("//p/span[@class='num ng-binding']"));
		Thread.sleep(2000);
		System.out.print(obtainedList);
		//System.out.println("/t This was obtainedList");
		List<Integer> SortedList = new ArrayList<Integer>();
		StringBuffer sb;
		String str2;
		int val,i;
		System.out.print("Check1");
		
		for(WebElement wb:obtainedList)
		{
			String str= wb.getText();
			int ln= str.length();
			i=0;
			
			str= str.replace(",","");
			val= Integer.parseInt(str);
			SortedList.add(val); i++;
		}
		System.out.println("");
		System.out.println(SortedList);
		Collections.sort(SortedList);
		System.out.println("");
		System.out.println(SortedList);
	    String loc2= "//div/a[@id='price']";
	    wd.findElement(By.xpath(loc2)).click();
	    
	    List<WebElement> afterSort=wd.findElements(By.xpath("//p/span[@class='num ng-binding']"));
	    
	    int cap=afterSort.size();
	    int flag=0;
	    
	    for(int j=0;j<=cap;j++)
	    {
	    
	    }
	    
	    		
			
			
//			while(i<ln)
//			{
//				System.out.print("Inside while");
//				
//				
//				
//				
//				if(str.charAt(i)==',')
//				{
//					
//					
//					System.out.print("check2");
//					sb=new StringBuffer(str);
//					sb.deleteCharAt(i);
//					str2=sb.toString();
//					val= Integer.parseInt(str2);
//					SortedList.add(val); i++;
//					break;
//				}
//				System.out.println(SortedList);					
//			}
//						
//		}
//				
//		System.out.print(SortedList);
//		
		
	}
	

}
