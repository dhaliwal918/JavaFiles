import java.util.*;
public class Evennumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n  = sc.nextInt();
        for(int  i = 1;i<=n;i++){
            if(i%2==0){
                System.out.println("The even number is "+i);
            }
        }
    }
}