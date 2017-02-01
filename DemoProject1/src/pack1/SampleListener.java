package pack1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleListener implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Has Started Sucessfully");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Has Completed Sucessfully");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Has Failed ");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Has Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
