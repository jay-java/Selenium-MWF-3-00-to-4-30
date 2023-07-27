package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PartialLinkText {
	public static void main(String[] args) {
		WebDriver driver = DriverConnection.createConnection("https://www.facebook.com/");
//		driver.findElement(By.linkText("Create new account")).click();
		List<WebElement> list = driver.findElements(By.partialLinkText("Create"));
		System.out.println(list.size());
		list.get(0).click();
		for(WebElement ele:list) {
			System.out.println(ele.getText());
		}
	}
}
