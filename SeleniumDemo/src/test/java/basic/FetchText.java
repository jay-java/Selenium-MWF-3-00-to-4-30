package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FetchText {
	public static void main(String[] args) {
		String url="https://demoqa.com/frames";
		WebDriver driver = DriverConnection.createConnection(url);
		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());
	}
}
