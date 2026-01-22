package InterfacesEx;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer desk = new Desktop();
		Computer lap = new Laptop();
		Computer mobile = new Smartphone();
		
		smartHub smartHub = new smartHub();
		
		Computer smartWatch = new smartWatch() {
			public void display() {
				System.out.println("This is a smart watch");
			}
			
		};
		
		smartHub.connectDevice(desk);
		smartHub.connectDevice(lap);
		smartHub.connectDevice(mobile);
		smartHub.display();
		System.out.println(smartHub.getClass());
		System.out.println(smartHub.getName());
		smartWatch.display();
		System.out.println("---------------------");
		smartHub.getCurrentlyConnected();

	}

}
