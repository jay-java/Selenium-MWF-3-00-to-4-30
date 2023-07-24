package basic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.opentelemetry.api.internal.Utils;

public class ScreenShotDemo {
	public static void getScreenShot(WebDriver driver, String path) {
		TakesScreenshot ss = (TakesScreenshot) driver;

		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);

		try {
			FileUtils.copyFile(source, dest);
			System.out.println("ss taken");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		WebDriver driver = DriverConnection.createConnection("https://www.google.com/");
		getScreenShot(driver, "D:\\ScreenShot\\google.png");
	}
}
