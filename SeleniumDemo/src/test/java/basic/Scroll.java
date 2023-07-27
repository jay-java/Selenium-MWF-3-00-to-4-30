package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {
	public static void main(String[] args) {
		WebDriver driver = DriverConnection.createConnection("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//scrollby pixels
//		js.executeScript("window.scrollBy(0,150)");
		
		//scroll by element
		//WebElement btn = driver.findElement(By.id("uploadPicture"));
		//js.executeScript("arguments[0].scrollIntoView();", btn);
		
		//SCROLL TO END
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		driver.findElement(By.id("uploadPicture")).click();
	}
}
