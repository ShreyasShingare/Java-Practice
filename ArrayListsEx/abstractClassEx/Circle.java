package abstractClassEx;

public class Circle extends shape {
	
	public int radius;
	
	public double getArea() {
		return 3.14*this.radius*this.radius;
	}
	
	public double getPerimeter() {
		return 2*3.14*(this.radius);
	}
	
	public Circle(int r) {
		this.radius = r;
	}
	
	public void display() {
		System.out.println("This shape is a circle");
	}

}
