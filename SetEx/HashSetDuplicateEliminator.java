package SetEx;
import java.util.*;

public class HashSetDuplicateEliminator {
	public static void main(String args[]) {
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,3,2,1,4,2,3,5,1,2,3,4));
		
		Set<Integer> numSet = new HashSet<>(arr);
		
		System.out.println(numSet);
		
		
		
		
	}

}
