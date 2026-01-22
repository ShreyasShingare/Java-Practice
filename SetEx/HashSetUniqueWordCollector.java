package SetEx;
import java.util.*;

public class HashSetUniqueWordCollector {
	public static void main(String args[]) {
		
		String sentence = "Hello this is a sample sentence. The sentence will be used for demonstrating hash set collection in java. Hash set stores unique but unsorted values. It is faster than treeset.";
		
		ArrayList<String> arr = new ArrayList<>();
		
		String[] words = sentence.split(" ");  //parameter takes delimiter to split on
		
		System.out.println("words count: "+words.length);
		
		Set<String> wordSet = new HashSet<>();
		
		for(String s : words) {
			//System.out.println(s);
			
			//String clean = 
					s.replaceAll("[^a-zA-Z]", "").toLowerCase();
			//^=not
			//a-zA-Z = anything that is not alphabets
			//replaces them with empty string
			
			//System.out.println(clean);
			wordSet.add(s);
		}
		
		System.out.println("Set words count: "+wordSet.size());
		
		System.out.println(wordSet);
		
		
		
		
	}

}
