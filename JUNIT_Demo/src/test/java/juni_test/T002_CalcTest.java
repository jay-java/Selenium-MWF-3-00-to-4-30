package juni_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class T002_CalcTest {
	@Test
	public void calcTest() {
		Calc c = new Calc();
		int res = c.add(12, 20);
		assertEquals(40, res);
	}
}
