public class Sample {
    public static void main(String[] args) {
        sol(5,3,5);
    }
    
    public static void sol(int a, int b, int n) {
        int ans = a;
        for (int i = 0; i < n; i++) {
            ans = ans + (mathpow(2, i)*b);
            System.out.print(ans + " ");
        }
        System.out.println(" ");
    }
    public static int mathpow(int b, int i) {
        if (i == 0) {
            return 1;
        }
        int rtn = 1;
        for (int j = 1; j <= i; j++) {
            rtn = rtn * b;
        }
        return rtn;
    }
}
