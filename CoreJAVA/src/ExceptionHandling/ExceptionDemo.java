package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

//exception->is abnormal situation occurs at runtime
//2 types -> 1.checked 2. unchecked
//		as per oracle 3. error
//to handle exception we are having 5 keywords
//1.try 2.catch 3.finally 4.throw 5.throws

class Divide{//devarsh
	public void division() throws ArithmeticException,InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		if(b<0) {
			throw new ArithmeticException();
		}
		int c =a/b;
		System.out.println(c);
		
	}
}

public class ExceptionDemo {//sukh
	public static void main(String[] args) {
		try {
			Divide d = new Divide();
			d.division();
		} catch (ArithmeticException e) {
			System.out.println("number cannot divide by zero");
		}
		catch(InputMismatchException e) {
			System.out.println("number cannot divide by string value");
		}
		
		
		
		
		
		
		
		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter a = ");
//			int a = sc.nextInt();
//			System.out.println("enter b = ");
//			int b = sc.nextInt();
//			int c =a/b;
//			System.out.println(c);
//			System.exit(12);
//		} catch (ArithmeticException e) {
////			System.out.println("error");
//			System.out.println("number cannot divide by zero");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("number cannot divide by string value");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("this will execute everytime");
//		}
	}
}
