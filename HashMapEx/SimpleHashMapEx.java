package HashMapEx;
import java.util.*;

public class SimpleHashMapEx {
	public static void main(String args[]) {
		
		
		Map<String, String> Countries = new HashMap<>();
		
		Countries.put("India", "Delhi");
		Countries.put("China", "Beijing");
		Countries.put("Nepal", "Kathmandu");
		Countries.put("Pakistan", "Karachi");
		Countries.put("Ireland", "Dublin");
		Countries.put("Canada", "Toronto");
		Countries.put("Netherlands", "Amsterdam");
		
		System.out.println(Countries);
		
		for(String i : Countries.keySet()) {
			System.out.println(i+" : "+Countries.get(i));
		}
		
	}

}
