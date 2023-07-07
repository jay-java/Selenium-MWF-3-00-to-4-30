package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		String expectedTitle = "Facebook Login";
		String actualTitle = driver.getTitle();
		System.out.println(expectedTitle);
		System.out.println(actualTitle);
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}
		WebElement btn = driver.findElement(By.linkText("Create new account"));
		btn.click();

//		*[@id="email"]
//		#email
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("selenium");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("selenium");
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("selenium@gmail.com");
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("selenium123");

		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("10");
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByValue("4");
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByIndex(5);
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(0).click();
		
	}
}
