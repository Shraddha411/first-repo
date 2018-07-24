package testngPractise;
import org.testng.annotations.*;



public class FrequencyofChar {
	
	
	@Test
	public void CountChar()
	{
		String str="Shrddha Singh";
		char ch='d';
		int ctr=0,i=0;
		int len=str.length();
		while(i<=len-1)
		{
			char temp= str.charAt(i);
			if(temp == ch)
			{
				ctr++;
			 System.out.println(i);
			} i++;
		
				
	}
	
		System.out.println("Number of times:"+ctr);
	

}
}
