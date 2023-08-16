package shopping;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class User {
	@Test
	public void createAccount() {
		System.out.println("create user test");
	}
	@Test(groups = "purchase")
	public void login() {
		System.out.println("login test");
	}
	@Test(groups = "smoke")
	public void profilemange() {
		System.out.println("profile teset");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
	
}
