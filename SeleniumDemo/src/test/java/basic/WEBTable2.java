package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WEBTable2 {
	public static void main(String[] args) {
		String url = "https://cosmocode.io/automation-practice-webtable/";
		WebDriver driver  = DriverConnection.createConnection(url);
		List<WebElement> heading = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td"));
		System.out.println(heading.size());
		for(WebElement s:heading) {
			System.out.print(s.getText()+" ");
		}
		System.out.println();
		List<WebElement> data = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
		System.out.println("data size : "+data.size());
		for(int i=2;i<=data.size();i++) {
			List<WebElement> tr = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td"));
			for(int j=2;j<=tr.size();j++) {
				List<WebElement> td = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td["+j+"]"));
				for(WebElement text:td) {
					System.out.print(text.getText()+" ");
				}
			}
			System.out.println();
		}
	}
}
