package lambdaEvenOddEx;

public class Main {
	
	public static void main(String args[]) {
		
		EvenOdd eoChecker = (int num) -> {
			if(num%2==0) {
				System.out.println(num+" is Even");
			}
			else {
				System.out.println(num+" is Odd");
			}
		};
		
		eoChecker.evenOrOdd(2);
		eoChecker.evenOrOdd(3);
		eoChecker.evenOrOdd(15);
		
		
		
	}

}
