package ArrayListsEx;
import java.util.*;

public class ArrayListSumElements {
	public static void main(String args[]) {
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		int sum = 0;
		
		for(int i : arr) {
			sum += i;
		}
		
		System.out.println("Sum = "+ sum);
		
		
		
		
	}

}
