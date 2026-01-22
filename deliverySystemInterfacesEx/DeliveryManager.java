package deliverySystemInterfacesEx;

import java.util.ArrayList;

public class DeliveryManager {
	
	ArrayList<Deliverable> items = new ArrayList<>();
	
	public void getItemsInProgress() {
		System.out.println("Below deliveries are in progress");
		for(Deliverable d : items) {
			System.out.println(d.getName());
		}
	}
	
	public void processDelivery(Deliverable d) {
		d.prepare();
		d.dispatch();
		d.track();
		items.add(d);
		System.out.println("---------");
	}

}
