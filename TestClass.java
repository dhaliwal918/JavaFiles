import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(primeornot(n));
        while (n != 918) {
            n = sc.nextInt();
            System.out.println(primeornot(n));
        }
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
