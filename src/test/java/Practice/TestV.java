package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestV {

	@Test(dependsOnMethods = "Listner2")
	public void Listner1() {
		System.out.println("Listner : Failed");
		Assert.assertTrue(false);
	}

	@Test
	public void Listner2() {
		System.out.println("Listner : Passed");
		Assert.assertTrue(true);
	}
	
	@Test
	public void Listner3() {
		System.out.println("Listner : Passed");
		Assert.assertTrue(true);
	}

}
