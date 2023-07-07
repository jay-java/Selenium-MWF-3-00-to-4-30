package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FetchTableData {
	public static void main(String[] args) {
		String url="https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.createConnection(url);
//		WebElement name = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]"));
//		String data = name.getText();
//		System.out.println(data);
		
		List<WebElement> header = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]"));
		for(WebElement s :header) {
			System.out.println(s.getText());
		}
		
	}
}
