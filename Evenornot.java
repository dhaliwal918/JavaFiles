import java.util.*;
public class Evenornot {
    public static void evenornot(int n){
        if(n%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is not even");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        evenornot(n);
    }
}
