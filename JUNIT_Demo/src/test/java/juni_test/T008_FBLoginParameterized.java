package juni_test;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(Parameterized.class)
public class T008_FBLoginParameterized {
	String email,password;
	
	public T008_FBLoginParameterized(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	static WebDriver driver;
	@BeforeClass
	public static void openBrowser() {
		driver = DriverConnection.createConnection("https://www.facebook.com/");
	}
	
	@Test
	public void loginTest() {
		WebElement emailele = driver.findElement(By.id("email"));
		emailele.clear();
		emailele.sendKeys(email);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.clear();
		pass.sendKeys(password);
	}
	@Parameters
	public static List<Object[]> getData(){
		Object o[][] = new Object[4][2];
		
		o[0][0] = "invalid@gmail.com";
		o[0][1] = "invalid";
		
		o[1][0] = "invalid@gmail.com";
		o[1][1] = "valid";
		
		o[2][0] = "valid@gmail.com";
		o[2][1] = "invalid";
		
		o[3][0] = "valid@gmail.com";
		o[3][1] = "valid";
		
		return Arrays.asList(o);
	}
}
