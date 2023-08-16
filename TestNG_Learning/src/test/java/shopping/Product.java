package shopping;

import org.testng.annotations.Test;

public class Product {
	@Test(groups = "purchase")
	public void addtoCart() {
		System.out.println("add to cart test");
	}
	@Test
	public void wishList() {
		System.out.println("wishlist test");
	}
	@Test(groups = "smoke")
	public void removeCart() {
		System.out.println("remove cart test");
	}
	@Test
	public void editProduct() {
		System.out.println("edit prodduct test");
	}
}
