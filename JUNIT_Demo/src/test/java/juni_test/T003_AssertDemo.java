package juni_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class T003_AssertDemo {
	@Test
	public void test() {
//		assertEquals(1, 2);
//		assertFalse(true);
		assertTrue(true);
		assertNotNull(123);
		assertNull("java");
	}
}
