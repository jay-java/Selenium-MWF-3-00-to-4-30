package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email  = driver.findElement(By.id("email"));
		email.sendKeys("selenium@gmail.com");
		WebElement password  = driver.findElement(By.id("pass"));
		password.sendKeys("1234");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
//		driver.close();
	}
}
