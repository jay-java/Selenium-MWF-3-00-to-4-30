package testng;

import org.testng.annotations.Test;

public class TestNG_basic {
	@Test(priority = 4)
	public void test1() {
		System.out.println("test 1 running");
	}

	@Test(priority = 1)
	public void createAccoutn() {
		System.out.println("create account test");
	}

	@Test(priority = 2,expectedExceptions = ArithmeticException.class)
	public void login() {
		int i=10;
		int j = i/0;
		System.out.println("login test");
	}
	@Test(priority = 3)
	public void alpha() {
		System.out.println("alpha test");
	}
}
