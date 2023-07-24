package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePicketTrigger {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverConnection.createConnection("https://www.globalsqa.com/demo-site/datepicker/#Icon%20Trigger");
		driver.findElement(By.id("Icon Trigger")).click();
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='resp-tabs-container']/div[3]/p/iframe"));
		Thread.sleep(2000);
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='ui-datepicker-trigger']")).click();
	}
}
