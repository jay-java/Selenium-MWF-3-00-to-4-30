package Interface;
//interface->interface is same as class but not class
//we can create reference of interface but cannot 
//	create object of interface
//class ->  class ==> extends
//interface -> interface ==>extends
//interface ->  class ==>implements
interface inter1{
	public void interface1();
	public static void staticInINter1() {
		System.out.println("static in interface 1");
	}
}
interface inter2 extends inter1{
	public void interface2();
}
interface inter3{
	public void interrface3();
}
class interCall implements inter2,inter3{

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}

	@Override
	public void interrface3() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		System.out.println("interface 3");
	}
	
}
public class IntefaceCall {
	public static void main(String[] args) {
		interCall i = new interCall();
		i.interface1();
		i.interface2();
		i.interrface3();
		inter1.staticInINter1();
	}
}
