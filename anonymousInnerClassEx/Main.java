package anonymousInnerClassEx;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is Main method");
		
		Greeter g = new Greeter() {
			public void greetMe(String name){
				System.out.println("Hello "+name+" nice to meet you");
			}
		};
		
		g.greetMe("Shreyas");
		

	}

}
