package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFrameHandle {
	public static void main(String[] args) {
		String url="https://demoqa.com/frames";
		WebDriver driver = DriverConnection.createConnection(url);
		
		List<WebElement> frames =  driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		WebElement f1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(f1);
		
		WebElement element =  driver.findElement(By.id("sampleHeading"));
		String data = element.getText();
		System.out.println(data);
		
//		for(WebElement ele : frames)
//		{
//			System.out.println(ele.getAttribute("src"));
//		}
	}
}
