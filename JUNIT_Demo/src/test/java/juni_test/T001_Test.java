package juni_test;

import org.junit.Ignore;
import org.junit.Test;

public class T001_Test {
	@Test
	public void test1() {
		System.out.println("test 1 running");
	}
	@Test
	@Ignore
	public void test2() {
		System.out.println("test 2 running");
	}
	@Test
	public void test3() {
		System.out.println("test 3 running");
	}

}
