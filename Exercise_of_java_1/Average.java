package Exercise_of_java_1;
import java.util.*;
public class Average {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        float n1 = num.nextInt();
        System.out.print("Enter the number : ");
        float n2 = num.nextInt();
        System.out.print("Enter the number : ");
        float n3 = num.nextInt();
        float average = avg(n1,n2,n3);
        System.out.println("The Average of two number is : " + average);
    }
    public static float avg(float n1 , float n2 , float n3){
        return (n1+n2+n3)/3 ;
    }
}
