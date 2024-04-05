package learning.multithreading.exp1;

public class B extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();

		System.out.println("START OF THE B1st THREAD:" + Thread.currentThread().getName());
		for (int i = 51; i <= 100; i++) {
			System.out.println(5 + " * " + i + " = " + (i * 5)+" "+Thread.currentThread().getName());
		}
//		System.out.println("END OF THE B THREAD");
	}
}
