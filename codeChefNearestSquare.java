//CodeChef Nearest Square
//------------------------------------------------//
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
		    int a=0;
		    for(int j=0;j*j<=n;j++){
		        a=j*j;
		    }
		    
		    System.out.println(a);
		}
		

	}
}
