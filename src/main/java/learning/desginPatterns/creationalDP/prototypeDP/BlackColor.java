package learning.desginPatterns.creationalDP.prototypeDP;

public class BlackColor extends Color{
	
	 public BlackColor() 
	    {
	        this.colorName = "Black";
	    }

	@Override
	void addColor() {
		System.out.println("Black color Added");
	}


}
