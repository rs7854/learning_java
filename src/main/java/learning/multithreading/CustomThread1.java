package learning.multithreading;

public class CustomThread1 extends Thread{
	
	public CustomThread1(String string) {
			}

	public CustomThread1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		super.run();
		for(int i=0;i<10;i++) {
			System.out.println("custom thread running..."+ Thread.currentThread().getName());
	
		}
		
	}

}
