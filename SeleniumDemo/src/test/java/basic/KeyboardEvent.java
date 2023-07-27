package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//AJAX -> asynchronous javascript and XML
public class KeyboardEvent {
	public static void main(String[] args) {
		WebDriver driver = DriverConnection.createConnection("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT)
			   .sendKeys("learn java")
			   .keyUp(Keys.SHIFT)
			   .pause(Duration.ofSeconds(2))
			   .sendKeys(Keys.ARROW_DOWN)
			   .sendKeys(Keys.ENTER)
			   .build().perform();
	}

}
