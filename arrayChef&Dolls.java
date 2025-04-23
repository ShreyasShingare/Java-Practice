import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		for(int i=0;i<testCases;i++){
		    int n = sc.nextInt();
		    HashMap<Integer,Integer> dolls = new HashMap<>();
		    for(int j=0;j<n;j++){
		        int dollType = sc.nextInt();
		        if(dolls.containsKey(dollType)){
		            dolls.put(dollType, dolls.get(dollType)+1);
		        }
		        else{
		            dolls.put(dollType, 1);
		        }
		    }
		    
		    for(int d : dolls.keySet()){
		        if(dolls.get(d)%2!=0){
		            System.out.println(d);
		        }
		    }
		    
  
		}

	}
}
