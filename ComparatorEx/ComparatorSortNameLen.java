package ComparatorEx;
import java.util.*;

public class ComparatorSortNameLen {
	public static void main(String[] args) {
		
		Comparator<String> com = new Comparator<>() {

			@Override
			public int compare(String i, String j) {
				if(i.length() > j.length()) {
					return 1;
				}
				else {
					return -1;
				}
			}
			
		};
		
		List<String> names = new ArrayList<>();
		
		names.add("Eva");
		names.add("Daniel");
		names.add("tony");
		names.add("clint");
		names.add("natasha");
		names.add("Steve");
		
		Collections.sort(names,com);
		
		System.out.println(names);
		
		List<String> fruit = new ArrayList<>();
		
		
		fruit.add("apple");
		fruit.add("Pear");
		fruit.add("Apple");
		
		Collections.sort(fruit);
		
		System.out.println(fruit);

		
	}

}
