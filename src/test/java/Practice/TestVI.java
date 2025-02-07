package Practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestVI {

	@Parameters({"fname","lname"})
    @Test
	public void test(String s, String a) {
		System.out.println(s + " " + a);
	}

}
