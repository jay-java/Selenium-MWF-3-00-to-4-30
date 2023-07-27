package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.naming.directory.DirContext;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {
	public static void main(String[] args) {
		WebDriver driver = DriverConnection.createConnection("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("java");
		driver.findElement(By.id("lastName")).sendKeys("selenium");
		driver.findElement(By.id("userEmail")).sendKeys("java@gmail.com");
		List<WebElement> list = driver.findElements(By.className("custom-control-label"));
		System.out.println(list.size());
		list.get(0).click();
		driver.findElement(By.id("userNumber")).sendKeys("9876543210");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement date = driver.findElement(By.id("dateOfBirthInput"));
		js.executeScript("arguments[0].scrollIntoView();", date);
		
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\jay-pc\\Downloads\\google.png");
	}
}
