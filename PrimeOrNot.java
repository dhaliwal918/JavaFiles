import java.util.*;
public class PrimeOrNot {
    public static void primeornot(float n){
        int number = 2;
        for(;;){
            if(n==2){
                System.out.println("The number is Prime");
                return;
            }
            if(n%number==0){
                System.out.println("The number is not prime");
                return;
            }
            number++;
            if(number==n){
                break;
            }
        }
        System.out.println("The number is prime");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        float n = sc.nextFloat();
        primeornot(n);
    }
}