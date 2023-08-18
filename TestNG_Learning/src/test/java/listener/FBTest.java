package listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class FBTest {
	@Test
	public void titleCheck(ITestContext i) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jay-pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		String url = "https://www.facebook.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		i.setAttribute("mydriver", driver);
		assertEquals(driver.getTitle(), "FB");
	}
}
