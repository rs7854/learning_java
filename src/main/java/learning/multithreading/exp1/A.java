package learning.multithreading.exp1;

public class A implements Runnable {

	@Override
	public void run() {
		
		System.out.println("START OF THE A1st THREAD:" + Thread.currentThread().getName());
		for (int i = 1; i <= 50; i++) {
			System.out.println(5 + " * " + i + " = " + (i * 5) +" " +Thread.currentThread().getName());
		}
		
//		System.out.println("END OF THE A1st THREAD");
	}

}
