package Not_Complete;
import java.util.*;

public class calculatorLocker {
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
            if(142047==num){
                System.out.print("Enter the password : ");
                String password = sc.nextLine();
                if(password=="dhaliwal918"){
                    for(int i = 1; i<=5;i++){
                        System.out.println("Loading...");
                        for(int j=1;j<=9999;j++){
                        }
                    }
                    System.out.println("Opening Locker");
                    break;
                }
                else{
                    System.out.println("Wrong password!!!");
                    break;
                }
            }
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
