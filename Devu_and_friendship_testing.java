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
		    int friends = sc.nextInt();
		    Set<Integer> days = new HashSet<>();
		    //System.out.println("friends="+friends);
		    for(int j=0;j<friends;j++){
		        days.add(sc.nextInt());
		    }
		    
		    System.out.println(days.size());
		}
		

	}
}
