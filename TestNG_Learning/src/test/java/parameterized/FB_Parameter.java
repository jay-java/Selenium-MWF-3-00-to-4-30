package parameterized;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FB_Parameter {
	static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = new DriverConnection().getConnection(url);
	}
	
	@Test(dataProvider = "dp")
	public void loginTest(String email,String password) {
		WebElement emailele = driver.findElement(By.id("email"));
		emailele.clear();
		emailele.sendKeys(email);
		WebElement passele = driver.findElement(By.id("pass"));
		passele.clear();
		passele.sendKeys(password);
	}
	
	@DataProvider(name="dp")
	public Object[][] passData() {
		Object o[][] = new Object[4][2];
		o[0][0] = "incorrect@gmail.com";
		o[0][1] = "incorrect";
		
		o[1][0] = "correct@gmail.com";
		o[1][1] = "incorrect";
		
		o[2][0] = "incorrect@gmail.com";
		o[2][1] = "correct";
		
		o[3][0] = "correct@gmail.com";
		o[3][1] = "correct";
		
		return o;
	}
}
