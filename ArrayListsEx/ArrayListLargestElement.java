package ArrayListsEx;
import java.util.*;

public class ArrayListLargestElement {
	public static void main(String args[]) {
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(5);
		nums.add(4);
		nums.add(56);
		nums.add(23);
		nums.add(99);
		
		System.out.println(nums);
		
		int max = Integer.MIN_VALUE;
		
		for(int i : nums) {
			if(i > max) {
				max = i;
			}
		}
		
		System.out.println("max = "+max);
		
	}
	

}
