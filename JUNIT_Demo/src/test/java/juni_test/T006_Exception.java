package juni_test;

import org.junit.Test;

public class T006_Exception {
	@Test(expected = ArithmeticException.class)
	public void test1() {
		int i = 0;
		int j = 10 / i;
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test2() {
		int a[] = new int[5];
		a[6] = 10;
	}
}
