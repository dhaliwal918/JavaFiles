package Not_Complete;
import java.util.*;
public class printPrimeNumber {
    public static int primeornot(float n){
        int number = 2;
        for(;;){
            if(n==2){
                return 1;
            }
            if(n%number==0){
                return 0;
            }
            number++;
            if(number==n){
                break;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        float n = sc.nextFloat();
        for(int i=2;i>=n;n++){
            int permission = primeornot(i);
            if(permission==1){
                System.out.println(i);
            }
        }
    }
}