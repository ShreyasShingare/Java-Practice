package lambdaExpressionEx;

public class Main {
	
	public static void main(String args[]) {
		
		Calculator calcAdd = (a, b) -> a+b;
		
		Calculator calcSub = (a,b) -> a-b;
		
		Calculator calcMul = (a,b) -> a*b;
		
		Calculator calcDiv = (a,b) -> a/b;
			
		
		System.out.println("additon="+ calcAdd.operate(5, 4));
		
		System.out.println("subtraction="+calcSub.operate(10, 5));
		
		System.out.println("multiplication="+calcMul.operate(2, 4));
		
		System.out.println("division="+calcDiv.operate(10, 2));
		
		
		
	}

}
