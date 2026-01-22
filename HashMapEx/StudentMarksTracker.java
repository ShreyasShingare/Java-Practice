package HashMapEx;
import java.util.*;

public class StudentMarksTracker {
	public static void main(String[] args) {
		
		Map<String, Integer> marks = new HashMap<>();
		
		marks.put("Tony", 85);
		marks.put("Steve", 89);
		marks.put("Thor", 91);
		marks.put("Loki", 69);
		marks.put("Bruce", 88);
		
		System.out.println(marks);
		
		marks.put("Thor", marks.get("Thor")+5);  //extra marks for good handwriting
		
		System.out.println(marks);
		
		marks.remove("Tony");
		
		System.out.println(marks);  //dropout due to fathers business
		
		
	}

}
