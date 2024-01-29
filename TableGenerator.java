import java.util.*;

public class TableGenerator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i<=10 ; i++){
            System.out.println(num + " + "+ i + " = "+(i*num));
        }
    }
}