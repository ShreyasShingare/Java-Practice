package ThreadsTrafficManagementEx;

public class TrafficMgtMain {
	public static void main(String args[]) {
		
		NorthStreet ns = new NorthStreet();
		EastStreet es = new EastStreet();
		WestStreet ws = new WestStreet();
		SouthStreet ss = new SouthStreet();
		
		ns.start();
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("NorthStreet Stop");
		//----------------------------------------
		es.start();
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("EastStreet Stop");
		//----------------------------------------
		ws.start();
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("WestStreet Stop");
		//----------------------------------------
		ss.start();
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("SouthStreet Stop");
		//----------------------------------------
		
		System.out.println("Done..");
		
		
	}

}
