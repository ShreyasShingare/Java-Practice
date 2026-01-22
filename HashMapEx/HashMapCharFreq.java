package HashMapEx;
import java.util.*;

public class HashMapCharFreq {
	public static void main(String[] args) {
		
		String sentence = "The quick brown fox jumps over the lazy dog.";
		
		Map<Character, Integer> charFrequency = new HashMap<>();
		
		char[] arr = sentence.toCharArray();
		
		for(char c : arr) {
			if(charFrequency.containsKey(c)) {
				charFrequency.put(c, charFrequency.get(c)+1);
			}
			else {
				charFrequency.put(c, 1);
			}	
		}
		
		System.out.println(charFrequency);
		
		
		
	}

}
