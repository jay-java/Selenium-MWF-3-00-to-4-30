import java.util.Scanner;

//array->group of elements of same datatype into single variable
public class ArrayDemo {
	public static void main(String[] args) {
//		int date[] = {1,2,3,4,5,6,7,8,9,10,11};
//		for(int index=0;index<date.length;index++) {
//			System.out.println(date[index]);
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		int sum=0;
		for(int index=0;index<arr.length;index++) {
			System.out.print("enter value at arr["+index+"] : ");
			arr[index] = sc.nextInt();
			sum = sum+arr[index];
			System.out.println("sum = "+sum);
		}
		System.out.println("overall sum = "+sum);
		
		System.out.print("enter number to search in array : ");
		int n = sc.nextInt();
		int counter=0;
		for(int index=0;index<arr.length;index++) {
			if(n == arr[index]) {
				counter++;
			}
		}
		System.out.println(n+" is exists "+counter+" times");
		if(counter>0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
