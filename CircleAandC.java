
import java.util.*;

public class CircleAandC {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Area - 1 /Circumfrence - 2 \nEnter 1/2 as shown above : ");
        int op = scan.nextInt();

        System.out.print("Enter the Radius : ");
        float radius = scan.nextFloat();

        switch(op){
            case 1 : 
                Area(radius);
                break;
            case 2 : 
                Circumfrence(radius);
                break;
            default : 
                System.out.print("Invalid answer");
                break;
        }  
        
    }

    public static void Circumfrence(float radius){
        double ans = (2*radius*22)/7;
        System.out.println("The circumfrence is : "+ans);
    }

    public static void Area(float radius){
        double ans = (22*radius*radius)/7;
        System.out.println("The area is : "+ans);
    }
    
}
