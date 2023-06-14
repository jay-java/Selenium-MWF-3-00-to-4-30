package OOPS;

class Rectangle{
	final int i=1;
	public void change() {
//		i++;
		System.out.println(i);
	}
	public void Shape() {
		System.out.println("rectangle shape");
	}
}
class Circle extends Rectangle{
	public void Shape() {
		System.out.println("circle shape");
		super.Shape();
	}
}
public class Overriding {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.Shape();
		c.change();
	}
}
