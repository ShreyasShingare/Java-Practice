package HashMapEx;
import java.util.*;

public class HashMapMergeMaps {
	public static void main(String[] args) {
		
		Map<String, Integer> MathsMarks = new HashMap<>();
		
		MathsMarks.put("Tony", 85);
		MathsMarks.put("Steve", 89);
		MathsMarks.put("Thor", 91);
		MathsMarks.put("Loki", 69);
		MathsMarks.put("Bruce", 88);	
		
		Map<String, Integer> ScienceMarks = new HashMap<>();
		
		ScienceMarks.put("Tony", 78);
		ScienceMarks.put("Steve", 67);
		ScienceMarks.put("Thor", 87);
		ScienceMarks.put("Bruce", 67);	
		
		for(String s : MathsMarks.keySet()) {
			if(ScienceMarks.containsKey(s)) {
				ScienceMarks.put(s, ScienceMarks.get(s)+MathsMarks.get(s));
			}
			else {
				ScienceMarks.put(s, MathsMarks.get(s));
			}
		}
		
		System.out.println(ScienceMarks);
		
		
		
		
		
	}

}
