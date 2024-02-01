
import java.util.*;


public class SumOfOddNumberToN {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the number of n : ");
        int number = n.nextInt();
        int answer = odd1tn(number);
        System.out.println("The Sum of 1-"+number + " is : " + answer);
    }
    public static int odd1tn(int n){
        int sum = 0;
        for(int i = 1 ; i<=n ; i++){
            if(i%2==1){
                sum = sum + i;
            }
        }
        return sum;
    }
}
