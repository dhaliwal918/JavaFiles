import java.util.*;
public class Fibonnacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        fibonnacci(n);
    }

    public static void fibonnacci(int n) {
        System.out.println("Here is the Fibonacci series");
        int first = 0;
        int second = 1;
        int var = 0;
        if(n>=1){
            System.out.print(first + " ");
        }
        if(n>=2){
            System.out.print(second + " ");
        }
        if(n==1||n==2){
            return;
        }
        for(int i=3 ; i<=n ; i++){
            var = second;
            second += first;
            first = var;
            System.out.print(second  + " ");
        }
    }
}
