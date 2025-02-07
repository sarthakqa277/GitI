package Practice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestVIII {
	
	

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("@BeforeSuite");
	}

	@Test
	public void Test3() {
		System.out.println("TestVIII:Test3");
	}

	@Test
	public void Test4() {
		System.out.println("TestVIII:Test4");
	}

	
	@AfterSuite
	public void afterSuit() {
		System.out.println("@AfterSuite");
	}

	
}
