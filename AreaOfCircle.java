import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        float radius = sc.nextFloat();
        double area = (22*radius*radius)/7;
        System.out.println("The Area of cicle is : " + area);
    }
}
