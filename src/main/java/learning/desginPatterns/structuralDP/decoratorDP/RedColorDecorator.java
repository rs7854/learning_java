package learning.desginPatterns.structuralDP.decoratorDP;

public class RedColorDecorator extends ShapeDecorator {
	
	 public RedColorDecorator(Shape shapeDecorated)
     {
         super(shapeDecorated);
     }
	 
     @Override 
     public void draw()
     {
         shapeDecorated.draw();
         setRedBorder(shapeDecorated);
     }
     
     private void setRedBorder(Shape shapeDecorated)
     {
         System.out.println("Red color border added...");
     }

}
