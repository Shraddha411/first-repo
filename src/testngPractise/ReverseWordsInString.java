package testngPractise;
import org.testng.annotations.*;

public class ReverseWordsInString {
	
	@Test
	public void Reverse()
	{
		
		String str="What's My Name ?";
		str=str+" ";
		int pointer= str.length()-1;
		String rev= "";
        
		
		for(int j=str.length()-1;j>=0;j--)
		{
			  
			if(str.charAt(j)==' '|| j==0)
			{
				if(j==pointer+1)
				{
				rev=rev+str.charAt(j+1);
				}
				
				else
				{
				if(j>0 & pointer>j)
				rev=rev+str.substring(j+1,pointer);
				
				else if(j==0)
				rev=rev+str.substring(j,pointer);
				}
				
				rev=rev+" ";
							
				pointer=j;
				
				
			}
			
					
		}
		
		System.out.println(rev);
	
		
		
		
	}

}
