import java.util.*;
public class fun1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What you find? (Distance/time/Speed)");
        String operator = scan.nextLine();
        float time , speed , distance ;
        switch (operator) {
            case "Distance":
                System.out.print("Enter the Speed : ");
                speed = scan.nextFloat();
                System.out.print("Enter the Time : ");
                time = scan.nextFloat();
                distance = speed*time ;
                System.out.println("Distance is" + distance);
                break;
            case "Time":
                System.out.print("Enter the Distance : ");
                distance = scan.nextFloat();
                System.out.print("Enter the Speed : ");
                speed = scan.nextFloat();
                time = distance/speed ;
                System.out.println("Time is" + time);
                break;
            case "Speed":
                System.out.print("Enter the distance : ");
                distance = scan.nextFloat();
                System.out.print("Enter the Time : ");
                time = scan.nextFloat();
                speed = distance/time ;
                System.out.println("Speed is" + speed);
                break;
            default:
                System.out.println("Invalid operator!!");
                break;
        }
    }
}
