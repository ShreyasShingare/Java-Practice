package HashMapEx;
import java.util.*;

public class HashMapWordFreq {
	public static void main(String[] args) {
		
		String sentence = "The quick brown fox jumps over the lazy dog.";
		
		Map<String, Integer> wordFrequency = new HashMap<>();
		
		String[] arr = sentence.split(" ");
		
		for(String i : arr) {
			
			//i.replaceAll("[^a-zA-Z]", "").toLowerCase();
			
			if(wordFrequency.containsKey(i)) {
				wordFrequency.put(i, wordFrequency.get(i)+1);
			}
			else {
				wordFrequency.put(i, 1);
			}
		}
		
		System.out.println(wordFrequency);
		
		
		
		
	}

}
