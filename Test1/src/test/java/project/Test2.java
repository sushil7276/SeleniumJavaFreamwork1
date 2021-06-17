package project;

import org.testng.annotations.Test;

public class Test2 {

	@Test(invocationCount = 6, threadPoolSize = 3)
	public void Test1() {
		
		System.out.println("Test 1 - Thread ID = "+ Thread.currentThread().getId());
	}
}
