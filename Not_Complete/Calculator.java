package Not_Complete;
import java.util.*;
public class Calculator {
    public static void main(String[] args){
        int num=0;
        String op;
        int ans=0;
        Scanner sc= new Scanner(System.in);
        Scanner scan= new Scanner(System.in);
        for(;;){
            num = ans;
            System.out.print("Enter the number : ");
            num = sc.nextInt();
            System.out.print("Enter the operator(add,minus,multiply,divide,Stop) : ");
            op = scan.next();
            if(op=="add"){
                ans = ans + num;
            }else if(op=="minus"){
                ans = ans - num;
            }else if(op=="multiply"){
                ans = ans*num;
            }else if(op=="divide"){
                ans = ans/num;
            }else{
                System.out.println("Your ans is "+ans);
                break;
            }
        }
    }
}
