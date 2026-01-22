package InterfacesEx;

public class Laptop implements Computer {
	
	public String name = "Laptop";
	
	public void display() {
		System.out.println("This is a Laptop");
	}
	
	public String getName() {
		return this.name;
	}

}
