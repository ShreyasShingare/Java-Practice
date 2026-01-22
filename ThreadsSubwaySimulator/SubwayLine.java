package ThreadsSubwaySimulator;

public class SubwayLine extends Thread{
	
	private String lineName;
	private String[] stations;
	
	public SubwayLine(String lineName, String[] stations) {
		this.lineName = lineName;
		this.stations = stations;
	}
	
	public void run() {
		for(String station : stations) {
			System.out.println("["+this.getName()+"] "+lineName+" is at station "+station);
		}
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e) {
			System.out.println(lineName+" is delayed!");
		}
		
		System.out.println(lineName+" has completed its journey...");
	}

}
