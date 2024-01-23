import java.util.*;
public class PercentageFromFiveSubject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks : ");
        double m1 = sc.nextFloat();
        System.out.print("Enter marks : ");
        double m2 = sc.nextFloat();
        System.out.print("Enter marks : ");
        double m3 = sc.nextFloat();
        System.out.print("Enter marks : ");
        double m4 = sc.nextFloat();
        System.out.print("Enter marks : ");
        double m5 = sc.nextFloat();
        double sum = m1+m2+m3+m4+m5;
        double percentage = sum/500*100;
        System.out.println("The percentage of marks is : " + percentage);
    }
}
