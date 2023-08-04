package shopping;

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
	@Test
	public void profilemange() {
		System.out.println("profile teset");
	}
}
