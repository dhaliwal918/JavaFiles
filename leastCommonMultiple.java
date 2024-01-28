import java.util.*;

public class leastCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number : ");
        int num2 = sc.nextInt();
        int ans = LCM(num1, num2);
        System.out.println("The LCM of " + num1 + " ans " + num2 + " is : " + ans);
    }

    public static int LCM(int num1, int num2) {
        int ans = 1;
        int var = num1+num2;
        for (int i = 2; i <= var; i++) {
            if (primeornot(i) == 1) {
                System.out.println("The value of i = "+i);
                while (num1%i==0||num2%i==0) {
                    if(num1%i==0){
                        ans = ans * i;
                        num1 = num1/i;
                        System.out.println(num1);
                    }
                    if(num2%i==0){
                        ans = ans * i;
                        num2 = num2/i;
                        System.out.println(num2);
                    }
                }
            }
        }
        return ans;
    }

    public static int primeornot(float n) {
        int number = 2;
        for (;;) {
            if (n == 2) {
                return 1;
            }
            if (n % number == 0) {
                return 0;
            }
            number++;
            if (number == n) {
                break;
            }
        }
        return 1;
    }
}
