package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestVII {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("@BeforeClass");
	}

	@Test
	public void test1() {
		System.out.println("TestVII:Test1");
	}

	@Test
	public void test2() {
		System.out.println("TestVII:Test2");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("@AfterClass");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("@AfterTest");
	}

	@AfterSuite
	public void afterSuit() {
		System.out.println("@AfterSuite");
	}

}
