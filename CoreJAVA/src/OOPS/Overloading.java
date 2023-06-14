package OOPS;
class Overload{
	public void addition(int i, int j) {
		System.out.println("addition"+(i+j));
	}
	public void addition(int i, int j,int k) {
		System.out.println("addition"+(i+j+k));
	}
	public void addition(String name) {
		System.out.println("addition"+name);
	}
}
public class Overloading {
	public static void main(String[] args) {
		Overload o =new Overload();
		o.addition(1,2);
	}
}
