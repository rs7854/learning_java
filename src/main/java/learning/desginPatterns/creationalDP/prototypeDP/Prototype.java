package learning.desginPatterns.creationalDP.prototypeDP;

public class Prototype {
	
	 public static void main (String[] args)
	    {
	        ColorStore.getColor("Blue").addColor();
	        ColorStore.getColor("Black").addColor();
	        ColorStore.getColor("Black").addColor();
	        ColorStore.getColor("Blue").addColor();
	    }

}
