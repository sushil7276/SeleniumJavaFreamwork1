package project;

import org.testng.annotations.Test;

//@Test(groups = {"TestNG"})
public class TestNG_Group {

	@Test(groups = {"sanity"})
	public void Test1() {
		System.out.println("run test 1");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void Test2() {
		System.out.println("run test 2");
	}
	
	@Test(groups = {"reg"})
	public void Test3() {
		System.out.println("run test 3");
	}
	
	@Test
	public void Test4() {
		System.out.println("run test 4");
	}
}
