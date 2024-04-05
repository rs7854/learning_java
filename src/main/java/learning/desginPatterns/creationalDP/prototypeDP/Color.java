package learning.desginPatterns.creationalDP.prototypeDP;

public abstract class Color implements Cloneable{
	
	protected String colorName;
	
	abstract void addColor();
	
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		}catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
	return clone;	
	}
	

}
