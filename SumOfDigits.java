import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = SOD(num);
        System.out.println(sum);
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
