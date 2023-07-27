package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ByTagName {
	public static void main(String[] args) {
		WebDriver driver = DriverConnection.createConnection("https://www.facebook.com/");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(WebElement ele:list) {
			System.out.println(ele.getText());
		}
	}
}
