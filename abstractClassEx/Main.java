package abstractClassEx;
import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String args[]) {
	
	Rectangle rect = new Rectangle(5, 4);
	
	Circle circ = new Circle(5);
	
	Triangle tri = new Triangle(5,4);
	
	System.out.println("Hello this is shapes class");
	
	shape r1 = new Rectangle(5,4);
	
	rect.display();
	System.out.println("Area of Rectangle = "+rect.getArea());
	System.out.println("Perimeter of Rectangle = "+rect.getPerimeter());
	System.out.println("-------------------");
	
	circ.display();
	System.out.println("Area of Circle = "+circ.getArea());
	System.out.println("Perimeter of Circle = "+circ.getPerimeter());
	System.out.println("-------------------");
	
	tri.display();
	System.out.println("Area of Triangle = "+tri.getArea());
	System.out.println("Perimeter of Triangle = "+tri.getPerimeter());
	System.out.println("-------------------");
	
	//System.out.println("display method of shape = "+rect.display());
	
	circ.display();
	

}

}