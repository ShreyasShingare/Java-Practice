package BinarySearch;

public class BinarySearchMain {
	public static void main(String[] args) {
		
		int[] arr = {-1,0,3,5,9,12};
		int target = 9;
		
		BinarySearch bs = new BinarySearch();
		
		int result = bs.binarySearch(arr, target);
		
		System.out.println("result = "+(result >= 0 ? "Found at "+result : "Not Found"));
		
		
		
	}

}
