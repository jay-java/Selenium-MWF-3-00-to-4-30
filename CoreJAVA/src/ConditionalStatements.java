 import java.util.Scanner;

//1.simple if
//2.if else
//	3.nested if
//	4.else if ladder
//	5.switch case
public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
//		1.simple if
		if (a > b) {
			System.out.println("a is greater than b");
		}

		// 2.if else
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		// 3.nested if
		System.out.println("enter age : ");
		int age = sc.nextInt();
		if (age > 18) {
			if (age < 60) {
				System.out.println("eligible");
			} else {
				System.out.println("age is greater than 18 but not less than 60");
			}
		} else {
			System.out.println("age is less than 18");
		}

		/// 4.else if ladder
		System.out.println("enter marks : ");
		int per = sc.nextInt();
		if (per < 35) {
			System.out.println("fail");
		} else if (per >= 35 && per <= 50) {
			System.out.println("pass class");
		} else if (per >= 51 && per <= 70) {
			System.out.println("C grade");
		} else if (per >= 71 && per <= 80) {
			System.out.println("B grade");
		} else if (per >= 81 && per <= 90) {
			System.out.println("A grade");
		} else if (per >= 91 && per <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("invalid input");
		}
		
//		int r = 13;
//		if(r>=11 && r<=15) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}

		// 5.switch case
		System.out.println("1.english");
		System.out.println("2.hindi");
		System.out.println("3.gujarati");
		System.out.println("enter your choice : ");
		int lang = sc.nextInt();
		switch (lang) {
		case 1:
			System.out.println("you selected english");
			break;
		case 2:
			System.out.println("you selected hindi");
			break;
		case 3:
			System.out.println("you selected gujarati");
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
