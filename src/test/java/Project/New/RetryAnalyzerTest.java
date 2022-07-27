package Project.New;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerTest implements IRetryAnalyzer {
	
	int count=0;
	int maxcount=2;

	@Override
	public boolean retry(ITestResult result) {
		
		if(count<maxcount) {
			System.out.println("Retrying " +result.getName()   +"again and count is " +(count+1));
			count++;
			return true;
			
		}

		
		return false;
	}
	
}
