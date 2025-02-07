package Practice;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestIV implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");
	}

}
