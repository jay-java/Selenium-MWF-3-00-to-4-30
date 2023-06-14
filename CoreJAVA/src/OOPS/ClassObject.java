package OOPS;

import java.util.Scanner;

//OOPS->Object Oriented Programming System/Structure
//1.class->structure in which we can have member function and variables
//2.object->instance of class
//3.Inheritance->to access property of one class to another class
//		 5 types -> 1.single,2.multilevel,3.multiple,4.hierarchical,5.hybrid
//4.polymorphism-> poly(many) morphism(forms)
//				->same method name having different functionalities
//	         2 types -> 1.compiletime(overloading), 2.runtime(overriding)
//5.Abstraction->hiding internal details and 
//					showing only essential information to user
//6.Encapsulation->To wrapping up data into single unit
class EncapsulationDemo{
	private int id;
	private String name;
	private double salary;
	public void setID(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" salary : "+salary;
	}
}
public class ClassObject {
	public static void main(String[] args) {
		EncapsulationDemo e1 = new EncapsulationDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id : ");
		int id = sc.nextInt();
		e1.setID(id);
//		System.out.println(e1.getId());
		System.out.println("enter name : ");
		String name = sc.next();
		e1.setName(name);
//		System.out.println(e1.getName());
		System.out.println("enter salary : ");
		double salary = sc.nextDouble();
		e1.setSalary(salary);
//		System.out.println(e1.getSalary());
		System.out.println(e1);
	}
}
