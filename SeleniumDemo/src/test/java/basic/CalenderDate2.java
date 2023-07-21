package basic;

import java.io.FileInputStream;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionEncoder;

public class CalenderDate2 {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.globalsqa.com/demo-site/datepicker/";
		WebDriver driver = DriverConnection.createConnection(url);

		WebElement date2 = driver.findElement(By.id("DropDown DatePicker"));
		System.out.println(date2.getText());
		date2.click();

		WebElement frame = driver.findElement(By.xpath("//*[@class='resp-tabs-container']/div[2]/p/iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).click();
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
//		month.click();

		Select months = new Select(month);
		months.selectByIndex(7);
		
		WebElement years = driver.findElement(By.className("ui-datepicker-year"));
		Select year = new Select(years);
		year.selectByValue("2025");
	}
}
