import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		
		for(int i=0;i<t;i++){
		    Map<Integer,Integer> nums = new HashMap<>();
		    int n = sc.nextInt();
		    for(int j=0;j<n;j++){
		        int val=sc.nextInt();
		        if(nums.containsKey(val)){
		            nums.put(val,nums.get(val)+1);
		        }
		        else{
		            nums.put(val,1);
		        }
		    }
		    
		    int maxVal = Collections.max(nums.values());
		    System.out.println(n-maxVal);
		    
		}

	}
}
