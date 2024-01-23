package Not_Complete;
public class Fibonnacci {
    public static int fib(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int fibsum = fib(n-1) + fib(n-2);
        return fibsum;
    }
    public static void main(String[] args){
        int n = 5;
        n = fib(n);
        System.out.println(n);
    }
}
