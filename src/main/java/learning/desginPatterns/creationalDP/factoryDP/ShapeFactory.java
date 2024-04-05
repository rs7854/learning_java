package learning.desginPatterns.creationalDP.factoryDP;

import learning.desginPatterns.structuralDP.decoratorDP.Shape;

public class ShapeFactory {
	
	public Shape getInstance(String type) {
		
		if(type.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}else if(type.equalsIgnoreCase("Square")) {
			return new Square();
		}else if(type.equalsIgnoreCase("Triangle")){
			return new Triangle();
		}else {
			return null;
		}
			
		
	}

	
}
