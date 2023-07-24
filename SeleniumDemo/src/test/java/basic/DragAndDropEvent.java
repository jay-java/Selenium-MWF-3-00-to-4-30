package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEvent {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverConnection.createConnection("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement myFrame = driver.findElement(By.xpath("//*[@class='resp-tabs-container']/div[1]/p/iframe"));
		Thread.sleep(2000);
		driver.switchTo().frame(myFrame);
		
		WebElement from = driver.findElement(By.xpath("//*[@id='gallery']/li[1]/img"));
		WebElement to = driver.findElement(By.xpath("//*[@id='trash']"));
		
		Actions actions = new Actions(driver);
		Action a1 = actions.clickAndHold(from).moveToElement(to).build();
		a1.perform();
		Thread.sleep(2000);
		driver.close();
	}
}
