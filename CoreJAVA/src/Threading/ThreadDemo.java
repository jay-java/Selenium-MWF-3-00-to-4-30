package Threading;
//thread->is smallest unit of process.
//		at a time we can achieve only single thread
//we can achieve thread by two ways
//1.Thread class
//2.Runnable interface
//better way to achieve thread is runnable interface
class runnbaleDemo implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("runnable : "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadDemo {
	public static void main(String[] args) {
		runnbaleDemo r =  new runnbaleDemo();
		r.run();
		Thread t = new Thread();
		System.out.println(t);
		t.setName("MyThread");
		System.out.println(t);
		for(int i=1;i<=5;i++) {
			System.out.println(t+" : "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
