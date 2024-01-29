import java.util.*;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number : ");
        int num2 = sc.nextInt();
        int ans = GCD(num1, num2);
        System.out.println("The Greatest common divisor of " + num1 + " and " + num2 + " is : " + ans);
    }
    public static int GCD(int num1,int num2){
        int ans = 0;
        int loopRange = SNBTN(num1,num2);
        for(int i = 1;i<=loopRange;i++){
            if((num1%i==0)&&(num1%i==0)){
                ans = i;
            }
        }
        return ans;
    }
    public static int SNBTN(int num1,int num2){
        if (num1<num2) {
            return num1;
        }else{
            return num2;
        }
    } 
}
