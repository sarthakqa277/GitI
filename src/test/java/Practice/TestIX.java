package Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestIX {

	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("@BeforeMethod");
	}
	
	@Test
	public void Test5() {
		System.out.println("TestIX:Test5");
	}

	@Test
	public void Test6() {
		System.out.println("TestIX:Test6");
	}

	@AfterMethod()
	public void afterMethod()
	{
		System.out.println("@AfterMethod");
		
	}
	
}
