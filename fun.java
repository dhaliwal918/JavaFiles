import java.util.Scanner;

public class fun {
    public static void main(String[] args){
        int i = 0;
        int condition;
        Scanner sc  = new Scanner(System.in);
        do{
            i++;
            System.out.print("Enter the value(0/1) : ");
            condition = sc.nextInt();
            
        }while(condition==1||i!=100);
        if(i>90){
            System.out.println("This is Good");
        }
        else if(i>60){
            System.out.println("This is also good");
        } else {
            System.out.println("This is Good as Well");
        }
        System.out.println(i);
    }
}
