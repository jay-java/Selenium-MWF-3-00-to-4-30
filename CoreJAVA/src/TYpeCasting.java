import java.util.Scanner;
//two types
//1.implicit->compiler internal changes data
//2.explicit->change by user
public class TYpeCasting {
	public static void main(String[] args) {
		int i = 1;
		System.out.println(i);
		double d = 3;
		System.out.println(d);
		double d1 = 1.1;
		int j = (int)d1;
		System.out.println("j = "+j);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		double c = (double)a/(double)b;
		System.out.println("c = "+c);
		
	}
}
