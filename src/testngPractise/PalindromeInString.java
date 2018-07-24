package testngPractise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.*;
import java.util.List;
import java.util.ArrayList;


public class PalindromeInString {
	
	
	@Test
	public void pal()
	{
		String str="egmadamlkds";
		int len= str.length();
		int ctr=0;
		int ctr2=0;
		int points=0;
		int pointl=len-1;
		System.out.println(len);
		//List<Character> pal= new ArrayList<Character>(10);
		char arr[]=new char[len];
		
		for (ctr=0;ctr<len;ctr++)
		{
			points=ctr;
			
			for(ctr2=ctr;ctr2<len-1;ctr2++)
			{
				if(str.charAt(points)==str.charAt(pointl))
				{
					char ch1=str.charAt(points);
					char ch2=str.charAt(pointl);
					
					//pal.add(points,ch1);
					//pal.add(pointl,ch2);
					arr[points]=ch1;
					arr[pointl]=ch2;
					points++;
					pointl--;
					
				}
				
				if(points==pointl)
				{
					//pal.add(points,str.charAt(points));
					arr[points]=str.charAt(points);
				}
				
				
				if(str.charAt(points) !=str.charAt(pointl))
				{					
					pointl--;
				}
				
										
     		}
			
			pointl=len-1;
						
		}
		
		System.out.println(arr);
		
			
		
	}
	
		

}
