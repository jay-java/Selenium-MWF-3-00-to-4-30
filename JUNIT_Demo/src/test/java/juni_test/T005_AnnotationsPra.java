package juni_test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T005_AnnotationsPra {
	
	static WebDriver driver = null;
	@BeforeClass
	public static void openBrowser() {
		driver  = DriverConnection.createConnection("https://www.facebook.com/");
	}
	
	@Test
	public void checkTitle() {
		assertEquals("facebook log in page", driver.getTitle());
	}
	@Test
	public void checkLogin() {
		driver.findElement(By.id("email")).sendKeys("java@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("java@123");
		driver.findElement(By.name("login")).click();
	}
	
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
		driver.close();
	}
}
