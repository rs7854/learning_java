package learning.desginPatterns.creationalDP.factoryDP;

import learning.desginPatterns.structuralDP.decoratorDP.Shape;

public class Driver {
	
	
	public static void main(String[] args) {
			
		ShapeFactory sf = new ShapeFactory();
		Shape shape = sf.getInstance("Triangle");
		shape.draw();
		
	}
	

}
