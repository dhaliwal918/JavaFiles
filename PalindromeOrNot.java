import java.util.*;
public class PalindromeOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in program of Palindrome number or Not");
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        boolean Palindrome = PNON(num);
        if(Palindrome){
            System.out.println("The number is Palindrome Number");
        }else{
            System.out.println("The number is not Palindrome Number");
        }
    }
    public static boolean PNON(int num){
        int var = ROD(num);
        return var==num;
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