package deliverySystemInterfacesEx;

public class Parcel implements Deliverable{
	
	String itemName = "Parcel";
	
	enum state {
		preparation,
		dispatched,
		trackable
		};
	
	public void prepare() {
		//System.out.println("Packing the parcel in a box...");
		state presentState = state.preparation;
	}
	
	public void dispatch() {
		//System.out.println("Parcel dispatched to courier partner...");
		state presentState = state.dispatched;
	}
	
	public void track() {
		//System.out.println("Parcel tracking number is 1234...");
		state presentState = state.trackable;
	}
	
	public String getName() {
		return this.itemName;
	}
	
	public void hello() {
		System.out.println("hello");
	}

}
