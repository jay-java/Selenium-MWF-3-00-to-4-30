import java.util.Scanner;

//two types
//1.primitive - byte,short,int,long,float,double,boolean,char
//2.non-primitive - string,array,class
//variable -> token or container in which we can store values
class A{
	public void run() {
		System.out.println("run method called");
	}
}
public class Datatyoes {
	public static void main(String[] args) {
		byte b = 127;
		System.out.println(b);
		short s= 32767;
		System.out.println(s);
		int i = 2147483647;
		System.out.println(i);
		long l = 9223372036854775807l;
		System.out.println(l);
		float f = 3.144567568765865f;
		System.out.println(f);
		double d  = 3.1245675765;
		System.out.println(d);
		boolean isValid = false;
		System.out.println(isValid);
		char c = 'd';
		System.out.println(c);
		int a= 1,q=2,w=3,e=4;
		int r = a+q;
//		concatination
		System.out.println("addition of a and q = "+r);
		Scanner sc  = new Scanner(System.in);
		System.out.print("enter radiu of circle : ");
		int r1 = sc.nextInt();
		double d1 = Math.PI;
		double area = Math.PI*(r1*r1);
		System.out.println(area);
		A obj = new A();
		obj.run();
	}
}
