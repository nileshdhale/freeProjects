package Project.New;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

	@Override 
	public void onTestStart(ITestResult result) {
		System.out.println("Test Method " +result.getName() +"starts");
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Method " +result.getName() +"passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		System.out.println("Test Method " +result.getName() +"failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Method " +result.getName() +"skipped");
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Test  " +context.getName() +" starts");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test  " +context.getName() +" ends");
	
		
	}
	

}
