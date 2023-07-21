package basic;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalenderDate {
	public static void main(String[] args) {
		String url = "https://www.globalsqa.com/demo-site/datepicker/";
		WebDriver driver = DriverConnection.createConnection(url);
		WebElement ele = driver.findElement(By.xpath("//*[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(ele);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		driver.findElement(By.id("datepicker")).click();
		String myDate = "1";
		String myMonth = "April";
		String myYear = "2000";
//		String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
//		System.out.println(currentMonth);
		String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		System.out.println(currentYear);
		int y1 = Integer.parseInt(myYear);// 2000
		int y2 = Integer.parseInt(currentYear);// 2023
		while (!myYear.equals(driver.findElement(By.className("ui-datepicker-year")).getText())) {
			if (y1 < y2) {
				driver.findElement(By.xpath("//*[@data-handler='prev']/span")).click();
			} else {
				driver.findElement(By.xpath("//*[@data-handler='next']/span")).click();
			}
		}

		while (!myMonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText())) {
			driver.findElement(By.xpath("//*[@data-handler='prev']/span")).click();
		}

		List<WebElement> dates = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for (WebElement date : dates) {
			String dt = date.getText();
			if (dt.equals(myDate)) {
				date.click();
			}
		}
	}
}
