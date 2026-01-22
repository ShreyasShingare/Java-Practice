package ArrayListsEx;
import java.util.*;

public class ArrayListReplaceString {
	public static void main(String args[]) {
		
		ArrayList<String> arr = new ArrayList<>(Arrays.asList("apple","banana","orange","kiwi","apple","pomegranate","banana","apple","guava","kiwi","orange","guava","dragonfruit","passionfruit","grapes","watermelon","apple","banana"));
		
		System.out.println("Size of arr: "+arr.size());
		
		int bananaCount = 0;
		int appleCount = 0;
		
		for(String i : arr) {
			if(i.equals("banana")) { bananaCount++; }
			
			if(i.equals("apple")) { appleCount++; }
		}
		
		System.out.println("banana count: "+bananaCount);
		System.out.println("apple count: "+appleCount);
		
		System.out.println("Replacing...");
		int replaceCount = 0;
		
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).equals("apple")) {
				arr.set(i, "banana");
				replaceCount++;
			}
		}
		
		System.out.println(replaceCount + " apples replaced with bananas");
		
	}

}
