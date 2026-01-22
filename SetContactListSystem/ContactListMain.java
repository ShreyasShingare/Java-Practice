package SetContactListSystem;
import java.util.*;

public class ContactListMain {
	public static void main(String args[]) {
		
		Set<Contact> contactList = new HashSet<>();
		
		contactList.add(new Contact("Tony", "123456789"));
		contactList.add(new Contact("Steve", "12545659"));
		contactList.add(new Contact("Steve", "12545659"));
		
		System.out.println(contactList);
		
		
		
		
		
	}

}
