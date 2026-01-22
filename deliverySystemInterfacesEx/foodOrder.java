package deliverySystemInterfacesEx;

public class foodOrder implements Deliverable{
	
	String itemName = "food";
	
	public void prepare() {
		System.out.println("Restaurant is preparing the food...");
	}
	
	public void dispatch() {
		System.out.println("Food handed over to rider...");
	}
	
	public void track() {
		System.out.println("Food will be delivered in 10 mins...");
	}
	
	public String getName() {
		return this.itemName;
	}

}
