package Exercise_of_java_1;
import java.util.*;

public class ExponetialPower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.print("Enter the Exponential power : ");
        int power = sc.nextInt();
        double ans = 1;
        for(int i = 1  ; i<=power ; i++ ){
            if(power==0){
                ans = 1;
                break;
            }
            ans = ans * number;
        }
        System.out.println("The answer is : "+ans);
    }
}
