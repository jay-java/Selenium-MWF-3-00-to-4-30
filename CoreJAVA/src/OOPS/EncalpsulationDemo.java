package OOPS;

import java.util.Scanner;

class Student {
	private int id;
	private String name;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name;
	}
}

public class EncalpsulationDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id : ");
		int id = sc.nextInt();
		System.out.println("enter name : ");
		String name = sc.next();
		s1.setId(id);
//		s1.id = 13;
		s1.setName(name);
		System.out.println(s1);
	}
}
