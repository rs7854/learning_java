package learning.desginPatterns.creationalDP.prototypeDP;

public class BlueColor extends Color{
	
	 public BlueColor() 
	    {
	        this.colorName = "Blue";
	    }

	@Override
	void addColor() {
		System.out.println("Blue color Added");
	}

}
