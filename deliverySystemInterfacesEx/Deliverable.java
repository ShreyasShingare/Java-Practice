package deliverySystemInterfacesEx;

import java.util.ArrayList;

public interface Deliverable {
	
	public void prepare();
	
	public void dispatch();
	
	public void track();
	
	public String getName();

}
