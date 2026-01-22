public class sumOfDigitsRecursion{

    public int sumDigits(int num){
        if(num==0){
            return 0;
        }
        else{
            return num%10+sumDigits(num/10);
        }
    }

    public static void main(String args[]){
        
        int num = (args.length > 0) ? Integer.valueOf(args[0]) : 0;
        sumOfDigitsRecursion obj = new sumOfDigitsRecursion();
        System.out.println(obj.sumDigits(num));
    }
}