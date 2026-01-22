package InterfacesEx;

import java.util.ArrayList;
import java.util.List;

public class smartHub implements Computer {
	
	ArrayList<Computer> connectedDevices = new ArrayList<Computer>();
	
	public void display() {
		System.out.println("This is the smart hub");
	}
	
	public void connectDevice(Computer device) {
		System.out.println(device.getName()+" is connected to smart device hub");
		connectedDevices.add(device);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "This is the smartHub";
	}
	
	public void getCurrentlyConnected() {
		System.out.println("Currently connected devices are:");
		for (Computer device : connectedDevices){
			System.out.println(device.getName());
		}
	}
	
	

}
