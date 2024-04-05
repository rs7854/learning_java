package learning.desginPatterns.creationalDP.singeltonDP;

public class Singleton {
	
//	Method 1 � Classic Implementation || Make getInstance() static to implement Singleton Method Design Pattern
	
	private static Singleton obj;
	private Singleton() {}
    public static Singleton getInstance1()
    {
        if (obj == null)
            obj = new Singleton();
        return obj;
    }
	
	
	//Method 2 || Make getInstance() synchronized to implement Singleton Method Design Pattern
	
	private static Singleton obj2;
//	private Singleton() {}; // make Constructor private
	public static synchronized Singleton getInstance2() {
		if(obj2 == null) obj2 = new Singleton();
		return obj2;
	}
	
	
//	Method 3 � Eager Instantiation || Static initializer based implementation of singleton design pattern
	
	private static Singleton obj3 = new Singleton();
//	private Singleton() {};
	public static Singleton getInstance3() { return obj3; }
	
	
//	Method 4 � Most Efficient || Use �Double Checked Locking� to implement singleton design pattern
	
	private volatile static Singleton obj4;
//	private Singleton() {};
	public static Singleton getInstance4() 
	{
		if(obj4==null) {
			synchronized (Singleton.class) {
				if(obj4==null) obj4 = new Singleton();
			}
		}
		return obj4;
	}
	
	
	

}
