package ArrayListsEx;
import java.util.*;

public class ArrayListReverse {
	public static void main(String args[]) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0;i<5;i++){
			arr.add(i);
		}
		
		System.out.println("original array: "+arr);
		
		ArrayList<Integer> revArr = new ArrayList<>();
		
		for(int i : arr) {
			revArr.add(0, i);
		}
		
		System.out.println("reversed array: "+revArr);
		
		System.out.println("Collections.reverse:");
		
		System.out.println("again reversing: "+revArr.reversed());
		
		
		
		
		
	}

}
