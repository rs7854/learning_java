package learning.desginPatterns.creationalDP.singeltonDP;

public class Driver {

	public static void main(String[] args) {
		
	
	Singleton obj1 = Singleton.getInstance1();
	Singleton obj2 = Singleton.getInstance1();
	Singleton obj3 = Singleton.getInstance1();
	System.out.println("obj1: "+obj1.hashCode());
	System.out.println("obj2: "+obj2.hashCode());
	System.out.println("obj3: "+obj3.hashCode());
	
	
	}
}