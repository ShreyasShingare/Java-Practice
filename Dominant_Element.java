import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    Map<Integer, Integer> nums = new HashMap<>();
		    for(int j=0;j<n;j++){
		        int temp = sc.nextInt();
		        if(nums.containsKey(temp)){
		            nums.put(temp, nums.get(temp)+1);
		        }
		        else{
		            nums.put(temp,1);
		        }
		    }
		    int maxFreq = 0;
		    int maxFreqCount = 0;
		    for(Map.Entry<Integer, Integer> entry : nums.entrySet()){
		        int count = entry.getValue();
		        if (count > maxFreq){
		            maxFreq = count;
		            maxFreqCount=1;
		        }
		        else if(count == maxFreq){
		            maxFreqCount++;
		        }
		        
		    }
		    System.out.println(maxFreqCount == 1 ? "YES" : "NO");

		}
	}
}
