<<<<<<< HEAD
package abstractClassEx;

public class Rectangle extends shape {
	
	public int length;
	public int width;
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimeter() {
		return 2*(this.length+this.width);
	}
	
	Rectangle(int l, int w){
		this.length = l;
		this.width = w;
	}
	
	public void display() {
		System.out.println("This is a rectangle");
	}
	

}
=======
package abstractClassEx;

public class Rectangle extends shape {
	
	public int length;
	public int width;
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimeter() {
		return 2*(this.length+this.width);
	}
	
	Rectangle(int l, int w){
		this.length = l;
		this.width = w;
	}
	
	public void display() {
		System.out.println("This is a rectangle");
	}
	

}
>>>>>>> 2302a8396686ba4c34bf67a4d777c4966259daed
