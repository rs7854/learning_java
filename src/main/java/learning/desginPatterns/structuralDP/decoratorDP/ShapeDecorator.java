package learning.desginPatterns.structuralDP.decoratorDP;

public abstract class ShapeDecorator implements Shape{
	
	protected Shape shapeDecorated;
	
	public ShapeDecorator(Shape shapeDecorated) {
		this.shapeDecorated = shapeDecorated;
	}

	public void draw() {
		shapeDecorated.draw();
	}

}
