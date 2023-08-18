package dependency;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void login() {
//		assertFalse(true);
		System.out.println("login test");
	}
	@Test(dependsOnMethods = "login")
	public void home() {
		System.out.println("home test");
	}
	@Test(dependsOnMethods = "home")
	public void logout() {
		System.out.println("logout test");
	}
}
