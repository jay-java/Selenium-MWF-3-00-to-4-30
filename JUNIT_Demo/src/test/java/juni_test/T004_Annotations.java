package juni_test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class T004_Annotations {
	@Test
	public void test1() {
		System.out.println("test 1 running");
	}
	@Test
	public void test2() {
		System.out.println("test 2 running");
	}
	@Before
	public void beforeTest() {
		System.out.println("before test");
	}
	@After
	public void afterTest() {
		System.out.println("after test");
	}
	static WebDriver driver = null;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
		driver  = DriverConnection.createConnection("https://www.facebook.com/");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
		driver.close();
	}
}
