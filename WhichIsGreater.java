
import java.util.*;

public class WhichIsGreater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        float num1 = sc.nextInt();
        System.out.print("Enter the number : ");
        float num2 = sc.nextInt();
        float ans = wig(num1, num2);
        if(ans==0){

        }else{
            System.out.println(ans);
        }
    }
    public  static float wig(float n1 , float n2){
        if(n1>n2){
            return n1;
        }
        if(n1==n2){
            System.out.println("Both are Equal");
            return 0 ;
        }
        return n2;
    }
}
