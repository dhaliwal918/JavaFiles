import java.util.*;
public class perimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        float length = sc.nextFloat();
        System.out.print("Enter the breadth : ");
        float breadth = sc.nextFloat();
        float ans = PerOfRec(length,breadth);
        System.out.println("The ans is : "+ans);
    }
    public static float PerOfRec(float length , float breadth){
        return 2*(length+breadth);
    }
}
