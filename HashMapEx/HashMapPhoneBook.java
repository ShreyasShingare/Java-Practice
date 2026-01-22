package HashMapEx;
import java.util.*;

public class HashMapPhoneBook {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> phoneBook = new HashMap<>();
		
		phoneBook.put("Tony", "1234567890");
		phoneBook.put("Steve", "1325678321");
		phoneBook.put("Thor", "8291928384");
		phoneBook.put("Loki", "5637189094");
		phoneBook.put("Bruce", "1825678432");
		
		System.out.println(phoneBook);
		
		System.out.print("Enter name to find: ");
		String nameToFind = sc.nextLine();
		
//		int flag = 0;
//		
//		for(String s : phoneBook.keySet()) {
//			if(s.equals(nameToFind)) {
//				System.out.println(s+" : "+phoneBook.get(s));
//				flag = 1;
//			}
//		}
//		
//		System.out.println(flag != 1 ? "Not Found" : "DOne"); 
		
		if(phoneBook.containsKey(nameToFind)) {
			System.out.println(nameToFind+" : "+phoneBook.get(nameToFind));
		}
		else {
			System.out.println("Not Found");
		}
		
		
		
		
		
		
		
	}

}
