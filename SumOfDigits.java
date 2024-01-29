import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int sum = SOD(num);
        System.out.println("The sum of digits is : " +sum);
    }
    public static int SOD(int num){
        int sum = 0;
        while(num>0){
            sum = sum + num%10;
            num =(int) num/10;
        }
        return sum;
    }
}
