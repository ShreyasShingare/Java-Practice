package SetContactListSystem;

public class Contact {
	
	public String name;
	public String phoneNumber;
	
	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return (name + " : " + phoneNumber);
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Contact)) return false;
		Contact other = (Contact) obj;
		if(this.phoneNumber.equals(other.phoneNumber)) {
			System.out.println("same number found, cant add duplicate");
		}
		return this.phoneNumber.equals(other.phoneNumber);
	}
	
	public int hashCode() {
		return phoneNumber.hashCode();
	}

}
