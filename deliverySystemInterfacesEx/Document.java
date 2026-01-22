package deliverySystemInterfacesEx;

public class Document implements Deliverable{
	
	String itemName = "Document";
	
	public void prepare() {
		System.out.println("Sealing document in envelope...");
	}
	
	public void dispatch() {
		System.out.println("Dispatching the document as express delivery...");
	}
	
	public void track() {
		System.out.println("Document tracking link...");
	}
	
	public String getName() {
		return this.itemName;
	}

}
