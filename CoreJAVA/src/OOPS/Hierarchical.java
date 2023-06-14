package OOPS;

class P{
	public void parentMethod() {
		System.out.println("parent method");
	}
}
class C1 extends P{
	public void child1Method() {
		System.out.println("Child 1");
	}
}
class C2 extends P{
	public void child2Method() {
		System.out.println("Child 2");
	}
}
class C3 extends P{
	public void child3Method() {
		System.out.println("Child 3");
	}
}
public class Hierarchical {
	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.parentMethod();
		c1.child1Method();
		C2 c2 = new C2();
		c2.parentMethod();
		c2.child2Method();
		C3 c3 =new C3();
		c3.parentMethod();
		c3.child3Method();
		
	}
}
