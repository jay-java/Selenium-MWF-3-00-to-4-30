package shopping;

import org.testng.annotations.Test;

public class Payment {
	@Test
	public void cod() {
		System.out.println("cod test");
	}
	@Test(groups = {"purchase","smoke"})
	public void creditCart() {
		System.out.println("credit card test");
	}
	@Test
	public void debitCart() {
		System.out.println("debit card test");
	}
}
