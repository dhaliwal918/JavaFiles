
import java.util.*;

public class VoteOrNot {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = scan.nextInt();
        von(age);
    }

    public static void von(int age){
        if(age<18){
            System.out.println("You can't Vote");
        }
        else{
            System.out.println("You can vote");
        }
    }
}
