package ThreadsSubwaySimulator;

public class SubwaySimMain {
	public static void main(String args[]) {
		
		String[] redLineStations = {"Central", "City Park", "Museum", "Stadium"};
		String[] greenLineStations = {"Harbour","Theatre","Library","Market"};
		String[] blueLineStations = {"Airport","TechPark","Garden","University"};
		
		Thread redLine = new SubwayLine("redLine", redLineStations);
		Thread greenLine = new SubwayLine("greenLine", greenLineStations);
		Thread blueLine = new SubwayLine("blueLine", blueLineStations);
		
		redLine.start();
		greenLine.start();
		blueLine.start();
		
		
	}

}
