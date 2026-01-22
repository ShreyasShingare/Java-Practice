package deliverySystemInterfacesEx;

public class Main {
	
	public static void main(String args[]) {
		
		Deliverable parcelOne = new Parcel();
		
		Deliverable DocumentOne = new Document();
		
		Deliverable snacks = new foodOrder();
		
		DeliveryManager dm = new DeliveryManager();
		
		((Parcel) parcelOne).hello();
		
		dm.processDelivery(parcelOne);
		dm.processDelivery(DocumentOne);
		dm.processDelivery(snacks);

		dm.getItemsInProgress();
		
		
	}

}
