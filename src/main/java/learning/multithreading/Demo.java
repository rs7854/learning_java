package learning.multithreading;

import learning.multithreading.exp1.A;
import learning.multithreading.exp1.B;

public class Demo {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("mainMethod  starting.." + Thread.currentThread().getName());
		
		A tA = new A();
		Thread t1 = new Thread(tA);
		 B tB = new B();
		
		 t1.start();
		 t1.join();
		 tB.start();
		
		
		 t1.setPriority(1);
		 tB.setPriority(10);
		
		

	}
}
