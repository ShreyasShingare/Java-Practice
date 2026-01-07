package ArrayListsEx;
import java.util.*;

public class ArrayListEvens {
	public static void main(String args[]) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0;i<100;i++) {
			arr.add(i);
		}
		
		System.out.println("Evens:");
		int count = 0;
		
		for(int i : arr) {
			if(i % 2 == 0) {
				System.out.print(i+", ");
				count++;
			}
			if(count == 5) {  //just for printing 5 in a row, so its easy to see
				System.out.println("");
				count = 0;
			}
		}
		
		
		
	}

}
