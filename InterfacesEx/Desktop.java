package InterfacesEx;

public class Desktop implements Computer {
	
	public String name = "Desktop";
	
	public void display() {
		System.out.println("This is a Desktop computer");
	}
	
	public String getName() {
		return this.name;
	}

}
