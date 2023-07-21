package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task {
	public static void main(String[] args) {
		WebDriver driver = DriverConnection.createConnection("https://phptravels.com/demo/");
		String num1= driver.findElement(By.id("numb1")).getText();
		System.out.println(num1);
		String num2= driver.findElement(By.id("numb2")).getText();
		System.out.println(num2);
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		int res = n1+n2;
		String result = String.valueOf(res);
		driver.findElement(By.id("number")).sendKeys(result);
	}
}
