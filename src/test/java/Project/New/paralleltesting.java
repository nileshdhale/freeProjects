package Project.New;

import org.testng.Assert;
import org.testng.annotations.Test;

public class paralleltesting {
	
	@Test(retryAnalyzer=RetryAnalyzerTest.class)
	public void testcase1() {
		System.out.println("Test case 1");
		Assert.assertTrue(false);
		
	}
	@Test
	public void testcase2() {
		System.out.println("Test case 2");
		Assert.assertTrue(true);
	}


}
