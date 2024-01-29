import java.util.*;

public class leastCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number : ");
        int num2 = sc.nextInt();
        int ans = LCM(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is : " + ans);
    }

    public static int LCM(int num1, int num2) {
        for(int i = 1; ; i++){
            if((i%num1==0)&&(i%num2==0)){
                return i;
            }
        }
    }
}
