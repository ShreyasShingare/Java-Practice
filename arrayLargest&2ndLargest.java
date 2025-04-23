import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int max = -999;
            int max2 = -999;
            
            for(int i : a){
                if(i > max){
                    max2 = max;
                    max = i;
                }
                else if(i > max2 && i != max){
                    max2 = i;
                }
                //System.out.println("max="+max+ " max2="+max2);
                
                
        }
        System.out.println(max+max2);
    }
}}
