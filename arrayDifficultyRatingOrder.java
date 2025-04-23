import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];
            
            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }
            
            // Your code goes here
            //array = d;
            //array length = n;
            int flag = 0;
            for(int i=1;i<n;i++){
                if(d[i] >= d[i-1]){
                    //System.out.println("d[i]="+d[i]);
                    continue;
                }
                else{
                    //System.out.println("d[i]="+d[i]);
                    flag = 1;
                }
                
            }
            
           System.out.println((flag==1) ? "No":"Yes");
            
            //System.out.println("----");
            
            
        }
    }
}
