import java.util.*;
public class ReverseOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int ans = ROD(n);
        System.out.println("The reverse of number is : "+ans);
    }
    public static int ROD(int num){
        if(num%10==0){
            num /= 10;
        }
        int digit = 0;
        int newNum = 0;
        while(num>0){
            newNum*=10;
            digit = num%10;
            num =(int) num / 10;
            newNum +=digit;
        }
        return newNum;
    }
}
