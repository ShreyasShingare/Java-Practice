package lambdaTempConverterEx;

public class Main {
	public static void main(String args[]) {
		
		TemperatureConverter toFahrenheit = (double cel) -> {
			return (cel * 1.8 +32);
		};
		
		System.out.println("40 C to fahrenheit is "+ toFahrenheit.convert(40));
		
		
	}

}
