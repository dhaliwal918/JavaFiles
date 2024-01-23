import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class HackerrrankProblem {
    public static void sol(int a, int b, int n ) {
        int ans = a;
        for (int i = 0; i < n; i++) {
            ans = ans + (mathpow(pnum, i) * b);
            System.out.print(ans + " ");
        }
        System.out.println(" ");
    }
    public static int mathpow(int b, int i) {
        if(i==0){
            return 1;
        }
        int rtn = 1;
        for(int j = 1 ; j<=i ; j++){
            rtn = rtn * b;
        }
        return rtn;
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Read the number of queries
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Process each query
        for (int i = 0; i < q; i++) {
            // Read the values for each query
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            // Generate and print the series for the current query
            sol(a, b, n);
        }

        scanner.close();
    }
}