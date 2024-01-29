import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        boolean prOrNot = primeornot(n);
        System.out.println(prOrNot);
    }
    public static boolean primeornot(int n){
        if(n==2){
            return true;
        }
        for(int i = 2 ; i<n/2 ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}