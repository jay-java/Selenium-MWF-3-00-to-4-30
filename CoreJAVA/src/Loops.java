import java.util.Scanner;

//1.for(initialization;condition;incre/decre){}
//2.while(condition){}
//3.do{body} while(condition);
//4.for each
public class Loops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to print table");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
		for(int j =1;j<=100;j++) {
			if (j %2 == 0) {
				System.out.println(j);
			}
		}
		
		int a= 10,b=3;
		System.out.println(a%b);
		
		
		
		
//		System.out.println("by for loop");
//		for(int i=-5;i>=1;i--) {
//			System.out.println(i);
//		}
//		System.out.println("by while loop");
//		int j =-5;
//		while(j>=1) {
//			System.out.println(j);
//			j--;
//		}
//		System.out.println("do while");
//		int k=10;
//		do {
//			System.out.println(k);
//			k++;
//		}
//		while(k<=5);
	}
}
