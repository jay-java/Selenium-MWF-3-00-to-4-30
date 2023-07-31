package juni_test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class T007_Parameterized {
	int a,b,res;
	
	public T007_Parameterized(int a, int b, int res) {
		super();
		this.a = a;
		this.b = b;
		this.res = res;
	}

	@Test
	public void calcTest() {
		Calc c = new Calc();
		int result = c.add(a, b);
		assertEquals(result, res);
	}
	
	@Parameters
	public static List<Object[]> getData() {
		Object obj[][] = new Object[4][3];
		
		obj[0][0] = 10;
		obj[0][1] = 20;
		obj[0][2] = 30;
		
		obj[1][0] = 1;
		obj[1][1] = 2;
		obj[1][2] = 3;
		
		obj[2][0] = 40;
		obj[2][1] = 50;
		obj[2][2] = 90;
		
		obj[3][0] = 120;
		obj[3][1] = 220;
		obj[3][2] = 30;
		
		return Arrays.asList(obj);
	}
	
}
