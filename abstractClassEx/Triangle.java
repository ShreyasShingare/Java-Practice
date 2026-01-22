<<<<<<< HEAD
package abstractClassEx;

public class Triangle {
	
	int base;
	int height;
	
	public double getArea() {
		return (0.5 * base * height);
	}
	
	public double getPerimeter() {
		double halfBase = base/2;
		double side = Math.sqrt((height*height)+(halfBase*halfBase));
		return 2*side+base;
	}
	
	public void display() {
		System.out.println("This shape is a Triangle");
	}
	
	Triangle(int b,int h){
		this.base = b;
		this.height = h;
	}

}
=======
package abstractClassEx;

public class Triangle {
	
	int base;
	int height;
	
	public double getArea() {
		return (0.5 * base * height);
	}
	
	public double getPerimeter() {
		double halfBase = base/2;
		double side = Math.sqrt((height*height)+(halfBase*halfBase));
		return 2*side+base;
	}
	
	public void display() {
		System.out.println("This shape is a Triangle");
	}
	
	Triangle(int b,int h){
		this.base = b;
		this.height = h;
	}

}
>>>>>>> 2302a8396686ba4c34bf67a4d777c4966259daed
