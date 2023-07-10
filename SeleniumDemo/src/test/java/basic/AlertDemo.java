package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		String url="https://demoqa.com/alerts";
		WebDriver driver = DriverConnection.createConnection(url);
		//1.
//		driver.findElement(By.id("alertButton")).click();
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
		//2.
//		driver.findElement(By.id("timerAlertButton")).click();
//		Thread.sleep(6000);
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.findElement(By.id("timerAlertButton")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//3.
//		driver.findElement(By.id("confirmButton")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
		
		//4.
//		driver.findElement(By.id("promtButton")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("hello alert");
//		alert.accept();
	}
}
