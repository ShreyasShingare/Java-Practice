public class Recursion{

    public int multiplyMe(int num){
        if(num==1){
            return 1;
        }
        else{
            return num * multiplyMe(num-1);
        }
        
    }


    public static void main(String args[]){
        int number = Integer.valueOf(args[0]);
        Recursion obj = new Recursion();
        System.out.println(obj.multiplyMe(number));
    }
}