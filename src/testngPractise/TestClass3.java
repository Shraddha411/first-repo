package testngPractise;
import org.testng.annotations.*;



public class TestClass3 {
		
	@Test (groups = {"grp1","grp2"} )
	public void testGroup1()
	{
		
	System.out.println("In group 1 and 2");
		
	}

	@Test (groups = {"grp1"} )
	public void testGroup2()
	{
		
	System.out.println("In group 1");
		
	}
	
	@Test (groups = {"grp2"} )
	public void testGroup3()
	{
		
	System.out.println("In group 2");
	}
	
	@Test
	public void testGroup4()
	{
		
	System.out.println("No group assigned");
	}
	
}
