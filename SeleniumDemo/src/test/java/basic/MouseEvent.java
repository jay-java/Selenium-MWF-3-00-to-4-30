package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverConnection.createConnection("https://www.amazon.in/");
		
		WebElement miniTv = driver.findElement(By.linkText("Amazon miniTV"));
		WebElement sell = driver.findElement(By.linkText("Sell"));
		WebElement bs = driver.findElement(By.linkText("Best Sellers"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(miniTv).build().perform();
		actions.moveToElement(sell).build().perform();
		actions.moveToElement(bs).build().perform();
		Thread.sleep(2000);
		driver.close();
	}
}
