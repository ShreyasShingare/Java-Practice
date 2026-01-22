package InterfacesEx;

public class Smartphone implements Computer {
	
	public String name = "Mobile";
	
	public void display() {
		System.out.println("This is a Smartphone computer");
	}
	
	public String getName() {
		return this.name;
	}

}
