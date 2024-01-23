import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.math.BigInteger bigInt;
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            String input = sc.next();
            bigInt = new java.math.BigInteger(input);
            if (bigInt.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0
                    && bigInt.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) {
                System.out.println("Hello world");
            }
        }
    }
}
