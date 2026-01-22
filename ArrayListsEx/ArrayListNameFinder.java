package ArrayListsEx;
import java.util.*;

public class ArrayListNameFinder {
	public static void main(String args[]) {
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Tony");
		arr.add("Loki");
		arr.add("Thor");
		arr.add("Steve");
		arr.add("Natasha");
		arr.add("Clint");
		arr.add("Bruce");
		
		String toFind = "Clint";
		int flag = 0;
		for(String s : arr) {
			if(toFind.equals(s)) {
				System.out.println("Found at "+arr.indexOf(s));
				flag = 1;
			}
			
		}
		if(flag == 0) {
			System.out.println("Not in List");
		}
		
		//---------------------------------
		
		int indexOfToFind = arr.indexOf(toFind);
		if(indexOfToFind >= 0) {
			System.out.println("Found at "+ indexOfToFind);
		}
		else {
			System.out.println("Not found");
		}
		
		
		
	}

}
