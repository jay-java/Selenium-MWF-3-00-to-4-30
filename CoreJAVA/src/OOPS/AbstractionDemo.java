package OOPS;

abstract class RBI{
 	abstract public void interest();//abstract method
	abstract public void HL();
	public static void callStataic() {
		System.out.println("static in abstract class");
	}
}
class SBI extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("sbi interest : 5%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("sbi HL : 7%");
	}
	
}
class JAVA extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("java interset : 8%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("java HL : 6%");
	}
}
public class AbstractionDemo {
	public static void main(String[] args) {
		SBI s= new SBI();
		s.interest();
		s.HL();
		s.callStataic();
		JAVA j = new JAVA();
		j.interest();
		j.HL();
	}
}
