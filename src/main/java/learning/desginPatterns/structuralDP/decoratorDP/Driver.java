package learning.desginPatterns.structuralDP.decoratorDP;

import learning.desginPatterns.creationalDP.factoryDP.Rectangle;
import learning.desginPatterns.creationalDP.factoryDP.Triangle;

public class Driver {

	public static void main(String[] args) {
		   Shape triangle = new Triangle();
           Shape redTriangle = new RedColorDecorator(new Triangle());
           Shape redRectangle = new RedColorDecorator(new Rectangle());
         
           // Draw normal triangle
           triangle.draw();
           System.out.println(".........");
           
           // make the triangle red
           redTriangle.draw();
           System.out.println(".........");
           
           // make the rectangle red
           redRectangle.draw();
           System.out.println(".........");

	}

}
