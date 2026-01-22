package InnerClassEx;

import InnerClassEx.Outer.Inner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is Main Function");
		System.out.println("-----------------");
		
		Outer out = new Outer();
		
		System.out.println(out.outStr);
		
		Outer.Inner in = out.new Inner();
		
		System.out.println(in.inStr);

	}

}
