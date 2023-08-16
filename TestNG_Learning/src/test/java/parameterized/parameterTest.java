package parameterized;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterTest {
	@Parameters({"uname","pass"})
	@Test
	public void test(String uname,String pass) {
		String url="https://www.facebook.com/";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}
}
