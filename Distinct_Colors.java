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
		    int[] myArr = new int[n];
		    int max = 0;
		    for(int j=0;j<n;j++){
		        myArr[j] = sc.nextInt();
		        if(myArr[j] > max){
		            max = myArr[j];
		        }
		    }
		    System.out.println(max);
		}

	}
}
